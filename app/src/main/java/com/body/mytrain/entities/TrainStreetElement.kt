package com.body.mytrain.entities

import android.content.Context
import android.view.View
import android.widget.TextView

import com.body.mytrain.R

import eu.davidea.flexibleadapter.FlexibleAdapter
import eu.davidea.flexibleadapter.items.AbstractFlexibleItem
import eu.davidea.flexibleadapter.items.IFlexible
import eu.davidea.viewholders.FlexibleViewHolder

class TrainStreetElement(private val id: String, private val exercices: String, private val number: String) : AbstractFlexibleItem<TrainStreetElement.MyViewHolder>() {

    private val mContext: Context? = null


    override fun equals(o: Any?): Boolean {
        if (o is TrainStreetElement) {
            val inItem = o as TrainStreetElement?
            return this.id == inItem!!.id
        }
        return false
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

    override fun getLayoutRes(): Int {
        return R.layout.train_program_item
    }

    override fun createViewHolder(view: View, adapter: FlexibleAdapter<IFlexible<*>>): TrainStreetElement.MyViewHolder {
        return MyViewHolder(view, adapter)
    }

    override fun bindViewHolder(adapter: FlexibleAdapter<IFlexible<*>>, holder: TrainStreetElement.MyViewHolder,
                                position: Int, payloads: List<Any>) {
        holder.exercice.text = exercices
        holder.number.text = number
    }

    inner class MyViewHolder(view: View, adapter: FlexibleAdapter<*>) : FlexibleViewHolder(view, adapter) {
        var exercice: TextView
        var number: TextView

        init {
            exercice = view.findViewById(R.id.tvTrainEx)
            number = view.findViewById(R.id.tvTrainNumber)


        }
    }


}
