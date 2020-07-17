package com.body.mytrain.mvp.trainstreetprogram.view

import android.os.Bundle
import butterknife.ButterKnife
import com.body.mytrain.R
import com.body.mytrain.constant.AppConstant
import com.body.mytrain.fragments.trainprogramfragment.streetFragment.AdapterTrainStreetFragment
import com.body.mytrain.mainclass.BaseActivity
import com.body.mytrain.mvp.trainstreetprogram.contract.TrainStreetProgramContract
import kotlinx.android.synthetic.main.train_street_layout.*


class TrainStreetProgramActivity : BaseActivity(), TrainStreetProgramContract.ITrainStreetProgramView {


    private val trainStreetProgramPresenter: TrainStreetProgramContract.ITrainStreetProgramPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.train_street_layout)
        ButterKnife.bind(this)
        vpProgramTrainStreet.adapter = AdapterTrainStreetFragment(supportFragmentManager, 1,
                this@TrainStreetProgramActivity, AppConstant.ZERO)
        tabDiffTrainStreet.setupWithViewPager(vpProgramTrainStreet)

    }
}
