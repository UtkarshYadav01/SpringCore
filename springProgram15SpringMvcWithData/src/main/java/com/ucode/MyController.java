package com.ucode;

import com.ucode.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    //@RequestMapping(value = "/helloPage", method = RequestMethod.GET)
    @GetMapping("/helloPage")
    public ModelAndView openHelloPage() {

        System.out.println("openHelloPage() method executed!! ");
        //ModelAndView mav = new ModelAndView("hello");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        return mav;
    }

    @GetMapping("/aboutUs")
    public String openAboutUsPage() {
        return "about-us";
    }

    @GetMapping("/myForm")
    public String openMyFormPage() {
        return "my-form";
    }

    //0
    /*@PostMapping( " /submitForm " )
    public String handleMyForm(HttpServletRequest req) {

        // Print values (optional for debugging)
        String myname=req.getParameter("name");
        String myemail=req.getParameter("email");;
        String myphno=req.getParameter("phoneno");;
        System.out.println(myname);
        System.out.println(myemail);
        System.out.println(myphno);

        return "profile";
    }*/

    //1
    /*@PostMapping("/submitForm")
    public String handleMyForm(
            @RequestParam("name1") String myname,
            @RequestParam("eamil1") String myemail,
            @RequestParam("phoneno1") String myphno,
            Model model) {

        // Print values (optional for debugging)
        System.out.println(myname);
        System.out.println(myemail);
        System.out.println(myphno);

        // Add values to the model
        model.addAttribute("model_name",myname);
        model.addAttribute("model_email",myemail);
        model.addAttribute("model_phno",myphno);

        // Return view name to be rendered
        return "profile";
    }*/

    //2
    /*@PostMapping("/submitForm")
    public String handleMyForm(
            @RequestParam("name1") String myname,
            @RequestParam("eamil1") String myemail,
            @RequestParam("phoneno1") String myphno,
            Model model) {

        System.out.println(myname);
        System.out.println(myemail);
        System.out.println(myphno);

        User user = new User();
        user.setName(myname);
        user.setEmail(myemail);
        user.setPhoneNo(myphno);

        model.addAttribute("model_user",user);

        return "profile";
    }*/

    //3
    /*@PostMapping("/submitForm")
    public String handleMyForm(@ModelAttribute User user) {

        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPhoneNo());

        return "profile";
    }*/

    //4
    /*@PostMapping("/submitForm")
    public String handleMyForm(@ModelAttribute("model_user") User user) {

        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPhoneNo());

        return "profile";
    }*/

    //final
    @PostMapping("/submitForm")
    public String handleMyForm(@ModelAttribute User user) {
        return "profile";
    }
}
