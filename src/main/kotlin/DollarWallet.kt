class DollarWallet(override var amount: Int? = 0) : Wallet() {

    override var currency: String? = "$"

    override fun clone(): DollarWallet {
        return this
    }

}

class EuroWallet(override var amount: Int? = 0) : Wallet() {

    override var currency: String? = "€"

    override fun clone(): EuroWallet {
        return this
    }

}

class ZlotyWallet(override var amount: Int? = 0) : Wallet() {

    override var currency: String? = "ZŁ"

    override fun clone(): ZlotyWallet {
        return this
    }

}

class WalletFactory(
        var dollarWallet: DollarWallet,
        var euroWallet: EuroWallet,
        var zlotyWallet: ZlotyWallet
) {

    fun createDollarWallet(): DollarWallet {
        return dollarWallet.clone()
    }

    fun createEuroWallet(): EuroWallet {
        return euroWallet.clone()
    }

    fun createZlotyWallet(): ZlotyWallet {
        return zlotyWallet.clone()
    }

}