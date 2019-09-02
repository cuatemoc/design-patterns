package pl.slemjet.state.spring;

// plural because SSM defines a class called State already
enum States
{
    OFF_HOOK, // starting
    ON_HOOK, // terminal
    CONNECTING,
    CONNECTED,
    ON_HOLD
}
