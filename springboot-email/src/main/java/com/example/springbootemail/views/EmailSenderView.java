package com.example.springbootemail.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import org.apache.commons.mail2.jakarta.Email;
import org.apache.commons.mail2.jakarta.HtmlEmail;
import org.apache.commons.mail2.core.EmailException;

import com.example.springbootemail.classes.SmtpConfig;
import org.apache.commons.mail2.jakarta.SimpleEmail;

import java.util.Objects;

public class EmailSenderView extends VerticalLayout {

    private final SmtpConfig smtpConfig;

    public EmailSenderView(SmtpConfig smtpConfig) {
        this.smtpConfig = smtpConfig;

        TextField recipientField = new TextField("Recipient Email");
        TextField subjectField = new TextField("Subject");
        TextField messageField = new TextField("Message");

        Button sendButton = new Button("Send Email");
        sendButton.addClickListener(event -> {
            String recipient = recipientField.getValue();
            String subject = subjectField.getValue();
            String message = messageField.getValue();

            if(recipient.isEmpty() || subject.isEmpty() || message.isEmpty()) {
                Notification.show("Please fill the fields");
                return;
            }

            try {
                sendEmail(recipient, subject, message);
                Notification.show("Email sent successfully to " + recipient);
            } catch (Exception e) {
                e.printStackTrace();
                Notification.show("Error sending email: " + e.getMessage());
            }
        });
        Button configButton = new Button("Configure SMTP", event -> getUI().ifPresent(ui -> ui.navigate("smtp-config")));

        add(recipientField, subjectField, messageField, sendButton,configButton);
    }

    private void sendEmail(String recipient, String subject, String message) throws EmailException {

        Email email = new SimpleEmail();
        email.setHostName(smtpConfig.getServer());
        email.setSmtpPort(smtpConfig.getPort());
        email.setAuthentication(smtpConfig.getEmail(), smtpConfig.getPassword());
        email.setSSLOnConnect(true);
        email.setFrom(smtpConfig.getEmail());
        email.setSubject(subject);
        email.setMsg(message);
        email.addTo(recipient);

        email.send();
    }
}
