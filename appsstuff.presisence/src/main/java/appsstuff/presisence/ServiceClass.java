package appsstuff.presisence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {

	private PerosonDao service;

	@Autowired
	public ServiceClass(PerosonDao service) {
		super();
		this.service = service;
	}
	
}
