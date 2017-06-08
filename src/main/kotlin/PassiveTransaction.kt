import java.time.LocalTime

class PassiveTransaction(override var currency: String?, override var moneyAmount: Int?, override var time: LocalTime? = LocalTime.now()) : Transaction() {
    override fun getMoney(): Int {
        return moneyAmount?:0
    }

    override fun toString(): String {
        return "PassiveTransaction: +" + super.toString()
    }
}