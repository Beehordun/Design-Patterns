package StrategyPattern

class IntermediateWorkoutProgram : WorkoutProgram {
    override fun lowerBodyWorkoutInstructions() {
        val workout = " Starting intermediate lower body workout \n1) Do 60secs jumping jacks\n 2) Do 20 push ups"
        println(workout)
    }

    override fun upperBodyWorkoutInstructions() {
        val workout = " Starting intermediate upper body workout \n1) Do 60secs jumping jacks\n 2) Do 20 push ups"
        println(workout)
    }
}
