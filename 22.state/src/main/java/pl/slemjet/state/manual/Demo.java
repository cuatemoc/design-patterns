package pl.slemjet.state.manual;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    private static State currentState = State.OFF_HOOK;
    private static State exitState = State.ON_HOOK;

    public static void main(String[] args) {
        PhoneMachine phone = new PhoneMachine();

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println(String.format("Phone is currently: %s", currentState));
            System.out.println("Please select:");

            for (int i = 0; i < phone.getRules().get(currentState).size(); i++) {
                Trigger trigger = phone.getRules().get(currentState).get(i).getKey();
                System.out.println(String.format("%s. %s", i, trigger.toString()));
            }

            boolean isOk;
            int choice = 0;
            do {
                try {
                    System.out.println("please enter your choice:");
                    choice = Integer.parseInt(console.readLine());
                    isOk = choice >= 0 && choice < phone.getRules().get(currentState).size();
                } catch (IOException e) {
                    System.out.println(String.format("Wrong input! %s", e.getMessage()));
                    isOk = false;
                }
            } while (!isOk);

            currentState = phone.getRules().get(currentState).get(choice).getValue();

            if (currentState == exitState) {
                System.out.println("Done using phone");
                break;
            }

            System.out.println("Executing action");
        }

    }
}
