package springbootproject.VerizonSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "BeanAnnotation")
public class EmployeeConfig {
	
	
		@Bean
		public Employee employeeBean()
		{
			return new Employee();
		}

	}


