package com.notyetdecided.flightbooking.Controllers;

import com.notyetdecided.flightbooking.Model.User;
import com.notyetdecided.flightbooking.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.transaction.SystemException;
import java.lang.module.InvalidModuleDescriptorException;

@Controller
public class UserController {


    @Autowired
    private UserRepository userRepository;


    @RequestMapping("/home")
    public String showHomePage(){
        return"home";
    }
    @RequestMapping("/RegistrationPage")
    private String showRegistrationPage(){
        return "login/registerUser.html";
    }


    @RequestMapping(value = "registerUser",method = RequestMethod.POST)
    private String registerUser (@ModelAttribute @NonNull User user, ModelMap modelMap) throws Exception {
        //String encryptedPassword=
        userRepository.save(user);
        String msg="User Registered Successfully. Please login to use application";
        modelMap.addAttribute("msg",msg);
        return "login/login";
    }


    @RequestMapping("loginPage")
    private String loginPage(){
        return "login/login";
    }

    @RequestMapping ("login")
    private String login(@RequestParam("email") String email,@RequestParam("password") String password,ModelMap modelMap ){
      User user= userRepository.findByEmail(email);
       if(user == null){
           String msg="Invalid Credentials";
           modelMap.addAttribute("msg",msg);
           return "login/login";
       }
       if(user.getPassword().equals(password))
       return "findFlights.html";

       String msg="Invalid Credentials";
       modelMap.addAttribute("msg",msg);
       return "login/login";
    }

}
