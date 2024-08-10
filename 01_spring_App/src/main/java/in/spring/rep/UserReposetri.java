package in.spring.rep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.spring.login.Userlogin;
@Component
public interface UserReposetri {
	@Autowired
	public  abstract String printer();
	

}
