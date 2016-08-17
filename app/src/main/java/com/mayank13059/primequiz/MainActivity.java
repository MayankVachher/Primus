package com.mayank13059.primequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;

/**
 * Created by D4RKF0RCE on 15/08/16.
 */
public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
//        setContentView(R.layout.activity_main);
    }
}
