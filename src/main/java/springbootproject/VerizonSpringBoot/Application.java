package springbootproject.VerizonSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(EmployeeConfig.class);
		SpringApplication.run(Application.class, args);
		Employee employee= context.getBean("employeeBean", Employee.class);
		employee.test();
	}
}
