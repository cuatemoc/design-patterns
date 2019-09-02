package pl.slemjet.state.manual;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneMachine {
    private Map<State, List<Pair<Trigger, State>>> rules = new HashMap<>();

    public Map<State, List<Pair<Trigger, State>>> getRules() {
        return rules;
    }

    public PhoneMachine() {
        rules.put(State.OFF_HOOK, List.of(
                new Pair<>(Trigger.CALL_DIALED, State.CONNECTED),
                new Pair<>(Trigger.STOP_USING_PHONE, State.ON_HOOK)
        ));

        rules.put(State.CONNECTING, List.of(
                new Pair<>(Trigger.HUNG_UP, State.OFF_HOOK),
                new Pair<>(Trigger.CALL_CONNECTED, State.CONNECTED)
        ));

        rules.put(State.CONNECTED, List.of(
                new Pair<>(Trigger.LEFT_MESSAGE, State.OFF_HOOK),
                new Pair<>(Trigger.HUNG_UP, State.OFF_HOOK),
                new Pair<>(Trigger.PLACED_ON_HOLD, State.ON_HOLD)
        ));

        rules.put(State.ON_HOLD, List.of(
                new Pair<>(Trigger.TAKEN_ON_HOLD, State.ON_HOOK), // Error! should be State.CONNECTED
                new Pair<>(Trigger.HUNG_UP, State.OFF_HOOK)
        ));


    }
}
