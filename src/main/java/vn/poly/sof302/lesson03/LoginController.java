package vn.poly.sof302.lesson03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.poly.sof302.lesson03.form.LoginForm;

@Controller
@RequestMapping("/auth")
public class LoginController {

    @GetMapping("/login")
    public String input(ModelMap model) {

        LoginForm loginForm = new LoginForm();
        loginForm.setUsername("Hello Username");
        loginForm.setPassword("");
        loginForm.setRemember(true);

        model.addAttribute("loginForm", loginForm);

        return "/auth/login/input";
    }

    @PostMapping("/login")
    public String submit(ModelMap model, LoginForm loginForm) {

        model.addAttribute("loginForm", loginForm);

        return "/auth/login/result";
        //return "redirect:/";
    }
}
