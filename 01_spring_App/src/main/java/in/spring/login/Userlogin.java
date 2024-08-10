package in.spring.login;

import org.springframework.stereotype.Component;

import in.spring.rep.UserReposetri;
@Component
public class Userlogin  implements UserReposetri {
	public Userlogin() {
  	  System.out.println(" userlogin constructor");
    }
	public String printer() {
 	   return " krish";
    }

}
