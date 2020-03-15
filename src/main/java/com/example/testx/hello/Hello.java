package com.example.testx.hello;


import com.example.testx.Models.Poste;
import com.example.testx.Models.Salarie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
public class Hello {

    @RequestMapping("/")
    public String hello() throws IOException {
        //String text = "Hello World";
        Salarie salarie = new Salarie();
        Poste poste = new Poste();
        salarie.setNom("khalil");

        String text = salarie + "\n"+poste ;


        return text;
    }
}
