package StrategyPattern

class AdvancedWorkoutProgram : WorkoutProgram {
    override fun lowerBodyWorkoutInstructions() {
        val workout = " Starting advanced lower body  workout \n1) Do 120secs jumping jacks\n 2) Do 30 push ups"
        println(workout)
    }

    override fun upperBodyWorkoutInstructions() {
        val workout = " Starting advanced upper body workout \n1) Do 120secs jumping jacks\n 2) Do 30 push ups"
        println(workout)
    }

}
