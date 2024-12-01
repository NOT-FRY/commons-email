package com.example.springbootemail.routes;

import com.example.springbootemail.classes.SmtpConfig;
import com.example.springbootemail.views.EmailSenderView;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("send-email")
public class EmailSenderRoute extends EmailSenderView {

    @Autowired
    public EmailSenderRoute(SmtpConfig smtpConfig) {
        super(smtpConfig);
    }
}