package com.frankdu.cool.things;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
final class ThingyImpl implements Thingy {
    private final Thing thing;

    @Inject
    public ThingyImpl(Thing thing){
        this.thing = thing;
    }

    @Override
    public void doThing() {
        thing.doThing();
    }
}
