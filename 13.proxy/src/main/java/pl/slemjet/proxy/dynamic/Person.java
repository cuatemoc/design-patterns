package pl.slemjet.proxy.dynamic;

import lombok.ToString;
import lombok.extern.java.Log;

@Log
@ToString
class Person implements Human {
    @Override
    public void walk() {
        log.info(String.format("%s walking", toString()));
    }

    @Override
    public void talk() {
        log.info(String.format("%s talking", toString()));
    }
}
