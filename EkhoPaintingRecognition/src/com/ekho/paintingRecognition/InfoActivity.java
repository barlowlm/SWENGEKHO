package com.ekho.paintingRecognition;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.ekho.modifiedDemo.R;

public class InfoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /*requestWindowFeature( Window.FEATURE_NO_TITLE );

        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN );*/

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setMovementMethod(new ScrollingMovementMethod());

        //configureReturnButton();
    }


    /*private void configureReturnButton(){
        Button returnButton = (Button) findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }*/
}

