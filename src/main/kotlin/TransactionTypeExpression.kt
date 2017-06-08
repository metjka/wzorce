class TransactionTypeExpression(val str: String) : Expression {
    override fun interpret(): Type {
        when (str) {
            "CLOTHES" -> {
                return Type.CLOTHES
            }
            "FOOD" -> {
                return Type.FOOD
            }
            "HOUSE" -> {
                return Type.HOUSE
            }
            "ENTERTAINMENT" -> {
                return Type.ENTERTAINMENT
            }
            "EDUCATION" -> {
                return Type.EDUCATION
            }
            else -> {
                throw IllegalArgumentException("Error while parsing string!")
            }
        }

    }
}