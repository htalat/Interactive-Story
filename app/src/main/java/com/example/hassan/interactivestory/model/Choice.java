package com.example.hassan.interactivestory.model;

/**
 * Created by hassan on 8/25/15.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice (String txt, int n)
    {
        mText = txt;
        mNextPage = n;
    }
    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
