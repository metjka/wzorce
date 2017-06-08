class ClothesTransaction(override var currency: String?, override var moneyAmount: Int? = 0) : Transaction() {

    override fun getMoney(): Int {
        return moneyAmount ?: 0
    }

    override fun toString(): String {
        return "ClothesTransaction: " + super.toString()
    }
}