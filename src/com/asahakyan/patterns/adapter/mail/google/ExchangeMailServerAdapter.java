package com.asahakyan.patterns.adapter.mail.google;

import com.asahakyan.patterns.adapter.mail.exchange.ExchangeMailServer;

import java.util.Map;

public class ExchangeMailServerAdapter implements ExchangeMailServer {
    private GoogleMailServer mailServer;

    public ExchangeMailServerAdapter(GoogleMailServer googleMailServer) {
        this.mailServer = googleMailServer;
    }

    @Override
    public String[] listUnreadEmailSenders() {
        Map<String, String> emails = mailServer.fetchUnreadEmailsDetails();
        return (String[]) emails.keySet().toArray(new String[0]);
    }

    @Override
    public String getLatestMailContent() {
        return mailServer.getLastMailBody();
    }

    @Override
    public void sendEmail(String recipientEmailAddress, String title, String body) {
        GoogleMailToSend email = new GoogleMailToSend(recipientEmailAddress, title, body);
        mailServer.sendEmail(email);
    }
}
