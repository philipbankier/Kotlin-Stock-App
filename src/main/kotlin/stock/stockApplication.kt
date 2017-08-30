package stock

import alerts.sendText
import yahoofinance.Stock
import yahoofinance.YahooFinance
import java.math.BigDecimal
import java.util.Date
import java.util.Timer
import java.util.TimerTask

fun timerRepeater() {
    val repeatedTask = object : TimerTask() {
        override fun run() {

            //pull stock information
            var stock : Stock = YahooFinance.get("NVDA")
            var price : BigDecimal = stock.getQuote().getPrice()
            var change : BigDecimal = stock.getQuote().changeInPercent

            //print stock information to console
            stock.print()
            print("Current Stock Price: ")
            print(price)
            print("\n\n Percent Change: ")
            print(change)
            print("\n\n")
            println("Task performed on " + Date() + "\n\n\n")

            var temp : Double = 0.5
            var buffer : BigDecimal = BigDecimal.valueOf(temp)

            if (change > buffer) {
                sendText()
            }
        }
    }
    val timer = Timer("Timer")
    val delay = 1800L
    val period = 1800L
//    val delay = 18000000L
//    val period = 18000000L
    timer.scheduleAtFixedRate(repeatedTask, delay, period)
}