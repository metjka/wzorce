abstract class Bill {

    abstract var moneyAmount: Int?
    abstract var currency: String?

    abstract fun getMoney(): Int

    override fun toString(): String {
        return "$currency$moneyAmount"
    }


}