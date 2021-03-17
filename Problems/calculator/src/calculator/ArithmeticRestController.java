package calculator;

import org.springframework.web.bind.annotation.*;

@RestController
class ArithmeticRestController {
    @GetMapping("/{operation}")
    public String calculate(@PathVariable String operation, int a, int b) {
        switch (operation) {
            case "add":
                return Integer.toString(a + b);
            case "subtract":
                return Integer.toString(a - b);
            case "mult":
                return Integer.toString(a * b);
            default:
                return "Unknown operation";
        }
    }
}