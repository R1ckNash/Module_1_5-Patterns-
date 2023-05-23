package com.ricknash.patterns.behavioral.chain;

public class Bugtracker {

    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK.", Priority.ROUTINE);
        System.out.println();
        reportNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT);
        System.out.println();
        reportNotifier.notifyManager("Houston, we've had a problem here!!!", Priority.ASAP);

    }
}
