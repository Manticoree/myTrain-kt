package com.body.mytrain.entities

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.body.mytrain.R
import com.body.mytrain.entities.LevelElement.MyViewHolder

import com.body.mytrain.mvp.trainprogram.view.TrainProgramActivity

import com.squareup.picasso.Picasso

import eu.davidea.flexibleadapter.FlexibleAdapter
import eu.davidea.flexibleadapter.items.AbstractFlexibleItem
import eu.davidea.flexibleadapter.items.IFlexible
import eu.davidea.viewholders.FlexibleViewHolder

class LevelElement(private val id: String, private val title: Int, private val uri: Int, private val mContext: Context) : AbstractFlexibleItem<MyViewHolder>() {

    private var positionElement: Int = 0

    override fun equals(inObject: Any?): Boolean {
        if (inObject is LevelElement) {
            val inItem = inObject as LevelElement?
            return this.id == inItem!!.id
        }
        return false
    }


    override fun hashCode(): Int {
        return id.hashCode()
    }


    override fun getLayoutRes(): Int {
        return R.layout.level_item
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

        holder.itemView.setOnClickListener {
            positionElement = position
            //  if(position == 0){
            goToTrainProgramActivity()
            //  }
        }


    }

    inner class MyViewHolder(view: View, adapter: FlexibleAdapter<*>) : FlexibleViewHolder(view, adapter) {
        var tvTitle: TextView
        var ivTrain: ImageView

        init {
            ivTrain = view.findViewById(R.id.ivPhotoTrainLevel)
            tvTitle = view.findViewById(R.id.tvLevelGrad)
        }


    }


    fun goToTrainProgramActivity() {
        val intent = Intent(mContext, TrainProgramActivity::class.java)
        intent.putExtra(POSITION_ELEMENT, positionElement)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        mContext.startActivity(intent)
    }

    companion object {

        val POSITION_ELEMENT = "positionElement"
    }
}
