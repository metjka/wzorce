class WalletExpression(val ex1: MoneyExpression, val ex2: StringExpression) : Expression {

    val walletFactory = WalletFactory(
            DollarWallet(),
            EuroWallet(),
            ZlotyWallet())

    override fun interpret(): Wallet {
        val (component1, component2) = ex1.interpret()
        val interpret = ex2.interpret()
        when (component1) {
            "$" -> return walletFactory.createDollarWallet().apply {
                this.amount = component2
                this.name = interpret
            }
            "€" -> return walletFactory.createEuroWallet().apply {
                this.amount = component2
                this.name = interpret
            }
            "ZŁ" -> return walletFactory.createZlotyWallet().apply {
                this.amount = component2
                this.name = interpret
            }
            else -> throw IllegalArgumentException("Error!")
        }

    }
}