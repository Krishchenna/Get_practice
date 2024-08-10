package in.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.spring.dao.UserDao;
import in.spring.service.Userservice;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				          SpringApplication.run(Application.class, args);
		UserDao bean = context.getBean(UserDao.class);
		bean.service();
	}

}
