import java.time.LocalTime

class EarnedTransaction(override var currency: String?, override var moneyAmount: Int?, override var time: LocalTime? = LocalTime.now()) : Transaction() {
    override fun getMoney(): Int {
        return moneyAmount?:0
    }

    override fun toString(): String {
        return "EarnedTransaction: +" + super.toString()
    }

}