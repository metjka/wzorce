class FoodBill(override var currency: String?) : Bill() {
    override var moneyAmount: Int? = null

    override fun getMoney(): Int {
        return moneyAmount ?: 0
    }

    override fun toString(): String {
        return "FoodBill: " + super.toString()
    }
}