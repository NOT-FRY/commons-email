package com.example.springbootemail.views;

import com.example.springbootemail.classes.SmtpConfig;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView(SmtpConfig smtpConfig) {

        Button configButton = new Button("Configure SMTP", event -> getUI().ifPresent(ui -> ui.navigate("smtp-config")));
        Button sendEmailButton = new Button("Send Email", event -> getUI().ifPresent(ui -> ui.navigate("send-email")));

        add(configButton, sendEmailButton);
    }

}
