package com.forwork.forwork;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    public class PostController {
        @GetMapping("/post")
        public String about(Model model) {
            model.addAttribute("title", "Публікації");
            return "post-main";
        }
}
