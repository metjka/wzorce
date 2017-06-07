val walletFactory = WalletFactory(
        DollarWallet(),
        EuroWallet(),
        ZlotyWallet())

val store = Store

fun main(args: Array<String>) {


    while (true) {
        val readLine = readLine()




        //create wallet
        val createDollarWallet = walletFactory.createDollarWallet()
        store.wallets.add(createDollarWallet)


        //create transaction
        store.transaction.add(ClothesBill(300, "$"))
        store.transaction.forEach { it -> println(it.toString()) }

    }
}


abstract class Wallet : Prototype() {

    abstract var amount: Int?
    abstract var currency: String?

    fun calculate(transaction: Int) {
        amount = amount?.plus(transaction)
    }

}