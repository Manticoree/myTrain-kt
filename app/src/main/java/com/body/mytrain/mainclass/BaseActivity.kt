package com.body.mytrain.mainclass

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import eu.davidea.flexibleadapter.FlexibleAdapter
import eu.davidea.flexibleadapter.items.IFlexible

open class BaseActivity : AppCompatActivity() {
    fun showRecyclerView(recView: RecyclerView,
                         initList: List<IFlexible<*>>) {
        recView.setHasFixedSize(true)
        val manager = LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false)
        recView.layoutManager = manager
        val adapter = FlexibleAdapter(initList)
        adapter.addListener(this)
        recView.adapter = adapter
    }


}
