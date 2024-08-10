package in.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.spring.rep.UserReposetri;
@Component
public class UserDao {
	@Autowired
	 public void service() {
		 
		 final UserReposetri login=null ;
   	  String name = login.printer();
   	  System.out.println(name);
     }
}
