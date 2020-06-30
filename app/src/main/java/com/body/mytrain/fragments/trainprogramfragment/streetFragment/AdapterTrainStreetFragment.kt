package com.body.mytrain.fragments.trainprogramfragment.streetFragment

import android.content.Context

import com.body.mytrain.constant.AppConstant
import com.body.mytrain.fragments.trainprogramfragment.gymfragment.TrainThreeFragment
import com.body.mytrain.fragments.trainprogramfragment.gymfragment.TrainTwoFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class AdapterTrainStreetFragment(fm: FragmentManager, behavior: Int,
                                 private val context: Context, private val diffPosition: Int) : FragmentPagerAdapter(fm, behavior) {
    internal val PAGE_COUNT = 4
    private val tabTitles = arrayOf(AppConstant.FIRST_LEVEL, AppConstant.SECOND_LEVEL, AppConstant.THIRD_LEVEL, AppConstant.FOUR_LEVEL)

    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            TrainOneStreetFragment.newInstance(position + 1, diffPosition)
        } else if (position == 1) {
            TrainTwoStreetFragment.newInstance(position + 1, diffPosition)
        } else if (position == 2) {
            TrainThreeStreetFragment.newInstance(position + 1, diffPosition)
        } else {
            TrainFourStreetFragment.newInstance(position + 1, diffPosition)
        }
    }

    override fun getCount(): Int {
        return PAGE_COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitles[position]
    }
}
