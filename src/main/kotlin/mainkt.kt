import com.twilio.Twilio
import com.twilio.rest.api.v2010.account.Message
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

            var temp : Double = 0.5

            var buffer : BigDecimal = BigDecimal.valueOf(temp)

            if (change > buffer){
                sendText()
            }
        }
    }
    val timer = Timer("Timer")
    val delay = 10000L
    val period = 10000L
    timer.scheduleAtFixedRate(repeatedTask, delay, period)
}

fun sendText() {
    var accountSid : String = "<fill this in>" // Your Account SID from www.twilio.com/user/account
    var authToken : String = "<fill this in>" // Your Auth Token from www.twilio.com/user/account

    Twilio.init(accountSid, authToken)

    var message : Message = Message.creator(
        com.twilio.type.PhoneNumber("<fill this in>"),  // To number
        com.twilio.type.PhoneNumber("<fill this in>"),  // From number
        " Yo check your stocks!"                                    // SMS body
        ).create();

    print(message.getSid());
}

fun main(args: Array<String>) {
    timerRepeater()
}