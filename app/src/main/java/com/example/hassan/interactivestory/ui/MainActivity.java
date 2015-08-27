package com.example.hassan.interactivestory.ui;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hassan.interactivestory.R;

public class MainActivity extends Activity {

    private EditText mNameField;
    private Button start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameField = (EditText) findViewById(R.id.nameEditText);
        start = (Button)   findViewById(R.id.startButton);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = mNameField.getText().toString();
                startStory(name);
            }
        });
    }

    private void startStory(String name) {

        Intent intent = new Intent(this,StoryActivity.class);
        intent.putExtra(getString(R.string.key_name),name);
        startActivity(intent);
    }

    @Override
    protected void onResume(){
            super.onResume();
        mNameField.setText("");
    }


}
