//package newStockForm
//
//import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon.USER
//import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView
//import org.controlsfx.control.Notifications
//import tornadofx.View
//import tornadofx.Form
//import tornadofx.fieldset
//import tornadofx.field
//import tornadofx.textfield
//import tornadofx.bind
//import tornadofx.button
//
//class NewStock : View() {
//    override val root = Form()
//
//    val customer = Stock()
//
//    init {
//        title = "Stock Info and Alert"
//
//        with (root) {
//            fieldset("Stock Information", FontAwesomeIconView(USER)) {
//                field("Stock Name") {
//                    textfield().bind(customer.nameProperty())
//                }
//                field("Email Addresss") {
//                    textfield().bind(customer.emailProperty())
//                }
//                field("Phone Number") {
//                    textfield().bind(customer.phoneProperty())
//                }
//            }
//
//            button("Save") {
//                setOnAction {
//                    Notifications.create()
//                            .title("Stock Added!")
//                            .text("${customer.name} was added with alerts by email to ${customer.email}\nand by text to \n${customer.phone}.")
//                            .owner(this)
//                            .showInformation()
//                }
//
//                // Save button is disabled until every field has a value
//                disableProperty().bind(customer.nameProperty().isNull.or(customer.emailProperty().isNull)
//                        .or(customer.phoneProperty().isNull))
//            }
//        }
//    }
//
//}