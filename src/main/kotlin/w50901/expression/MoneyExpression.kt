package w50901.expression

class MoneyExpression(val str: String) : Expression {
    override fun interpret(): Pair<String, Int> {
        val money: Int = Regex("\\d")
                .findAll(str)
                .map { it.value }
                .reduce { acc, s -> acc + s }
                .toInt()

        val dollar = Regex("\\D")
                .findAll(str)
                .map { it.value }
                .reduce { acc, s -> acc + s }


        return Pair(dollar, money)
    }
}