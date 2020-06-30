package com.body.mytrain.mvp.trainprogram.presenter

import com.body.mytrain.R
import com.body.mytrain.entities.TrainProgramElement
import com.body.mytrain.mvp.trainprogram.contract.TrainProgramContract

import java.util.ArrayList

import eu.davidea.flexibleadapter.items.IFlexible

class TrainProgramPresenter : TrainProgramContract.Presenter {
    override fun onWasClicked() {

    }

    override fun initDataOnRecyclerView1DayNoob(): List<IFlexible<*>> {
        val firstDayTrainProgram = ArrayList<IFlexible<*>>()
        firstDayTrainProgram.add(TrainProgramElement("1", R.string.stretch, "10 мин"))
        firstDayTrainProgram.add(TrainProgramElement("2", R.string.deadlift, "2x8"))
        firstDayTrainProgram.add(TrainProgramElement("3", R.string.tilt_rod_pull, "3x8"))
        firstDayTrainProgram.add(TrainProgramElement("4", R.string.wide_grip_pull_ups, "3х макс."))
        firstDayTrainProgram.add(TrainProgramElement("5", R.string.barbell_lift, "2х12"))
        firstDayTrainProgram.add(TrainProgramElement("6", R.string.press, "3 отказных сета"))
        firstDayTrainProgram.add(TrainProgramElement("7", R.string.hitch, "10 мин"))

        return firstDayTrainProgram
    }

    override fun initDataOnRecyclerView2DayNoob(): List<IFlexible<*>> {
        val secondDayTrainProgram = ArrayList<IFlexible<*>>()
        secondDayTrainProgram.add(TrainProgramElement("1", R.string.stretch, "10 мин"))
        secondDayTrainProgram.add(TrainProgramElement("2", R.string.down_with_rod, "3x6"))
        secondDayTrainProgram.add(TrainProgramElement("3", R.string.press_legs, "2x18"))
        secondDayTrainProgram.add(TrainProgramElement("4", R.string.up_on_neck, "3x15"))
        secondDayTrainProgram.add(TrainProgramElement("5", R.string.press_down_small, "2x12"))
        secondDayTrainProgram.add(TrainProgramElement("6", R.string.french_press, "1x12"))
        secondDayTrainProgram.add(TrainProgramElement("7", R.string.hitch, "10 мин"))

        return secondDayTrainProgram
    }

    override fun initDataOnRecyclerView3DayNoob(): List<IFlexible<*>> {
        val thirdDayTrainProgram = ArrayList<IFlexible<*>>()
        thirdDayTrainProgram.add(TrainProgramElement("1", R.string.stretch, "10 мин"))
        thirdDayTrainProgram.add(TrainProgramElement("2", R.string.press_down_huge, "5x5"))
        thirdDayTrainProgram.add(TrainProgramElement("3", R.string.press_on_branch, "3 отказных сета"))
        thirdDayTrainProgram.add(TrainProgramElement("4", R.string.press_of_army, "3x8"))
        thirdDayTrainProgram.add(TrainProgramElement("5", R.string.dumbbell_shrug, "2x12"))
        thirdDayTrainProgram.add(TrainProgramElement("6", R.string.hitch, "10 мин"))

        return thirdDayTrainProgram
    }


    override fun initDataOnRecyclerView1DayMiddle(): List<IFlexible<*>> {
        val firstDayTrainProgram = ArrayList<IFlexible<*>>()
        firstDayTrainProgram.add(TrainProgramElement("1", R.string.stretch, "10 мин"))
        firstDayTrainProgram.add(TrainProgramElement("2", R.string.press_down_huge, "4x10-12"))
        firstDayTrainProgram.add(TrainProgramElement("3", R.string.gym_gantels_up, "4x8-1-"))
        firstDayTrainProgram.add(TrainProgramElement("4", R.string.revers_arms_with_gantels, "4x10-12"))
        firstDayTrainProgram.add(TrainProgramElement("5", R.string.tilt_to_chin_in_down_part, "4х10-12"))
        firstDayTrainProgram.add(TrainProgramElement("6", R.string.up_arms_on_gym, "3x10-12"))
        firstDayTrainProgram.add(TrainProgramElement("7", R.string.right_scroll, "3x10"))
        firstDayTrainProgram.add(TrainProgramElement("8", R.string.reverse_scroll, "3x10"))
        firstDayTrainProgram.add(TrainProgramElement("9", R.string.hitch, "10 мин"))

        return firstDayTrainProgram
    }

    override fun initDataOnRecyclerView2DayMiddle(): List<IFlexible<*>> {
        val secondDayTrainProgram = ArrayList<IFlexible<*>>()
        secondDayTrainProgram.add(TrainProgramElement("1", R.string.stretch, "10 мин"))
        secondDayTrainProgram.add(TrainProgramElement("2", R.string.deadlift, "3x10"))
        secondDayTrainProgram.add(TrainProgramElement("3", R.string.tilt_gantels_in_down, "3x12"))
        secondDayTrainProgram.add(TrainProgramElement("4", R.string.reverse_body_on_gym, "3x12-15"))
        secondDayTrainProgram.add(TrainProgramElement("5", R.string.up_arms_with_gantels, "3x8-10"))
        secondDayTrainProgram.add(TrainProgramElement("6", R.string.reverse_push_up, "1x12-15"))
        secondDayTrainProgram.add(TrainProgramElement("7", R.string.french_gym_down, "3x10-12"))
        secondDayTrainProgram.add(TrainProgramElement("8", R.string.sgib_arms_with_gantels, "3x10-12"))
        secondDayTrainProgram.add(TrainProgramElement("9", R.string.sgib_arms_with_gym, "3x8-10"))
        secondDayTrainProgram.add(TrainProgramElement("10", R.string.hitch, "10 мин"))

        return secondDayTrainProgram
    }

    override fun initDataOnRecyclerView3DayMiddle(): List<IFlexible<*>> {
        val thirdDayTrainProgram = ArrayList<IFlexible<*>>()
        thirdDayTrainProgram.add(TrainProgramElement("1", R.string.stretch, "10 мин"))
        thirdDayTrainProgram.add(TrainProgramElement("2", R.string.down_with_rod, "3x10-12"))
        thirdDayTrainProgram.add(TrainProgramElement("3", R.string.rasgib_legs_on_gym, "3x10-12"))
        thirdDayTrainProgram.add(TrainProgramElement("4", R.string.mixing_legs_on_gym, "3x10-12"))
        thirdDayTrainProgram.add(TrainProgramElement("5", R.string.down_with_gym_on_arms, "3x10-12"))
        thirdDayTrainProgram.add(TrainProgramElement("6", R.string.step_on_the_step, "4x12"))
        thirdDayTrainProgram.add(TrainProgramElement("7", R.string.jump_with_gantels, "1x15-20"))
        thirdDayTrainProgram.add(TrainProgramElement("8", R.string.press_gym_on_scum, "2x12-15"))
        thirdDayTrainProgram.add(TrainProgramElement("9", R.string.Pullover, "3x15"))
        thirdDayTrainProgram.add(TrainProgramElement("10", R.string.Mixing_on_fitbol, "3x12-15"))
        thirdDayTrainProgram.add(TrainProgramElement("11", R.string.bicycle, "3x12-15"))
        thirdDayTrainProgram.add(TrainProgramElement("12", R.string.hitch, "10 мин"))

        return thirdDayTrainProgram
    }


    override fun initDataOnRecyclerView1DayPro(): List<IFlexible<*>> {
        val firstDayTrainProgram = ArrayList<IFlexible<*>>()
        firstDayTrainProgram.add(TrainProgramElement("1", R.string.stretch, "10 мин"))
        firstDayTrainProgram.add(TrainProgramElement("2", R.string.deadlift, "2x8"))
        firstDayTrainProgram.add(TrainProgramElement("3", R.string.tilt_rod_pull, "3x8"))
        firstDayTrainProgram.add(TrainProgramElement("4", R.string.wide_grip_pull_ups, "3х макс."))
        firstDayTrainProgram.add(TrainProgramElement("5", R.string.barbell_lift, "2х12"))
        firstDayTrainProgram.add(TrainProgramElement("6", R.string.press, "3 отказных сета"))
        firstDayTrainProgram.add(TrainProgramElement("7", R.string.hitch, "10 мин"))

        return firstDayTrainProgram
    }

    override fun initDataOnRecyclerView2DayPro(): List<IFlexible<*>> {
        val secondDayTrainProgram = ArrayList<IFlexible<*>>()
        secondDayTrainProgram.add(TrainProgramElement("1", R.string.stretch, "10 мин"))
        secondDayTrainProgram.add(TrainProgramElement("2", R.string.down_with_rod, "3x6"))
        secondDayTrainProgram.add(TrainProgramElement("3", R.string.press_legs, "2x18"))
        secondDayTrainProgram.add(TrainProgramElement("4", R.string.up_on_neck, "3x15"))
        secondDayTrainProgram.add(TrainProgramElement("5", R.string.press_down_small, "2x12"))
        secondDayTrainProgram.add(TrainProgramElement("6", R.string.french_press, "1x12"))
        secondDayTrainProgram.add(TrainProgramElement("7", R.string.hitch, "10 мин"))

        return secondDayTrainProgram
    }

    override fun initDataOnRecyclerView3DayPro(): List<IFlexible<*>> {
        val thirdDayTrainProgram = ArrayList<IFlexible<*>>()
        thirdDayTrainProgram.add(TrainProgramElement("1", R.string.stretch, "10 мин"))
        thirdDayTrainProgram.add(TrainProgramElement("2", R.string.press_down_huge, "5x5"))
        thirdDayTrainProgram.add(TrainProgramElement("3", R.string.press_on_branch, "3 отказных сета"))
        thirdDayTrainProgram.add(TrainProgramElement("4", R.string.press_of_army, "3x8"))
        thirdDayTrainProgram.add(TrainProgramElement("5", R.string.dumbbell_shrug, "2x12"))
        thirdDayTrainProgram.add(TrainProgramElement("6", R.string.hitch, "10 мин"))

        return thirdDayTrainProgram
    }


    override fun onDestroy() {

    }
}
