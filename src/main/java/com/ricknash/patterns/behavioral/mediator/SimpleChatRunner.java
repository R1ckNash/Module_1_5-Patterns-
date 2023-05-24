package com.ricknash.patterns.behavioral.mediator;

public class SimpleChatRunner {

    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToTheChat(user1);
        chat.addUserToTheChat(user2);

        user1.sendMessage("Hello, Im user 1");
        admin.sendMessage("Im Admin");

    }
}
