package w50901.expression

class StringExpression(val str: String) : Expression {

    override fun interpret(): String {
        return str
    }

}