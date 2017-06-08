class WalletFactory(
        private var dollarWallet: DollarWallet,
        private var euroWallet: EuroWallet,
        private var zlotyWallet: ZlotyWallet
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