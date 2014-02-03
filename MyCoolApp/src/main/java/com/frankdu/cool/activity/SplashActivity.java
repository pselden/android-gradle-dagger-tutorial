package com.frankdu.cool.activity;

import android.content.Intent;
import android.os.Bundle;

import com.frankdu.cool.things.Thing;
import com.frankdu.cool.things.Thingy;

import javax.inject.Inject;

public class SplashActivity extends BaseCoolActivity {
    @Inject
    Thingy thingy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // You may do many cool things here:
        // 1. You may show a splash screen here
        // 2. You may show warm greeting here.
        // 3. You may check user login and ask for login if applicable.
        // 4. ....and so on
        //
        // For Facebook login integration on android, check
        //     https://developers.facebook.com/docs/android/login-with-facebook/

        // We we simply start next activity
        thingy.doThing();
        Intent nextIntent = getNextIntent();
        startActivity(nextIntent);
        finish();

    }

    private Intent getNextIntent() {
        Intent intent = new Intent(this, MainCoolActivity.class);
        return intent;
    }
}