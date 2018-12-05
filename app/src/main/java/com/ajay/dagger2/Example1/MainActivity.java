package com.ajay.dagger2.Example1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ajay.dagger2.R;

import java.util.Date;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // In dependency Injection all the work should be done through Interface

    //connection
    // App (MyApplication) - > Create Component -> Connectioned to Module and (contain the details of which acitivy to inject)
    // ->Module --> contain Interface that will do the work ( it has its class for implemention detials

    @Inject
    DateInterface dateInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dateTextView = findViewById(R.id.tvDate);

        // here its a client and we are telling here that it is getting injected ( but it is again Inversion control principle )
        ((MyApplication) getApplication())
                .getMyComponent()
                .inject(MainActivity.this);

        dateTextView.setText((new Date(dateInterface.getDate())).toString());
    }
}
