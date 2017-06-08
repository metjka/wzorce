class FoodTransaction(override var currency: String?, override var moneyAmount: Int? = 0) : Transaction() {

    override fun getMoney(): Int {
        return moneyAmount ?: 0
    }

    override fun toString(): String {
        return "FoodTransaction: " + super.toString()
    }
}