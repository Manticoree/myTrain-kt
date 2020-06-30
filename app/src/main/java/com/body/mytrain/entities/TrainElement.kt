package com.body.mytrain.entities

import android.app.Activity
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.body.mytrain.R
import com.body.mytrain.constant.AppConstant
import com.body.mytrain.mvp.developwork.view.DevelopWorkActivity
import com.body.mytrain.mvp.gymdif.view.GymDiffActivity
import com.body.mytrain.mvp.trainhomeprogram.view.TrainHomeActivity
import com.body.mytrain.mvp.trainjogprogram.view.TrainJogProgramActivity
import com.body.mytrain.mvp.trainstreetprogram.view.TrainStreetProgramActivity
import com.squareup.picasso.Picasso

import eu.davidea.flexibleadapter.FlexibleAdapter
import eu.davidea.flexibleadapter.items.AbstractFlexibleItem
import eu.davidea.flexibleadapter.items.IFlexible
import eu.davidea.viewholders.FlexibleViewHolder

class TrainElement(private val id: String, private val title: Int, private val uri: Int, private val mContext: Context) : AbstractFlexibleItem<TrainElement.MyViewHolder>() {

    private var bundle: Bundle? = null

    override fun equals(inObject: Any?): Boolean {
        if (inObject is TrainElement) {
            val inItem = inObject as TrainElement?
            return this.id == inItem!!.id
        }
        return false
    }


    override fun hashCode(): Int {
        return id.hashCode()
    }


    override fun getLayoutRes(): Int {
        return R.layout.train_item
    }

    override fun createViewHolder(view: View, adapter: FlexibleAdapter<IFlexible<*>>): MyViewHolder {
        return MyViewHolder(view, adapter)
    }

    override fun bindViewHolder(adapter: FlexibleAdapter<IFlexible<*>>, holder: MyViewHolder,
                                position: Int,
                                payloads: List<Any>) {

        holder.tvTitle.setText(title)
        Picasso.get()
                .load(uri)
                .into(holder.ivTrain)

        holder.itemView.setOnClickListener { view ->
            if (position == AppConstant.ZERO) {
                goToGymActivity()
            } else if (position == AppConstant.ONE) {
                goToStreetActivity(view)
            } else if (position == AppConstant.TWO) {
                goToHomeActivity(view)
            } else if (position == AppConstant.THREE) {
                goToJogActivity(view)
            } else if (position == AppConstant.FOUR) {
                goToTechnicalWorkActivity()
            }
        }


    }

    inner class MyViewHolder(view: View, adapter: FlexibleAdapter<*>) : FlexibleViewHolder(view, adapter) {
        var tvTitle: TextView
        var ivTrain: ImageView

        init {
            ivTrain = view.findViewById(R.id.ivPhotoTrain)
            tvTitle = view.findViewById(R.id.tvTitle)


        }


    }

    fun goToGymActivity() {
        val intent = Intent(mContext, GymDiffActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        mContext.startActivity(intent)
    }

    fun goToStreetActivity(view: View) {

        transition(view)
        val intent = Intent(mContext, TrainStreetProgramActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        if (bundle == null) {
            mContext.startActivity(intent)
        } else {
            mContext.startActivity(intent, bundle)
        }
    }

    fun goToHomeActivity(view: View) {
        transition(view)
        val intent = Intent(mContext, TrainHomeActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        if (bundle == null) {
            mContext.startActivity(intent)
        } else {
            mContext.startActivity(intent, bundle)
        }
    }

    fun goToJogActivity(view: View) {
        transition(view)
        val intent = Intent(mContext, TrainJogProgramActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        if (bundle == null) {
            mContext.startActivity(intent)
        } else {
            mContext.startActivity(intent, bundle)
        }
    }

    fun goToTechnicalWorkActivity() {
        val intent = Intent(mContext, DevelopWorkActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        mContext.startActivity(intent)
    }

    fun transition(view: View?) {
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
            if (view != null) {
                val options = ActivityOptions.makeSceneTransitionAnimation(
                        mContext as Activity,
                        view,
                        mContext.getString(R.string.transition_train))
                bundle = options.toBundle()
            }
        }
    }

}
