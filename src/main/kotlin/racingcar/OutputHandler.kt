package racingcar

class OutputHandler {

    fun printRacingGame() {
        println()
        println(PROMPT_OUTPUT_RACING_GAME)
    }

    companion object {
        const val PROMPT_OUTPUT_RACING_GAME = "실행 결과"
        const val PROMPT_OUTPUT_RACING_WINNER = "최종 우승자 : "
    }
}