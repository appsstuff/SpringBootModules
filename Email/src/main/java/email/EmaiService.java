package email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class EmaiService {

	@Autowired
	private EmailConfig emailConfig;

	public String email(EmailBody body) {
		try {
		sendEmail().send(setMessga(body)) ;
		return "Success";
		}catch (Exception e) {
			return "fail";
		}
	}
	
	private JavaMailSenderImpl sendEmail() {

		JavaMailSenderImpl email = new JavaMailSenderImpl();
		email.setHost(emailConfig.getHost());
		email.setPort(emailConfig.getPort());
		email.setUsername(emailConfig.getUsername());
		email.setPassword(emailConfig.getPassword());
		return email;

	}

	private SimpleMailMessage setMessga(EmailBody body) {

		SimpleMailMessage mesage = new SimpleMailMessage();
		mesage.setFrom("muhammadyassein@gmail.com");
		mesage.setTo(body.getEmail());
		mesage.setSubject(body.getSubject());
		mesage.setText(body.getMessage());
		return mesage;

	}
}
