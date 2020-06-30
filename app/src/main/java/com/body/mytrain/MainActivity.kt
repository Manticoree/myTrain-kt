package com.body.mytrain

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import de.hdodenhof.circleimageview.CircleImageView
import eu.davidea.flexibleadapter.FlexibleAdapter
import eu.davidea.flexibleadapter.items.IFlexible

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View

import com.body.mytrain.entities.AnotherTrainElement
import com.body.mytrain.entities.TrainElement
import com.body.mytrain.entities.bd.AppDatabase
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.main_sport_layout.*

import java.net.URI
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    val REQUEST_CODE_ASK_MULTIPLE_PERMISSIONS = 1

    //requests for runtime time permissions


    internal var WRITE_EXTERNAL_STORAGE_PERMISSION = android.Manifest.permission.WRITE_EXTERNAL_STORAGE



    /*
    @BindView(R.id.civMyPhoto)
    CircleImageView civMyPhoto;
*/

    private var persondb: AppDatabase? = null
    private var mContext: Context? = null


    val databaseList: List<IFlexible<*>>
        get() {
            val list = ArrayList<IFlexible<*>>()
            mContext?.let { TrainElement("1", R.string.train_in_gym, R.drawable.woman_in_gym_free, it) }?.let { list.add(it) }
            mContext?.let { TrainElement("2", R.string.train_in_street, R.drawable.train_in_street_free, it) }?.let { list.add(it) }
            mContext?.let { TrainElement("4", R.string.home_train, R.drawable.home_train_free, it) }?.let { list.add(it) }
            mContext?.let { TrainElement("5", R.string.train_jog, R.drawable.train_jog_free, it) }?.let { list.add(it) }
            return list
        }

    val anotherList: List<IFlexible<*>>
        get() {
            val list = ArrayList<IFlexible<*>>()
            mContext?.let { AnotherTrainElement("1", R.string.plane_food, R.drawable.plane_food_free, it) }?.let { list.add(it) }
            mContext?.let { AnotherTrainElement("2", R.string.run_train, R.drawable.another_train_run_free, it) }?.let { list.add(it) }
            mContext?.let { AnotherTrainElement("3", R.string.calculate_BGU, R.drawable.calculate_bgu_free, it) }?.let { list.add(it) }
            return list

        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_sport_layout)
        ButterKnife.bind(this)
        mContext = this
        /*
        persondb = Room.databaseBuilder(mContext!!, AppDatabase::class.java, "person-database")
                .build()

         */
        getFlexibleAdapter(rvSportLists, databaseList, LinearLayoutManager.VERTICAL)
        getFlexibleAdapter(rvAnotherTrain, anotherList, LinearLayoutManager.HORIZONTAL)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            val extras = data!!.extras
            /*
            if (extras != null) {
                Bitmap imageBitmap = (Bitmap) extras.get("data");
                getPhotoFromCamera(imageBitmap);
            } else {
                if (requestCode == OPEN_FILE) {
                    Uri choseFileUrl = data.getData();
                    if (choseFileUrl != null) {
                        getPhotoFromGallery(choseFileUrl);
                    }
                }
            }
            */

        }


    }


    private fun getFlexibleAdapter(recyclerView: RecyclerView,
                                   databaseList: List<IFlexible<*>>,
                                   orientation: Int) {
        val adapter: FlexibleAdapter<IFlexible<*>>
        recyclerView.setHasFixedSize(true)
        val manager = LinearLayoutManager(this,
                orientation, false)
        recyclerView.layoutManager = manager
        val items = databaseList
        adapter = FlexibleAdapter(items)
        adapter.addListener(this)
        recyclerView.adapter = adapter
    }

    /*
    @OnClick(R.id.civMyPhoto)
    void addPhoto(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.select_image);
        builder.setCancelable(true);
        builder.setNeutralButton(R.string.camera, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                takePictureFromCamera();
            }
        });
        builder.setPositiveButton(R.string.gallery, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                takePictureFromGallery();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

*/
    fun takePictureFromCamera() {
        val takePicturefromCamera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (takePicturefromCamera.resolveActivity(packageManager) != null) {
            startActivityForResult(takePicturefromCamera, REQUEST_IMAGE_CAPTURE)
        }
    }

    fun takePictureFromGallery() {
        val photoPickerIntent = Intent(Intent.ACTION_PICK)
        photoPickerIntent.type = "image/*"
        startActivityForResult(photoPickerIntent, REQUEST_IMAGE_CAPTURE)
    }

    companion object {

        internal val REQUEST_IMAGE_CAPTURE = 1
        private val OPEN_FILE = 300
    }
    /*
    public void getPhotoFromCamera(Bitmap pathToImage) {





        civMyPhoto.setImageBitmap(pathToImage);
    }

    public void getPhotoFromGallery(Uri uri) {
        Picasso.get()
                .load(uri.getPath())
                .into(civMyPhoto);
    }
*/

}
