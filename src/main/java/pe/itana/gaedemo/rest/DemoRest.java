package pe.itana.gaedemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoRest {
	
	@GetMapping("/hola")
	public ResponseEntity<String> getMessage() {
		return new ResponseEntity("Hola Peru", HttpStatus.OK);
	}

}
