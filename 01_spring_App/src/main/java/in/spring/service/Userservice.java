package in.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.spring.login.Userlogin;
import in.spring.rep.UserReposetri;

@Component
public class Userservice implements UserReposetri {
	      public Userservice() {
    	  System.out.println(" userservice constructor");
      }
	      public String printer() {
       	   return " krish";
          }    
     
}
