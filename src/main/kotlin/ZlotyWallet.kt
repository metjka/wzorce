class ZlotyWallet(override var amount: Int? = 0, override var name: String?="Private") : Wallet() {

    override var currency: String? = "ZŁ"

    override fun clone(): ZlotyWallet {
        return this
    }

    override fun toString(): String {
        return "$name: $currency$amount"
    }
}