class ClothesBill(override var moneyAmount: Int? = 0, override var currency: String?) : Bill() {


    override fun getMoney(): Int {
        return moneyAmount ?: 0
    }

    override fun toString(): String {
        return "ClothesBill: " + super.toString()
    }
}