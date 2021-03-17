package engine;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;




//@RestController
//@RequestMapping("/payment")
//public class PaymentController {
//
//    private final String sharedKey = "SHARED_KEY";
//
//    private static final String SUCCESS_STATUS = "success";
//    private static final String ERROR_STATUS = "error";
//    private static final int CODE_SUCCESS = 100;
//    private static final int AUTH_FAILURE = 102;
//
//    @GetMapping
//    public BaseResponse showStatus() {
//        return new BaseResponse(SUCCESS_STATUS, 1);
//    }
//
//    @PostMapping("/pay")
//    public BaseResponse pay(@RequestParam(value = "key") String key, @RequestBody PaymentRequest request) {
//
//        final BaseResponse response;
//
//        if (sharedKey.equalsIgnoreCase(key)) {
//            int userId = request.getUserId();
//            String itemId = request.getItemId();
//            double discount = request.getDiscount();
//            // Process the request
//            // ....
//            // Return success response to the client.
//            response = new BaseResponse(SUCCESS_STATUS, CODE_SUCCESS);
//        } else {
//            response = new BaseResponse(ERROR_STATUS, AUTH_FAILURE);
//        }
//        return response;
//    }
//}



@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @GetMapping
    public Quiz getQuiz() {
        String title = "The Java Logo";
        String text = "What is depicted on the Java logo?";
        String[] options = {"Robot","Tea leaf","Cup of coffee","Bug"};
        return new Quiz(title, text, options);
    }

    @PostMapping
    public boolean putAnswer(@RequestBody int index) {
        if (index == 2) {
            return true;
        }
        return false;
    }

}
