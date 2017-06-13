package w50901

class ZlotyWallet(override var amount: Int? = 0, override var name: String?="Private") : Wallet() {

    override val currency: String? = "ZŁ"

    override fun clone(): w50901.ZlotyWallet {
        return this
    }

    override fun toString(): String {
        return "$name: $currency$amount"
    }
}