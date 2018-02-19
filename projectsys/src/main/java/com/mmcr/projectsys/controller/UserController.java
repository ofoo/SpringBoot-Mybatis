package com.mmcr.projectsys.controller;

import com.mmcr.projectsys.entity.User;
import com.mmcr.projectsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Created by Administrator on 2018/2/12.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private MessageSource messageSource;

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", "Hello World");
        return "welcome";
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping("/user/list")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @PostMapping("/user/add")
    public int addUser(@RequestParam String nickname) throws Exception{
        //return userService.addUser(nickname);
        System.out.println("a");
        throw  new Exception();
    }

    @PostMapping("/user/update")
    public int updateUser(@RequestParam Long id, @RequestParam String nickname){
        //return userService.updateUser(id, nickname);
        return 0;
    }

    @GetMapping("/user/delete")
    public int deleteUser(@RequestParam Long id){
        return userService.deleteUser(id);
    }



    @PostMapping("/user/register")
    public String userRegister(@Valid User user, BindingResult result){
        if(result.hasErrors()){
            StringBuffer msg = new StringBuffer();
            List<FieldError> fieldErrors = result.getFieldErrors();
            Locale currentLocale = LocaleContextHolder.getLocale();
            for(FieldError fieldError : fieldErrors){
                String errorMessage = messageSource.getMessage(fieldError, currentLocale);
                msg.append(fieldError.getField() + "：" + errorMessage + ",");
            }
            return msg.toString();
        }
        userService.addUser(user);
        return "验证通过，昵称：" + user.getNickname() + "密码：" + user.getPassword() + "性别：" + user.getGender() + "头像：" + user.getHeadPortrait() + "手机号：" + user.getCellPhoneNumber();
    }

    @GetMapping("/user/login")
    public String userLogin(){
        return "";
    }

    @GetMapping("/user/exit")
    public String userExit(){
        return "";
    }
}
