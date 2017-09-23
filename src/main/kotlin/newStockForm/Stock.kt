//package newStockForm
//
//import tornadofx.getProperty
//import tornadofx.property
//
//class Stock {
//    var name by property<String>()
//    fun nameProperty() = getProperty(Stock::name)
//
//    var email by property<String>()
//    fun emailProperty() = getProperty(Stock::email)
//
//    var phone by property<String>()
//    fun phoneProperty() = getProperty(Stock::phone)
//
//    override fun toString() = name
//}