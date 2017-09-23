//import org.jetbrains.ktor.content.*
//import org.jetbrains.ktor.host.embeddedServer
//import org.jetbrains.ktor.netty.Netty
//import org.jetbrains.ktor.routing.routing
//import java.io.File
//
//
//fun main(args: Array<String>) {
//    embeddedServer(Netty, 8080) {
//        routing {
//            static("static") {
//                files("css")
//                files("js")
//                file("RickMorty.png")
//                file("random.txt", "RickMorty.png")
//                default("index.html")
//            }
//            static("custom") {
//                staticRootFolder = File("/home/philip/Desktop/Dev/Kotlin/Stock/stockApp/src/main") // Establishes a root folder
//                files("staticContent") // For this to work, make sure you have /tmp/public on your system
//                static("themes") { // services /custom/themes
//                    files("data")
//                }
//            }
//        }
//    }.start()
//}
//
//
////fun main(args: Array<String>) {
////
/////////// DEV /////////////////////////////////////////////
//////    Application.launch(newStockWindow::class.java, *args)
////
////    timerRepeater()
////
////}