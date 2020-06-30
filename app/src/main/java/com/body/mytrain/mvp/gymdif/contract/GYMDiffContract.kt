package com.body.mytrain.mvp.gymdif.contract

import androidx.recyclerview.widget.RecyclerView
import eu.davidea.flexibleadapter.items.IFlexible

interface GYMDiffContract {
    interface ViewGym {
        fun showRecyclerView(recView: RecyclerView,
                             initList: List<IFlexible<*>>)
    }

    interface PresenterGym {
        fun onDifficultWasClicked()

        fun initDataOnRecyclerView(): List<IFlexible<*>>

        fun onDestroy()
    }

}
