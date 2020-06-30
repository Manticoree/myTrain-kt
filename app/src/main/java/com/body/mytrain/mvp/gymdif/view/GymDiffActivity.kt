package com.body.mytrain.mvp.gymdif.view

import android.content.Context
import android.os.Bundle

import com.body.mytrain.R
import com.body.mytrain.mainclass.BaseActivity
import com.body.mytrain.mvp.gymdif.contract.GYMDiffContract
import com.body.mytrain.mvp.gymdif.presenter.GYMDiffPresenter
import com.r0adkll.slidr.Slidr
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import eu.davidea.flexibleadapter.FlexibleAdapter
import eu.davidea.flexibleadapter.items.IFlexible

class GymDiffActivity : BaseActivity(), GYMDiffContract.ViewGym {

    @BindView(R.id.rvDiffGym)
    internal var rvDiffGym: RecyclerView? = null

    private var mPresenterGYM: GYMDiffContract.PresenterGym? = null
    private val mAdapter: FlexibleAdapter<IFlexible<*>>? = null
    private var mContext: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gym_train_layout)
        ButterKnife.bind(this)
        mContext = applicationContext
        mContext?.let {mPresenterGYM = GYMDiffPresenter(it)}
        showRecyclerView(rvDiffGym!!, mPresenterGYM!!.initDataOnRecyclerView())

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
