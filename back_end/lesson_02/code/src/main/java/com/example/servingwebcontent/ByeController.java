package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/bye")
public class ByeController {

    // Curl
    // curl "http://localhost:8080/bye/specialforpost"
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String get(@RequestParam(name="iam", required=false, defaultValue="nobody") String name, @RequestParam(name="second", required=false, defaultValue="nobody") String second)
    {
        return "Bye " + name + "; second " + second;
    }
    /**/

    // Curl
    // curl -X POST -d "John Smith" "http://localhost:8080/bye/specialforpost"
    @RequestMapping(value = "/specialforpost", method = RequestMethod.POST)
    @ResponseBody
    public String get2(@RequestBody String fullName)
    {
        return "I'm post controller and is't passed data " + fullName;
    }
}
