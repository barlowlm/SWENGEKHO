package com.ekho.modifiedDemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.app.Activity;



import com.ekho.paintingRecognition.PaintingClassifierActivity;

public class DisplayResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(PaintingClassifierActivity.EXTRA_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(message);

    }
}
