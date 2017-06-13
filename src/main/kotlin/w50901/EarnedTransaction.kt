package w50901

class EarnedTransaction(override var currency: String?, override var moneyAmount: Int?, override var time: java.time.LocalTime? = java.time.LocalTime.now()) : Transaction() {
    override fun getMoney(): Int {
        return moneyAmount?:0
    }

    override fun toString(): String {
        return "w50901.EarnedTransaction: +" + super.toString()
    }

}