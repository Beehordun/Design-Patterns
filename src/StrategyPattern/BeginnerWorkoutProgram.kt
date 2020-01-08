package StrategyPattern

class BeginnerWorkoutProgram : WorkoutProgram {
    override fun upperBodyWorkoutInstructions() {
        val workout = " Starting beginner upper body workout \n 1) Do 30secs jumping jacks\n 2) Do Ten push ups"
        println(workout)
    }

    override fun lowerBodyWorkoutInstructions() {
        val workout = " Starting beginner lower body  workout \n 1) Do 30secs jumping jacks\n 2) Do Ten push ups"
        println(workout)
    }
}
