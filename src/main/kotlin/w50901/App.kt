package w50901

import w50901.expression.*

val store = Store
fun main(args: Array<String>) {

    while (true) {
        readLine()?.let {
            w50901.run(it)
        }
    }
}

private fun run(it: String) {
    try {
        when {
            it.startsWith("INCOME") -> {
                w50901.addIncome(it)
            }
            it.startsWith("WASTE") -> {
                w50901.addWaste(it)
            }
            it.startsWith("WALLET") -> {
                w50901.addWallet(it)
            }
            it.startsWith("WS") -> {
                Store.wallets.forEach { println(it.toString()) }
            }
            it.startsWith("TS") -> {
                Store.transaction.forEach { println(it.toString()) }
            }
            it.startsWith("EXIT") -> {
                System.exit(0)
            }
            else -> {
                throw IllegalArgumentException("Error while parsing string")
            }
        }
    } catch (e: Exception) {
        println("Error!")
    }
}

fun addWallet(string: String) {
    val split: List<List<String>> = string.split(",").map { it.split("=") }
    val wallet: Wallet = WalletExpression(
            MoneyExpression(split[0][1]),
            StringExpression(split[1][1]))
            .interpret()
    try {
        Store.wallets.add(wallet)
    } catch (e: IllegalArgumentException) {
        println(e.toString())
    }
    Store.wallets.forEach { println(it.toString()) }
}

fun addWaste(s: String) {
    val split: List<List<String>> = s.split(",").map { it.split("=") }
    val interpret = TransactionExpression(MoneyExpression(split[0][1]),
            TransactionTypeExpression(split[1][1]))
            .interpret()
    try {
        val wallet: Wallet? = Store.wallets.find { interpret.currency == it.currency }
        if (wallet != null) {
            if (wallet.amount!! > interpret.moneyAmount!!) {
                wallet.amount = wallet.amount!! - interpret.moneyAmount!!
                Store.transaction.add(interpret)
                println(interpret.toString())
            } else println("You don`t have enough money!")
        } else {
            println("You don`t have enough money or ${interpret.currency} wallet!")
        }
    } catch (e: IllegalArgumentException) {
        println(e.toString())
    }


}

fun addIncome(s: String) {
    val split: List<List<String>> = s.split(",").map { it.split("=") }
    val interpret = TransactionExpression(MoneyExpression(split[0][1]),
            TransactionTypeExpression(split[1][1]))
            .interpret()

    try {
        val wallet: Wallet? = Store.wallets.find { interpret.currency == it.currency }
        if (wallet != null) {
            wallet.amount = wallet.amount!! + interpret.moneyAmount!!
            Store.transaction.add(interpret)
            println(interpret.toString())
        } else {
            println("You don`t have ${interpret.currency} wallet!")
        }
    } catch (e: IllegalArgumentException) {
        println(e.toString())
    }
}


