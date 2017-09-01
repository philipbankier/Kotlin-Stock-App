package alerts

import com.twilio.Twilio
import com.twilio.rest.api.v2010.account.Message

fun sendText() {
    var accountSid : String = "AC28ba0fe78d9bcd8a5ddf4952f7c2bf6c" // Your Account SID from www.twilio.com/user/account
    var authToken : String = "04c3922d5f2d074d05f414da944aadb8" // Your Auth Token from www.twilio.com/user/account

    Twilio.init(accountSid, authToken)

    var message : Message = Message.creator(
            com.twilio.type.PhoneNumber("2025771006"), // To number
            com.twilio.type.PhoneNumber("+12408475031"), // From number
            " Yo check your stocks!" // SMS body
    ).create()

    print(message.getSid())
}