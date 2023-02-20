package com.ayushkushwaha2212.a7minutesworkout

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,
            "Jumping jacks",
            R.drawable.ic_jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel(
            2, "Wall Sit",
            R.drawable.ic_wall_sit,
            false,
            false
        )
        exerciseList.add(wallSit)

        val pushUp = ExerciseModel(
            3,
            "Push Up",
            R.drawable.ic_push_ups,
            false,
            false
        )
        exerciseList.add(pushUp)

        val setUpOnChair = ExerciseModel(
            4,
            "Set Up On Chair",
            R.drawable.ic_step_up_on_to_chair,
            false,
            false
        )
        exerciseList.add(setUpOnChair)

        val squat = ExerciseModel(
            5,
            "Squat",
            R.drawable.ic_squat,
            false,
            false
        )
        exerciseList.add(squat)

        val tricepDipOnChair = ExerciseModel(
            6,
            "Tricep Dip On Chair",
            R.drawable.ic_triceps_dip_on_chair,
            false,
            false
        )
        exerciseList.add(tricepDipOnChair)

        val plank = ExerciseModel(
            7,
            "Plank",
            R.drawable.ic_plank,
            false,
            false
        )
        exerciseList.add(plank)

        val highKneesRunningInPlace = ExerciseModel(
            8,
            "High Knees Running In Place",
            R.drawable.ic_high_knees_running,
            false,
            false
        )
        exerciseList.add(highKneesRunningInPlace)

        val lunges = ExerciseModel(
            9,
            "Lunges",
            R.drawable.ic_lunge,
            false,
            false
        )
        exerciseList.add(lunges)

        val pushUpsAndRotation = ExerciseModel(
            10,
            "push ups and rotation",
            R.drawable.ic_push_ups_and_rotation,
            false,
            false
        )
        exerciseList.add(pushUpsAndRotation)

        val sidePlank = ExerciseModel(
            11,
            "Side Plank",
            R.drawable.ic_side_plank,
            false,
            false
        )
        exerciseList.add(sidePlank)

        return exerciseList
    }
}