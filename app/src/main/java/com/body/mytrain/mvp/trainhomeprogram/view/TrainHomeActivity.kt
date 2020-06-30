package com.body.mytrain.mvp.trainhomeprogram.view

import android.os.Bundle

import com.body.mytrain.R
import com.body.mytrain.mvp.trainhomeprogram.contract.TrainHomeProgramContract
import com.body.mytrain.mvp.trainstreetprogram.contract.TrainStreetProgramContract
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife

class TrainHomeActivity : AppCompatActivity(), TrainHomeProgramContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.train_home_layout)
        ButterKnife.bind(this)

    }
}
