package w50901

class WalletFactoryImpl(
        private var dollarWallet: DollarWallet,
        private var euroWallet: EuroWallet,
        private var zlotyWallet: ZlotyWallet
) : WalletFactory {

    override fun createDollarWallet(): DollarWallet {
        return dollarWallet.clone()
    }

    override fun createEuroWallet(): EuroWallet {
        return euroWallet.clone()
    }

    override fun createZlotyWallet(): ZlotyWallet {
        return zlotyWallet.clone()
    }

}

