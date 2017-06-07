interface Expression {

    abstract val str: String

    fun interpret(): Bill

}

class WalletExpression(override val str: String) : Expression {
    override fun interpret(): Bill {
        TODO()
    }
}

class TransactionExpression(override val str: String) : Expression {
    override fun interpret(): Bill {
        TODO("not implemented")
    }
}
class MoneyExpression(override val str: String) :Expression {
    override fun interpret(): Bill {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
class