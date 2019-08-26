package pl.slemjet.mediator.chatroom;

import java.util.ArrayList;
import java.util.List;

class ChatRoom {
    private List<Person> people = new ArrayList<>();

    public void broadcast(String source, String message) {
        people.stream()
                .filter(person -> !person.name.equals(source))
                .forEach(person -> person.receive(source, message));
    }

    public void join(Person p) {
        String joinMsg = p.name + " joins the chat";
        broadcast("room", joinMsg);

        p.room = this;
        people.add(p);
    }

    public void message(String source, String destination, String message) {
        people.stream()
                .filter(p -> p.name.equals(destination))
                .findFirst()
                .ifPresent(person -> person.receive(source, message));
    }
}
