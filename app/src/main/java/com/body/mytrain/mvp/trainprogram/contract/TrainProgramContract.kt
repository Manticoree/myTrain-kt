package com.body.mytrain.mvp.trainprogram.contract

import androidx.recyclerview.widget.RecyclerView
import eu.davidea.flexibleadapter.FlexibleAdapter
import eu.davidea.flexibleadapter.items.IFlexible

interface TrainProgramContract {
    interface View {

        fun showRecyclerView(recView: RecyclerView, initList: List<IFlexible<*>>)

    }

    interface Presenter {
        fun onWasClicked()

        fun initDataOnRecyclerView1DayNoob(): List<IFlexible<*>>
        fun initDataOnRecyclerView2DayNoob(): List<IFlexible<*>>
        fun initDataOnRecyclerView3DayNoob(): List<IFlexible<*>>

        fun initDataOnRecyclerView1DayMiddle(): List<IFlexible<*>>
        fun initDataOnRecyclerView2DayMiddle(): List<IFlexible<*>>
        fun initDataOnRecyclerView3DayMiddle(): List<IFlexible<*>>

        fun initDataOnRecyclerView1DayPro(): List<IFlexible<*>>
        fun initDataOnRecyclerView2DayPro(): List<IFlexible<*>>
        fun initDataOnRecyclerView3DayPro(): List<IFlexible<*>>

        fun onDestroy()
    }
}
