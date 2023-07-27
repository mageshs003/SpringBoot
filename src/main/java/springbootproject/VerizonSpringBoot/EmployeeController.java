package springbootproject.VerizonSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@RequestMapping("/test")
	@ResponseBody
	// Method
		public String hello()
		{
	return "Hello how are you";
		}
}