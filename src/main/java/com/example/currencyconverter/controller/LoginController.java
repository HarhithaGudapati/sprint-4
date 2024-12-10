package com.example.currencyconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "logout", required = false) String logout,
                        Model model) {
        if (error != null) {
            model.addAttribute("error", "Invalid username or password."); // Add error message
        }
        if (logout != null) {
            model.addAttribute("message", "You have been logged out successfully."); // Add logout success message
        }
        return "login"; // Render the custom login.html
    }
}
