import yahoofinance.Stock
import yahoofinance.YahooFinance
import java.math.BigDecimal
import java.util.Date
import java.util.TimerTask
import java.util.Timer


fun timerRepeater() {
    val repeatedTask = object : TimerTask() {
        override fun run() {
            var stock : Stock = YahooFinance.get("NVDA")
            var price : BigDecimal = stock.getQuote().getPrice()
            var change : BigDecimal = stock.getQuote().changeInPercent
            stock.print()
            print("Current Stock Price: ")
            print(price)
            print("\n\n Percent Change: ")
            print(change)
            print("\n\n")
            println("Task performed on " + Date())
        }
    }
    val timer = Timer("Timer")

    val delay = 10000L
    val period = 10000L
    timer.scheduleAtFixedRate(repeatedTask, delay, period)
}

fun main(args: Array<String>) {
    timerRepeater()
}