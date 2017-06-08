class EducationTransaction(override var currency: String?, override var moneyAmount: Int?) : Transaction() {

    override fun getMoney(): Int {
        return moneyAmount ?: 0
    }

    override fun toString(): String {
        return "EducationTransaction: " +  super.toString()
    }
}