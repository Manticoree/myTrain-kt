package com.body.mytrain.mvp.developwork.contract

import com.gjiazhe.panoramaimageview.GyroscopeObserver
import com.gjiazhe.panoramaimageview.PanoramaImageView

interface DevelopWorkContract {
    interface IDevelopWorkPresenter

    interface IDevelopWorkView {
        fun createGyroscopeControl(imageView: PanoramaImageView)
        fun createCustomSwitcher()
    }
}
