package com.asahakyan.patterns.adapter.mail.exchange;

public interface ExchangeMailServer {

    /**
     * Fetches unread email sender addresses
     * @return email sender addresses
     */
    String[]/*PHP array*/ listUnreadEmailSenders();

    String getLatestMailContent();

    void sendEmail(String recipientEmailAddress, String title, String body);

}
