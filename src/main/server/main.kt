import org.jetbrains.ktor.content.default
import org.jetbrains.ktor.content.file
import org.jetbrains.ktor.content.files
import org.jetbrains.ktor.content.static
import org.jetbrains.ktor.host.embeddedServer
import org.jetbrains.ktor.netty.Netty
import org.jetbrains.ktor.routing.routing
import org.slf4j.Logger

fun main(args: Array<String>) {
    embeddedServer(Netty, 8080) {
        routing {
            static("static") {
                files("css")
                files("js")
                file("RickMorty.png")
                file("random.txt", "RickMorty.png")
                default("index.html")
            }
        }
    }.start()
}

// logging
fun Logger.error(exception: Throwable) = error(exception.message ?: "Exception of type ${exception.javaClass}", exception)


//fun main(args: Array<String>) {
//
///////// DEV /////////////////////////////////////////////
////    Application.launch(newStockWindow::class.java, *args)
//
//    timerRepeater()
//
//}