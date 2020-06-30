package com.body.mytrain.mvp.trainjogprogram.view

import android.os.Bundle

import com.body.mytrain.R
import com.body.mytrain.mvp.trainjogprogram.contract.TrainJogProgramContract
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife

class TrainJogProgramActivity : AppCompatActivity(), TrainJogProgramContract.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.train_jog_layout)
        ButterKnife.bind(this)
    }
}
