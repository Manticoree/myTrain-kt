package com.body.mytrain.entities

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.body.mytrain.R

import eu.davidea.flexibleadapter.FlexibleAdapter
import eu.davidea.flexibleadapter.items.AbstractFlexibleItem
import eu.davidea.flexibleadapter.items.IFlexible
import eu.davidea.viewholders.FlexibleViewHolder

class TrainProgramElement(private val id: String, private val exercices: Int, private val number: String) : AbstractFlexibleItem<TrainProgramElement.MyViewHolder>() {

    private val mContext: Context? = null

    override fun equals(o: Any?): Boolean {
        if (o is TrainProgramElement) {
            val inItem = o as TrainProgramElement?
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

    override fun createViewHolder(view: View, adapter: FlexibleAdapter<IFlexible<*>>): MyViewHolder {
        return MyViewHolder(view, adapter)
    }

    override fun bindViewHolder(adapter: FlexibleAdapter<IFlexible<*>>, holder: MyViewHolder,
                                position: Int, payloads: List<Any>) {

        holder.exercice.setText(exercices)
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
