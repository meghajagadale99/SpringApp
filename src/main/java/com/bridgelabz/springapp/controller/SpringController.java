package com.bridgelabz.springapp.controller;

import com.bridgelabz.springapp.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class SpringController {
    //localhost:8080/hello
    @RequestMapping(value = {" ", "/", "/home"})
    public String sayHello() {
        return "Hello From Bridgelabz";

    }
    //localhost:8080/hello/query?name=megha
    @RequestMapping(value = {"/name"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    //localhost:8080/hello/param/megha
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello" + " " + lastName + "!";
    }

    @PutMapping("/putuser")
    public String sayHelloUser(@RequestBody User user){
        log.info(user.toString());
        return "Hello "+ user.toString();
    }


}
