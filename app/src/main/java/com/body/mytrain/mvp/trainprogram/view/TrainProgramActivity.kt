package com.body.mytrain.mvp.trainprogram.view

import android.os.Bundle
import butterknife.ButterKnife
import com.body.mytrain.R
import com.body.mytrain.constant.AppConstant
import com.body.mytrain.entities.LevelElement
import com.body.mytrain.fragments.trainprogramfragment.gymfragment.AdapterTrainGymFragment
import com.body.mytrain.mainclass.BaseActivity
import com.body.mytrain.mvp.trainprogram.contract.TrainProgramContract
import kotlinx.android.synthetic.main.train_program_layout.*

class TrainProgramActivity : BaseActivity(), TrainProgramContract.View {




    private val trainProgramPresenter: TrainProgramContract.Presenter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.train_program_layout)
        ButterKnife.bind(this)
        // trainProgramPresenter = new TrainProgramPresenter();
        val arguments = intent.extras
        val positionElement = arguments!!.get(LevelElement.POSITION_ELEMENT) as Int

        if (positionElement == AppConstant.ZERO) {
            vpProgramTrain.adapter = AdapterTrainGymFragment(supportFragmentManager,
                    this@TrainProgramActivity, AppConstant.ZERO)

        } else if (positionElement == AppConstant.ONE) {
            vpProgramTrain.adapter = AdapterTrainGymFragment(supportFragmentManager,
                    this@TrainProgramActivity, AppConstant.ONE)
        } else if (positionElement == AppConstant.TWO) {
            vpProgramTrain.adapter = AdapterTrainGymFragment(supportFragmentManager,
                    this@TrainProgramActivity, AppConstant.TWO)
        }

        tabDiffTrain.setupWithViewPager(vpProgramTrain)


    }


}
