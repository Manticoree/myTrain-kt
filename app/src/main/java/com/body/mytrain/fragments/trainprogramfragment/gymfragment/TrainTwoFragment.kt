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
import kotlinx.android.synthetic.main.train_fragment.*

class TrainTwoFragment : BaseFragment() {


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



        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (position == AppConstant.ZERO) {
            trainProgramPresenter?.initDataOnRecyclerView2DayNoob()?.let { showRecyclerView(rvFirstDay, it) }
        } else if (position == AppConstant.ONE) {
            trainProgramPresenter?.initDataOnRecyclerView2DayMiddle()?.let { showRecyclerView(rvFirstDay, it) }
        } else if (position == AppConstant.TWO) {
            trainProgramPresenter?.initDataOnRecyclerView2DayPro()?.let { showRecyclerView(rvFirstDay, it) }
        }
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
