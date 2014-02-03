package com.frankdu.cool.app;

import com.frankdu.common.DaggerApplication;
import com.frankdu.cool.things.Thingy;
import com.frankdu.cool.things.ThingyModule;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

public class MyCoolApplication extends DaggerApplication {
    @Inject
    Thingy thingy;

    @Override
    protected List<Object> getAppModules() {
        return Arrays.asList(new MyCoolAppScopeModule(), new ThingyModule());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        thingy.doThing();
    }
}