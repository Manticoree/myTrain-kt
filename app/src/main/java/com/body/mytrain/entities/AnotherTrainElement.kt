package com.body.mytrain.entities

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.body.mytrain.R
import com.squareup.picasso.Picasso

import eu.davidea.flexibleadapter.FlexibleAdapter
import eu.davidea.flexibleadapter.items.AbstractFlexibleItem
import eu.davidea.flexibleadapter.items.IFlexible
import eu.davidea.viewholders.FlexibleViewHolder

class AnotherTrainElement(private val id: String, private val title: Int, private val uri: Int, private val mContext: Context) : AbstractFlexibleItem<AnotherTrainElement.MyViewHolder>() {

    override fun equals(o: Any?): Boolean {
        if (o is AnotherTrainElement) {
            val inItem = o as AnotherTrainElement?
            return this.id == inItem!!.id
        }
        return false
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

    override fun getLayoutRes(): Int {
        return R.layout.another_train_item
    }

    override fun createViewHolder(view: View, adapter: FlexibleAdapter<IFlexible<*>>): MyViewHolder {
        return MyViewHolder(view, adapter)
    }

    override fun bindViewHolder(adapter: FlexibleAdapter<IFlexible<*>>, holder: MyViewHolder, position: Int, payloads: List<Any>) {

        holder.tvTitle.setText(title)
        Picasso.get()
                .load(uri)
                .into(holder.ivTrain)
    }

    inner class MyViewHolder(view: View, adapter: FlexibleAdapter<*>) : FlexibleViewHolder(view, adapter) {

        var tvTitle: TextView
        var ivTrain: ImageView

        init {
            ivTrain = view.findViewById(R.id.ivAnotherPhoto)
            tvTitle = view.findViewById(R.id.tvAnotherTitle)

        }
    }

    fun goToRunActivity() {

    }
}
