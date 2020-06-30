package com.body.mytrain.mvp.gymdif.presenter

import android.content.Context

import com.body.mytrain.R
import com.body.mytrain.entities.LevelElement
import com.body.mytrain.mvp.gymdif.contract.GYMDiffContract

import java.util.ArrayList

import eu.davidea.flexibleadapter.items.IFlexible

class GYMDiffPresenter(internal var mContext: Context) : GYMDiffContract.PresenterGym {

    override fun onDifficultWasClicked() {

    }

    override fun initDataOnRecyclerView(): List<IFlexible<*>> {
        val diffGym = ArrayList<IFlexible<*>>()
        diffGym.add(LevelElement("1", R.string.noob, R.drawable.noob_in_gym, mContext))
        diffGym.add(LevelElement("2", R.string.middle, R.drawable.middle_in_gym, mContext))
        diffGym.add(LevelElement("3", R.string.high, R.drawable.high_in_gym, mContext))
        return diffGym
    }

    override fun onDestroy() {

    }
}
