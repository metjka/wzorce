class TransactionExpression(val ex1: MoneyExpression,
                            val ex2: TransactionTypeExpression
) : Expression {
    override fun interpret(): Transaction {
        val (first, second) = ex1.interpret()
        val interpret2 = ex2.interpret()
        when (interpret2) {
            Type.CLOTHES -> return ClothesTransaction(first, second)
            Type.FOOD -> return FoodTransaction(first, second)
            Type.HOUSE -> return HouseTransaction(first, second)
            Type.ENTERTAINMENT -> return EntertainmentTranscation(first, second)
            Type.EDUCATION -> return EducationTransaction(first, second)
            else -> throw IllegalArgumentException("")
        }
    }
}