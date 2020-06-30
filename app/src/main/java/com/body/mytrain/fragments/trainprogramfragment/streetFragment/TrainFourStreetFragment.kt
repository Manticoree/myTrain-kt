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
import kotlinx.android.synthetic.main.train_fragment.*

class TrainFourStreetFragment : BaseFragment() {




    private var trainStreetProgramPresenter: TrainStreetProgramContract.ITrainStreetProgramPresenter? = null
    private var mPage: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        trainStreetProgramPresenter = TrainStreetProgramPresenter()

        if (arguments != null) {
            arguments?.getInt(ARG_PAGE)?.let{mPage = it}
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.train_fragment, container, false)
        ButterKnife.bind(this, view)

        trainStreetProgramPresenter?.initDataOnRecyclerView4Level()?.let { showRecyclerView(rvFirstDay, it) }


        return view
    }

    companion object {
        private var position: Int = 0

        fun newInstance(page: Int, diffPosition: Int): TrainFourStreetFragment {
            val args = Bundle()
            args.putInt(ARG_PAGE, page)
            val fragment = TrainFourStreetFragment()
            fragment.arguments = args
            position = diffPosition
            return fragment
        }
    }
}
