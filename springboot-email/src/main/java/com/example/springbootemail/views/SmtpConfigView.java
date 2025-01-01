package com.example.springbootemail.views;

import com.example.springbootemail.classes.SmtpConfig;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;

public class SmtpConfigView extends VerticalLayout {

    private final SmtpConfig smtpConfig;

    public SmtpConfigView(SmtpConfig smtpConfig) {
        this.smtpConfig = smtpConfig;

        TextField smtpServerField = new TextField("SMTP Server");
        TextField smtpPortField = new TextField("SMTP Port");
        TextField emailField = new TextField("Email");
        PasswordField passwordField = new PasswordField("Password");

        // Prepopola i campi con i valori esistenti
        smtpServerField.setValue(smtpConfig.getServer() != null ? smtpConfig.getServer() : "");
        smtpPortField.setValue(String.valueOf(smtpConfig.getPort()));
        emailField.setValue(smtpConfig.getEmail() != null ? smtpConfig.getEmail() : "");
        passwordField.setValue(smtpConfig.getPassword() != null ? smtpConfig.getPassword() : "");

        Button saveButton = new Button("Save Configuration");
        saveButton.addClickListener(event -> {
            try {

                smtpConfig.setServer(smtpServerField.getValue());
                smtpConfig.setPort(Integer.parseInt(smtpPortField.getValue()));
                smtpConfig.setEmail(emailField.getValue());
                smtpConfig.setPassword(passwordField.getValue());

                Notification.show("SMTP configuration saved successfully!");
                saveButton.getUI().ifPresent(ui -> ui.navigate("send-email"));
            } catch (Exception e) {
                Notification.show("Error saving configuration: " + e.getMessage());
            }
        });

        // Aggiungi i componenti all'interfaccia
        add(smtpServerField, smtpPortField, emailField, passwordField, saveButton);
    }
}

