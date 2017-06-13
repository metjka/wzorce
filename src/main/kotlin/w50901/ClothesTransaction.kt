package w50901

class ClothesTransaction(override var currency: String?,
                         override var moneyAmount: Int? = 0,
                         override var time: java.time.LocalTime? = java.time.LocalTime.now()) : Transaction() {

    override fun getMoney(): Int {
        return moneyAmount ?: 0
    }

    override fun toString(): String {
        return "w50901.ClothesTransaction: -" + super.toString()
    }
}