package com.frankdu.cool.things;

import com.frankdu.cool.app.MyCoolAppScopeModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        addsTo = MyCoolAppScopeModule.class
)
public class ThingyModule {
    @Provides
    @Singleton
    Thingy providesThingy(ThingyImpl thingy){
        return thingy;
    }

}
