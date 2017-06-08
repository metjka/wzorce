import java.time.LocalTime

abstract class Transaction {

    abstract var moneyAmount: Int?
    abstract var currency: String?
    abstract var time:LocalTime?

    abstract fun getMoney(): Int

    override fun toString(): String {
        return "$currency$moneyAmount, time: ${time.toString()}"
    }


}