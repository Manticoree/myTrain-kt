package com.body.mytrain.fragments.trainprogramfragment

import com.body.mytrain.mvp.trainprogram.contract.TrainProgramContract

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import eu.davidea.flexibleadapter.FlexibleAdapter
import eu.davidea.flexibleadapter.items.IFlexible

open class BaseFragment : Fragment() {

    fun showRecyclerView(recView: RecyclerView,
                         initList: List<IFlexible<*>>) {
        recView.setHasFixedSize(true)
        val manager = LinearLayoutManager(activity,
                LinearLayoutManager.VERTICAL,
                false)
        recView.layoutManager = manager
        val adapter = FlexibleAdapter(initList)
        adapter.addListener(this)
        recView.adapter = adapter
    }

    companion object {

        val ARG_PAGE = "ARG_PAGE"
    }
}
