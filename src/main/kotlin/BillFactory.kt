abstract class BillFactory {
   abstract fun createFoodBill(amount:Int): FoodBill
   abstract fun createHouseBill(amount:Int): HouseBill
   abstract fun createClothesBill(amount:Int): ClothesBill
   abstract fun createEntertainmentBill(amount:Int): EntertainmentBill
   abstract fun createEducationBill(amount:Int): EducationBill
}