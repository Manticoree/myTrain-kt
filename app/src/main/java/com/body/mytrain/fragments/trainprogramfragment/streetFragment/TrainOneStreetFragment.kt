package com.body.mytrain.fragments.trainprogramfragment.streetFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.body.mytrain.R
import com.body.mytrain.fragments.trainprogramfragment.BaseFragment
import com.body.mytrain.mvp.trainstreetprogram.contract.TrainStreetProgramContract
import com.body.mytrain.mvp.trainstreetprogram.presenter.TrainStreetProgramPresenter
import kotlinx.android.synthetic.main.train_fragment.*

class TrainOneStreetFragment : BaseFragment() {


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





        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        trainStreetProgramPresenter?.initDataOnRecyclerView1Level()?.let { showRecyclerView(rvFirstDay, it) }
    }

    companion object {
        private var position: Int = 0

        fun newInstance(page: Int, diffPosition: Int): TrainOneStreetFragment {
            val args = Bundle()
            args.putInt(BaseFragment.ARG_PAGE, page)
            val fragment = TrainOneStreetFragment()
            fragment.arguments = args
            position = diffPosition
            return fragment
        }
    }
}
