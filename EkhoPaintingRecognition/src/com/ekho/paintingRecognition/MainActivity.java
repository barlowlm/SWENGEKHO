package com.ekho.paintingRecognition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ekho.modifiedDemo.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = (Button) findViewById(R.id.camera_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PaintingClassifierActivity.class);
                startActivity(intent);
                // Code here executes on main thread after user presses button
            }
        });

        configureNextButton();
    }

    private void configureNextButton() {
        Button moreInfoButton = (Button) findViewById(R.id.more_info);
        moreInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InfoActivity.class));

            }

        });

    }

}
