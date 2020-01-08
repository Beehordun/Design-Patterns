package StrategyPattern

class GymWorkout {
    lateinit var bodyWorkout: WorkoutProgram

    fun setWorkoutProgram(workoutProgram: WorkoutProgram) {
       bodyWorkout = workoutProgram
    }

    fun startLowerBodyWorkout() {
        bodyWorkout.lowerBodyWorkoutInstructions()
    }

    fun startUpperBodyWorkout() {
        bodyWorkout.upperBodyWorkoutInstructions()
    }
}

fun main() {
    val gymWorkout = GymWorkout()
    val beginnerWorkoutProgram = BeginnerWorkoutProgram()
    val intermediateWorkoutProgram = IntermediateWorkoutProgram()
    val advancedWorkoutProgram = AdvancedWorkoutProgram()

    gymWorkout.setWorkoutProgram(beginnerWorkoutProgram)

    gymWorkout.startLowerBodyWorkout()
    gymWorkout.startUpperBodyWorkout()

    gymWorkout.setWorkoutProgram(intermediateWorkoutProgram)

    gymWorkout.startLowerBodyWorkout()
    gymWorkout.startUpperBodyWorkout()


    gymWorkout.setWorkoutProgram(advancedWorkoutProgram)

    gymWorkout.startLowerBodyWorkout()
    gymWorkout.startUpperBodyWorkout()
}
