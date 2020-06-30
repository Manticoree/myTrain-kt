package com.body.mytrain.fragments.trainprogramfragment.gymfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.body.mytrain.R
import com.body.mytrain.constant.AppConstant
import com.body.mytrain.fragments.trainprogramfragment.BaseFragment
import com.body.mytrain.mvp.trainprogram.contract.TrainProgramContract
import com.body.mytrain.mvp.trainprogram.presenter.TrainProgramPresenter
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife

class TrainTwoFragment : BaseFragment() {
    @BindView(R.id.rvFirstDay)
    internal var rvFirstDay: RecyclerView? = null
    @BindView(R.id.rvSecondDay)
    internal var rvSecondDay: RecyclerView? = null
    @BindView(R.id.rvThirdDay)
    internal var rvThirdDay: RecyclerView? = null

    private var trainProgramPresenter: TrainProgramContract.Presenter? = null
    private var mPage: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        trainProgramPresenter = TrainProgramPresenter()

        if (arguments != null) {
            mPage = arguments!!.getInt(BaseFragment.ARG_PAGE)
        }
    }


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.train_fragment, container, false)
        ButterKnife.bind(this, view)
        if (position == AppConstant.ZERO) {
            showRecyclerView(rvFirstDay!!, trainProgramPresenter!!.initDataOnRecyclerView2DayNoob())
        } else if (position == AppConstant.ONE) {
            showRecyclerView(rvFirstDay!!, trainProgramPresenter!!.initDataOnRecyclerView2DayMiddle())
        } else if (position == AppConstant.TWO) {
            showRecyclerView(rvFirstDay!!, trainProgramPresenter!!.initDataOnRecyclerView2DayPro())
        }

        return view
    }

    companion object {
        private var position: Int = 0

        fun newInstance(page: Int, diffPosition: Int): TrainTwoFragment {
            val args = Bundle()
            args.putInt(BaseFragment.ARG_PAGE, page)
            val fragment = TrainTwoFragment()
            fragment.arguments = args
            position = diffPosition
            return fragment
        }
    }

}
