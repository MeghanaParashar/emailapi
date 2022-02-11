package com.email;

import org.springframework.beans.factory.annotation.Autowired;

import com.email.model.EmailRequest;
import com.email.service.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	
	private EmailService emailService;
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "hello this is my email api";
	}
	@RequestMapping(value = "/sendemail",method = RequestMethod.POST)
	public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request)
	{
      
		System.out.println(request);
		boolean result=this.emailService.sendEmail(request.getSubject(),request.getMessage(),request.getTo());
		if (result)
		{
		return ResponseEntity.ok("email is sent successfully");
	}else
	{
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("email not sent");
	}
	}

}
