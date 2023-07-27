package springbootproject.VerizonSpringBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {
	@GetMapping("/api/catalog")
	//@RequestMapping("/api/catalog")
	//@ResponseBody
	public ArrayList<String> getCatalog()
	{
		Employee e=new Employee();
		return e.getCatalogList();
	}
	@PostMapping("/api/catalog")
		String postCatalog(@RequestBody String data) {
		return "Data posted"+data;
	}
	@PostMapping("/api/catalog2")
		String postCatalog2(@RequestBody Employee data) {
		return( "Data posted"+data.getUserId()+" "+data.getName());
	}
	@PostMapping("/api/catalog3")
	String postCatalog3(@RequestBody List<Employee> data) {
	return( "Data posted"+data.get(0).getUserId()+" "+data.get(1).getUserId());
}
	@PutMapping("/api/catalog/{id}")
	String putCatalog(@PathVariable int id) {
		return "Data updated" +id;
	}
	@DeleteMapping("/api/catalog/{id}")
	boolean deleteCatalog(@PathVariable int id) {
		return true;
	}
	
}

