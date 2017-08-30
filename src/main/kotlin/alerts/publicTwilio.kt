package alerts

import com.twilio.Twilio
import com.twilio.rest.api.v2010.account.Message

fun sendText() {
    var accountSid : String = "<fill this in>" // Your Account SID from www.twilio.com/user/account
    var authToken : String = "<fill this in>" // Your Auth Token from www.twilio.com/user/account

    Twilio.init(accountSid, authToken)

    var message : Message = Message.creator(
            com.twilio.type.PhoneNumber("<fill this in>"),  // To number
            com.twilio.type.PhoneNumber("<fill this in>"),  // From number
            " Yo check your stocks!"                          // SMS body
    ).create();

    //check if sendText is working
    print(message.getSid());
}