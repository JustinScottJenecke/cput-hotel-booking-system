package za.ac.cput.cms.booking.controller.views;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Justin Scott Jenecke 215163052
 * REST Controller for generic views and testing
 * Created: 18/10/2021
 * */

@RestController
@RequestMapping("/za.ac.cput.hotelbookingservice/api")
public class loginController {

    @RequestMapping("")
    public String landing() {
        return "/za.ac.cput.hotelbookingservice/api - booking - room";
    }


}
