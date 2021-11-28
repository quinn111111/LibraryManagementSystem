package Controllers;

import Entity.User1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HttpController{

    @RequestMapping("/hello")
    public ModelAndView handleHello(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }

    @RequestMapping("/param")
    public ModelAndView getParam(User1 user1){
        System.out.println(user1.getUserName());
        System.out.println(user1.getPassword());
        return null;
    }

    @RequestMapping("/test")
    public ModelAndView goToTest(HttpServletRequest request,
                                 HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("formtest");
        return mav;
    }

    @ModelAttribute("/value")
    public void model(Model model) {
        model.addAttribute("message", "成功");
    }

    @RequestMapping("/value")
    public String handleRequest() {
        return "formtest2";
    }


    @RequestMapping("/jump")
    public String jump() {
        return "redirect: ./hello";
    }


    @RequestMapping("/upload")
    public void upload(@RequestParam("picture") MultipartFile picture) throws Exception {
        System.out.println(picture.getOriginalFilename());
    }

    @RequestMapping("/test2")
    public ModelAndView upload() {
        return new ModelAndView("upload");
    }



}
