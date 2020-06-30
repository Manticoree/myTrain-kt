package com.body.mytrain.fragments.trainprogramfragment.gymfragment

import android.content.Context

import com.body.mytrain.constant.AppConstant
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class AdapterTrainGymFragment(fm: FragmentManager,
                              private val context: Context, private val diffPosition: Int) : FragmentPagerAdapter(fm) {
    internal val PAGE_COUNT = 3
    private val tabTitles = arrayOf(AppConstant.FIRST_DAY, AppConstant.SECOND_DAY, AppConstant.THIRD_DAY)

    override fun getCount(): Int {
        return PAGE_COUNT
    }

    override fun getItem(position: Int): Fragment {

        return if (position == 0) {
            TrainOneFragment.newInstance(position + 1, diffPosition)
        } else if (position == 1) {
            TrainTwoFragment.newInstance(position + 1, diffPosition)
        } else {
            TrainThreeFragment.newInstance(position + 1, diffPosition)
        }
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitles[position]
    }
}

