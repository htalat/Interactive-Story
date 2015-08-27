package com.example.hassan.interactivestory.ui;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hassan.interactivestory.R;
import com.example.hassan.interactivestory.model.Page;
import com.example.hassan.interactivestory.model.Story;

public class StoryActivity extends Activity {

    private Story mStory = new Story();

    private ImageView mImageView;
    private TextView mTextView;
    private Button mChoice1;
    private Button mChoice2;
    private String mName;
    private Page mCurrentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        mName = intent.getStringExtra(getString(R.string.key_name));
        if(mName == null)
            mName = "dost";

        mImageView = (ImageView) findViewById(R.id.storyImageView);
        mTextView = (TextView) findViewById(R.id.storyTextView);
        mChoice1 = (Button) findViewById(R.id.choiceButton1);
        mChoice2 = (Button) findViewById(R.id.choiceButton2);
        loadPage(0);
    }
    private void loadPage(int choice)
    {
        mCurrentPage = mStory.getPage(choice);
        mImageView.setImageResource(mCurrentPage.getImageId());
        String pageText = mCurrentPage.getText();
        pageText = String.format(pageText,mName);
        mTextView.setText(pageText);
        if(mCurrentPage.getIsFinal())
        {
            mChoice1.setVisibility(View.INVISIBLE);
            mChoice2.setText("PLAY AGAIN");
            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

        }else {
            mChoice1.setText(mCurrentPage.getChoice1().getText());
            mChoice2.setText(mCurrentPage.getChoice2().getText());

            mChoice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    loadPage(mCurrentPage.getChoice1().getNextPage());

                }
            });

            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    loadPage(mCurrentPage.getChoice2().getNextPage());

                }
            });
        }

    }

}
