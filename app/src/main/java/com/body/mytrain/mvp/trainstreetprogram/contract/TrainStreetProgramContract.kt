package com.body.mytrain.mvp.trainstreetprogram.contract

import eu.davidea.flexibleadapter.items.IFlexible

interface TrainStreetProgramContract {
    interface ITrainStreetProgramPresenter {
        fun initDataOnRecyclerView1Level(): List<IFlexible<*>>
        fun initDataOnRecyclerView2Level(): List<IFlexible<*>>
        fun initDataOnRecyclerView3Level(): List<IFlexible<*>>
        fun initDataOnRecyclerView4Level(): List<IFlexible<*>>
    }

    interface ITrainStreetProgramView
}
