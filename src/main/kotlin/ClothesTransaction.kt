import java.time.LocalTime

class ClothesTransaction(override var currency: String?,
                         override var moneyAmount: Int? = 0,
                         override var time: LocalTime? = LocalTime.now()) : Transaction() {

    override fun getMoney(): Int {
        return moneyAmount ?: 0
    }

    override fun toString(): String {
        return "ClothesTransaction: -" + super.toString()
    }
}