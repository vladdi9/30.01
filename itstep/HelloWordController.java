package org.itstep;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @RequestMapping

    public String helloWord(){
        return "Hello World"+
                "<p> <a href='http://localhost:8080/by'> Вперед </a></p>";
    }
    @RequestMapping("/by")

    public String by(){
        return "<p> Good bue </p>"+
        "<p><b> Good bue2 </b></p>"+
                "<br> bb </br>"+
                "<a href='/'> Назад </a>";
    }
}
