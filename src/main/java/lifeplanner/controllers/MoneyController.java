package lifeplanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/money")
public class MoneyController {

    @GetMapping(value = "/index")
    public String moneyIndex() {
        return "/money/index";
    }

    @GetMapping(value = "/expenditure")
    public String expenditure() {
        return "/money/expenditure";
    }
}
