package lifeplanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/time")
public class TimetableController {

    @GetMapping(value = "/index")
    public String timeIndex() {
        return "time/index";
    }
}
