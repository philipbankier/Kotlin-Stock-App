import yahoofinance.Stock
import yahoofinance.YahooFinance
import java.math.BigDecimal

fun main(args: Array<String>) {
    var stock : Stock = YahooFinance.get("NVDA")
    var price : BigDecimal = stock.getQuote().getPrice()
    var change : BigDecimal = stock.getQuote().changeInPercent
    stock.print()
    print("Current Stock Price: ")
    print(price)
    print("\n\n Percent Change: ")
    print(change)
    print("\n\n")
}