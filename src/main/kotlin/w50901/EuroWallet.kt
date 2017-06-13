package w50901

class EuroWallet(override var amount: Int? = 0, override var name: String? = "Private") : Wallet() {

    override val currency: String? = "€"

    override fun clone(): w50901.EuroWallet {
        return this
    }

    override fun toString(): String {
        return "$name: $currency$amount"
    }
}