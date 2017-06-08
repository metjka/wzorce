val store = Store
fun main(args: Array<String>) {


    while (true) {
        val readLine = readLine()


        readLine?.let {
            when {
                it.startsWith("INCOME") -> {
                    addIncome(it)
                }
                it.startsWith("WASTE") -> {
                    addWaste(it)
                }
                it.startsWith("WALLET") -> {
                    addWallet(it)
                }
                it.startsWith("WS")->{
                    store.wallets.forEach { println(it.toString()) }
                }
                it.startsWith("TS")->{
                    store.transaction.forEach { println(it.toString()) }
                }
                else -> {
                    throw IllegalArgumentException("Error while parsing string")
                }
            }
        }

    }
}

fun addWallet(string: String) {
    val split: List<List<String>> = string.split(",").map { it.split("=") }
    val wallet: Wallet = WalletExpression(
            MoneyExpression(split[0][1]),
            StringExpression(split[1][1]))
            .interpret()
    try {
        store.wallets.add(wallet)
    } catch (e: IllegalArgumentException) {
        println(e.toString())
    }
    store.wallets.forEach { println(it.toString()) }
}

fun addWaste(s: String) {
    val split: List<List<String>> = s.split(",").map { s.split("=") }
    val interpret = TransactionExpression(MoneyExpression(split[0][1]),
            TransactionTypeExpression(split[1][1]))
            .interpret()
    try {
        val wallet: Wallet? = store.wallets.find { interpret.currency == it.currency }
        if (wallet != null) {
            if (wallet.amount!! > interpret.moneyAmount!!) {
                wallet.amount = wallet.amount!!  - interpret.moneyAmount!!
                store.transaction.add(interpret)
            }
        }
        else{
            println("You dont have enough money!")
        }
    } catch (e: IllegalArgumentException) {
        println(e.toString())
    }


}

fun addIncome(s: String) {

}


