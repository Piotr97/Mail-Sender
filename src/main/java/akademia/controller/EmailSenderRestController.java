package akademia.controller;

import akademia.model.MyEmail;
import akademia.service.EmailSenderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mail")
public class EmailSenderRestController {

    private EmailSenderService emailSenderService;

    public EmailSenderRestController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/send")
    public MyEmail sendMail(MyEmail myEmail) {
        return emailSenderService.sendEmail(myEmail);
    }
}
