class EuroWallet(override var amount: Int? = 0, override var name: String? = "Private") : Wallet() {

    override var currency: String? = "€"

    override fun clone(): EuroWallet {
        return this
    }

    override fun toString(): String {
        return "$name: $currency$amount"
    }
}