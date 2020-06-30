package com.body.mytrain.mvp.trainprogram.view

import android.os.Bundle

import com.body.mytrain.R
import com.body.mytrain.constant.AppConstant
import com.body.mytrain.entities.LevelElement
import com.body.mytrain.fragments.trainprogramfragment.gymfragment.AdapterTrainGymFragment
import com.body.mytrain.mainclass.BaseActivity
import com.body.mytrain.mvp.trainprogram.contract.TrainProgramContract
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import butterknife.BindView
import butterknife.ButterKnife

class TrainProgramActivity : BaseActivity(), TrainProgramContract.View {


    @BindView(R.id.vpProgramTrain)
    internal var vpProgramTrain: ViewPager? = null
    @BindView(R.id.tabDiffTrain)
    internal var tabDiffTrain: TabLayout? = null


    private val trainProgramPresenter: TrainProgramContract.Presenter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.train_program_layout)
        ButterKnife.bind(this)
        // trainProgramPresenter = new TrainProgramPresenter();
        val arguments = intent.extras
        val positionElement = arguments!!.get(LevelElement.POSITION_ELEMENT) as Int

        if (positionElement == AppConstant.ZERO) {
            vpProgramTrain!!.adapter = AdapterTrainGymFragment(supportFragmentManager,
                    this@TrainProgramActivity, AppConstant.ZERO)

        } else if (positionElement == AppConstant.ONE) {
            vpProgramTrain!!.adapter = AdapterTrainGymFragment(supportFragmentManager,
                    this@TrainProgramActivity, AppConstant.ONE)
        } else if (positionElement == AppConstant.TWO) {
            vpProgramTrain!!.adapter = AdapterTrainGymFragment(supportFragmentManager,
                    this@TrainProgramActivity, AppConstant.TWO)
        }

        tabDiffTrain!!.setupWithViewPager(vpProgramTrain)


    }


}
