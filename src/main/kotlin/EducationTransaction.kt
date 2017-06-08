import java.time.LocalTime

class EducationTransaction(
        override var currency: String?,
        override var moneyAmount: Int?,
        override var time: LocalTime? = LocalTime.now()) : Transaction() {

    override fun getMoney(): Int {
        return moneyAmount ?: 0
    }

    override fun toString(): String {
        return "EducationTransaction: -" + super.toString()
    }
}