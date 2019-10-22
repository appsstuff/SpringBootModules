package appsstuff.web.test.demo.controller;
import javax.validation.Valid;
import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import appsstuff.presisence.PerosonDao;
import appsstuff.presisence.Person;
import email.EmaiService;
import email.EmailBody;

@RestController
@RequestMapping()
public class RestControllerClass {

	@Autowired
	private PerosonDao personDao;
	
	@Autowired
	private EmaiService email;
	
	@RequestMapping("/person")
	ResponseEntity<?> getPersonIn(){
		Person p = new Person();
		p.setId(10);
		p.setName("Muhammad");
		personDao.save(p);
		return new ResponseEntity<Person>(p,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	String getTestPersonIn(){
		return "Connected";
	}
	
	@RequestMapping("/sendEmail")
	ResponseEntity<?> SendEmail(@RequestBody @Valid EmailBody body, BindingResult result){
		if(result.hasErrors()) {
			throw new ValidationException("check Email Data" + result.getObjectName());
		}
		email.email(body);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
}
