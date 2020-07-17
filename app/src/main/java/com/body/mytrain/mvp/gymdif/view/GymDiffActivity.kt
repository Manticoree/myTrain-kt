package com.body.mytrain.mvp.gymdif.view

import android.content.Context
import android.os.Bundle
import butterknife.ButterKnife
import com.body.mytrain.R
import com.body.mytrain.mainclass.BaseActivity
import com.body.mytrain.mvp.gymdif.contract.GYMDiffContract
import com.body.mytrain.mvp.gymdif.presenter.GYMDiffPresenter
import eu.davidea.flexibleadapter.FlexibleAdapter
import eu.davidea.flexibleadapter.items.IFlexible
import kotlinx.android.synthetic.main.gym_train_layout.*

class GymDiffActivity : BaseActivity(), GYMDiffContract.ViewGym {



    private var mPresenterGYM: GYMDiffContract.PresenterGym? = null
    private val mAdapter: FlexibleAdapter<IFlexible<*>>? = null
    private var mContext: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gym_train_layout)
        ButterKnife.bind(this)
        mContext = applicationContext
        mContext?.let { mPresenterGYM = GYMDiffPresenter(it) }
        mPresenterGYM?.initDataOnRecyclerView()?.let { showRecyclerView(rvDiffGym, it) }

        //todo сделать отдельный поток для слайдера
        /*
        int primary = getResources().getColor(R.color.colorPrimaryDark);
        int secondary = getResources().getColor(R.color.colorPrimary);
        Slidr.attach(this, primary, secondary);

         */
    }


    override fun onDestroy() {
        super.onDestroy()
        mPresenterGYM!!.onDestroy()
    }

}
