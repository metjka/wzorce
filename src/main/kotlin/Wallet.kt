abstract class Wallet : Prototype() {

    abstract var amount: Int?
    abstract var currency: String?
    abstract var name:String?

    fun calculate(transaction: Int) {
        amount = amount?.plus(transaction)
    }

}