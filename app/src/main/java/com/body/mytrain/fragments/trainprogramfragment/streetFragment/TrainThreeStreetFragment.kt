package com.body.mytrain.fragments.trainprogramfragment.streetFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.body.mytrain.R
import com.body.mytrain.fragments.trainprogramfragment.BaseFragment
import com.body.mytrain.mvp.trainstreetprogram.contract.TrainStreetProgramContract
import com.body.mytrain.mvp.trainstreetprogram.presenter.TrainStreetProgramPresenter
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife

class TrainThreeStreetFragment : BaseFragment() {
    @BindView(R.id.rvFirstDay)
    internal var rvFirstDay: RecyclerView? = null

    private var trainStreetProgramPresenter: TrainStreetProgramContract.ITrainStreetProgramPresenter? = null
    private var mPage: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        trainStreetProgramPresenter = TrainStreetProgramPresenter()

        if (arguments != null) {
            mPage = arguments!!.getInt(BaseFragment.ARG_PAGE)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.train_fragment, container, false)
        ButterKnife.bind(this, view)

        showRecyclerView(rvFirstDay!!, trainStreetProgramPresenter!!.initDataOnRecyclerView3Level())


        return view
    }

    companion object {
        private var position: Int = 0

        fun newInstance(page: Int, diffPosition: Int): TrainThreeStreetFragment {
            val args = Bundle()
            args.putInt(BaseFragment.ARG_PAGE, page)
            val fragment = TrainThreeStreetFragment()
            fragment.arguments = args
            position = diffPosition
            return fragment
        }
    }
}
