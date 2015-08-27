package com.example.hassan.interactivestory.model;

/**
 * Created by hassan on 8/25/15.
 */
public class Page {

    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private Boolean mIsFinal = false;

    public Page(int id , String n , Choice c1, Choice c2){
        mImageId = id;
        mText = n;
        mChoice1 = c1;
        mChoice2 = c2;

    }

    public Boolean getIsFinal() {
        return mIsFinal;
    }

    public void setIsFinal(Boolean isFinal) {
        mIsFinal = isFinal;
    }

    public Page(int id, String n)
    {
        mImageId = id;
        mText = n;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;

    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }
}
