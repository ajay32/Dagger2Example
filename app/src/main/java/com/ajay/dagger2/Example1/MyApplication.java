package com.ajay.dagger2.Example1;

import android.app.Application;
//** dont forget to put that in Manifest file
public class MyApplication extends Application {
    // this class initilize the Component

    private MyComponent mMyComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mMyComponent = createMyComponent();
    }

    MyComponent getMyComponent() {
        return mMyComponent;
    }

    private MyComponent createMyComponent() {
        return DaggerMyComponent
                .builder()
                .myModule(new MyModule())
                .build();
    }
}
