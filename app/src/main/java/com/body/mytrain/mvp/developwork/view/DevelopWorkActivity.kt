package com.body.mytrain.mvp.developwork.view

import android.graphics.Color
import android.os.Bundle

import com.body.mytrain.R
import com.body.mytrain.constant.AppConstant
import com.body.mytrain.mvp.developwork.contract.DevelopWorkContract
import com.gjiazhe.panoramaimageview.GyroscopeObserver
import com.gjiazhe.panoramaimageview.PanoramaImageView
import com.r0adkll.slidr.Slidr
import com.sdsmdg.harjot.rotatingtext.RotatingTextWrapper
import com.sdsmdg.harjot.rotatingtext.models.Rotatable
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife

class DevelopWorkActivity : AppCompatActivity(), DevelopWorkContract.IDevelopWorkView {

    @BindView(R.id.panoram_technical_work)
    internal var panTechWork: PanoramaImageView? = null
    @BindView(R.id.custom_switcher_technical_works)
    internal var customSwitcherTechnicalWorks: RotatingTextWrapper? = null

    private var gyroscopeObserver: GyroscopeObserver? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.develop_work_layout)
        ButterKnife.bind(this)
        createGyroscopeControl(panTechWork!!)
        createCustomSwitcher()
        /*
        int primary = getResources().getColor(R.color.colorPrimaryDark);
        int secondary = getResources().getColor(R.color.colorPrimary);
        Slidr.attach(this, primary, secondary);
         */
    }

    override fun onResume() {
        super.onResume()
        gyroscopeObserver!!.register(this)
    }

    override fun onPause() {
        super.onPause()
        gyroscopeObserver!!.unregister()
    }


    override fun createGyroscopeControl(imageView: PanoramaImageView) {
        gyroscopeObserver = GyroscopeObserver()
        gyroscopeObserver!!.setMaxRotateRadian(Math.PI / 9)
        imageView.setGyroscopeObserver(gyroscopeObserver)
        imageView.setOnPanoramaScrollListener { view, offsetProgress ->
            // Do something here.
            // The offsetProgress range from -1 to 1, indicating the image scrolls
            // from left(top) to right(bottom).
        }
    }

    override fun createCustomSwitcher() {
        customSwitcherTechnicalWorks!!.size = 35
        val rotatable = Rotatable(Color.parseColor("#FFA036"), 1000,
                AppConstant.developWorks, AppConstant.seeYouSoon)
        rotatable.size = 35f
        rotatable.animationDuration = 500
        customSwitcherTechnicalWorks!!.setContent("erg ?", rotatable)

    }


}
