package com.body.mytrain.mvp.trainstreetprogram.view

import android.os.Bundle

import com.body.mytrain.R
import com.body.mytrain.constant.AppConstant
import com.body.mytrain.fragments.trainprogramfragment.gymfragment.AdapterTrainGymFragment
import com.body.mytrain.fragments.trainprogramfragment.streetFragment.AdapterTrainStreetFragment
import com.body.mytrain.mainclass.BaseActivity
import com.body.mytrain.mvp.trainstreetprogram.contract.TrainStreetProgramContract
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import butterknife.BindView
import butterknife.ButterKnife

class TrainStreetProgramActivity : BaseActivity(), TrainStreetProgramContract.ITrainStreetProgramView {
    @BindView(R.id.vpProgramTrainStreet)
    internal var vpProgramTrain: ViewPager? = null
    @BindView(R.id.tabDiffTrainStreet)
    internal var tabDiffTrain: TabLayout? = null

    private val trainStreetProgramPresenter: TrainStreetProgramContract.ITrainStreetProgramPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.train_street_layout)
        ButterKnife.bind(this)
        val arguments = intent.extras
        vpProgramTrain!!.adapter = AdapterTrainStreetFragment(supportFragmentManager, 1,
                this@TrainStreetProgramActivity, AppConstant.ZERO)
        tabDiffTrain!!.setupWithViewPager(vpProgramTrain)

    }
}
