/**
 * 
 */
package com.example.demo;

/**
 * @author a807228
 *
 */
public class DefaultHelloService implements HelloService {

    @Override
    public void hello() {
       System.out.println("Hello from Hello Service");
    }
}
