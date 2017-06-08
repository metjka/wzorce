class DollarWallet(override var amount: Int? = 0, override var name: String? = "Private") : Wallet() {

    override var currency: String? = "$"

    override fun clone(): DollarWallet {
        return this
    }

    override fun toString(): String {
        return "$name: $currency$amount"
    }

}