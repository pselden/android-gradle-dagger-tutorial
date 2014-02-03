package com.frankdu.cool.things;

import android.content.Context;
import android.util.Log;

import com.frankdu.common.ForApplication;

import javax.inject.Inject;

/**
 * Created by paulselden on 2/3/14.
 */
public class Thing {
    private final Context context;

    @Inject
    public Thing(@ForApplication Context context){
        this.context = context;
        Log.e("Thing", "loading a thing");

    }

    public void doThing(){
        Log.e("Thing", "doing a thing");
    }
}
