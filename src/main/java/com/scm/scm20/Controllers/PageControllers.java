package com.scm.scm20.Controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class PageControllers {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page return ");
        //Sending to data view 
        model.addAttribute("name", "Welcome to Spring Boot class ");
        model.addAttribute("Github","https://github.com/Shani871");
        return "home";

    }

    //About Raute
    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("About page ");
        return "about";
    }
    // Services Raute
    @RequestMapping("/services")
    public String  servicesPage(){
        System.out.println("Services Page ");
        return "services";
    }

    // Contact Raute
   @GetMapping("/contact")
   public String contact() {
       return new String("contact");
   }
   
   @GetMapping("/login")
   public String login() {
       return new String("login");
   }
   
   @GetMapping("/register")
   public String register(){
    
    return "register";
   }

}
