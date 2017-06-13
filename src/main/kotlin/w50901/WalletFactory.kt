package w50901

interface WalletFactory {
    fun createZlotyWallet(): ZlotyWallet
    fun createEuroWallet(): EuroWallet
    fun createDollarWallet(): DollarWallet
}