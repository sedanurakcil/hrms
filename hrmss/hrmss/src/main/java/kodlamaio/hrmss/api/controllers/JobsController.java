package kodlamaio.hrmss.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmss.business.abstracts.JobService;
import kodlamaio.hrmss.entities.concretes.Job;


@RestController
@RequestMapping("/api/jobs")

public class JobsController {
	
private JobService jobService;
	
	
	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}



	@GetMapping("/getall")
	public List<Job> getAll(){
		
		 return this.jobService.getAll();
		
	}

}
