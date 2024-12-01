package com.example.springbootemail.routes;

import com.example.springbootemail.classes.SmtpConfig;
import com.example.springbootemail.views.SmtpConfigView;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("smtp-config")
public class SmtpConfigRoute extends SmtpConfigView {

    @Autowired
    public SmtpConfigRoute(SmtpConfig smtpConfig) {
        super(smtpConfig);
    }
}
