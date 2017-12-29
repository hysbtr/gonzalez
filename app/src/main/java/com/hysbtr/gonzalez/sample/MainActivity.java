package com.hysbtr.gonzalez.sample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;

import com.hysbtr.gonzalez.layout.GonRelativeLayout;
import com.hysbtr.gonzalez.view.GonTextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        GonTextView addBtn = new GonTextView(this);
        ((GonRelativeLayout) findViewById(R.id.root)).addView(addBtn);
        addBtn.setGonTextSize(80);
        addBtn.setGonSize(300, 120);
        addBtn.setGonMargin(0, 5, 10, 5);
        addBtn.setText("adsfasdfsdff");
        addBtn.setBackgroundColor(Color.parseColor("#ff00ff"));
    }
}
