package com.asahakyan.patterns.adapter;

import com.asahakyan.patterns.adapter.mail.OutlookClient;
import com.asahakyan.patterns.adapter.mail.exchange.ExchangeMailServerTest;
import com.asahakyan.patterns.adapter.mail.google.ExchangeMailServerAdapter;
import com.asahakyan.patterns.adapter.mail.google.GoogleMailServerTest;
import com.asahakyan.patterns.runner.PatternRunner;

public class AdapterRunner implements PatternRunner {
    @Override
    public void run() {
        System.out.println("Running ExchangeMailServer");
        OutlookClient outlookClient = new OutlookClient(new ExchangeMailServerTest());
        outlookClient.performEmailActivity();

        System.out.println("Running GoogleMailServer");
        outlookClient = new OutlookClient(new ExchangeMailServerAdapter(new GoogleMailServerTest()));
        outlookClient.performEmailActivity();
    }
}
