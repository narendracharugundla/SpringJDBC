/**
 * 
 */
package com.example.demo;

/**
 * @author a807228
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

   @RequestMapping("/")
   public String helloWorld(){
       return "hello";
   }
}