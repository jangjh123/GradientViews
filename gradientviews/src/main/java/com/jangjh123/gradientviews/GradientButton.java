package com.jangjh123.gradientviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class GradientButton extends RelativeLayout {

    private RelativeLayout button;
    private TextView textView;

    public GradientButton(Context context) {
        super(context);
        initView();
    }

    public GradientButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
        getAttrs(attrs);
    }

    public GradientButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        initView();
        getAttrs(attrs, defStyle);
    }

    private void initView() {
        inflate(getContext(), R.layout.gradient_button, this);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
    }

    private void getAttrs(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.GradientButton);
        setTypeArray(typedArray);
    }

    private void getAttrs(AttributeSet attrs, int defStyle) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.GradientButton, defStyle, 0);
        setTypeArray(typedArray);
    }

    private void setTypeArray(TypedArray typedArray) {
        setText(typedArray.getString(R.styleable.GradientButton_buttonText));
        setTextSize(typedArray.getFloat(R.styleable.GradientButton_buttonTextSize, 15f));
        setButtonColor(typedArray.getColor(R.styleable.GradientButton_buttonTextColor, 0));
        setTextBold(typedArray.getInt(R.styleable.GradientButton_buttonTextIsBold, 0));

        int startColor = getGradientStartColor(typedArray.getColor(R.styleable.GradientButton_buttonStartColor, 0));
        int endColor = getGradientEndColor(typedArray.getColor(R.styleable.GradientButton_buttonEndColor, 0));

        GradientDrawable gradient = new GradientDrawable(
                GradientDrawable.Orientation.LEFT_RIGHT,
                new int[]{startColor, endColor}
        );

        button.setBackground(gradient);
    }

    int getGradientStartColor(int color) {
        return color;
    }

    int getGradientEndColor(int color) {
        return color;
    }

    void setTextSize(float textSize) {
        textView.setTextSize(textSize);
    }

    void setText(String text) {
        textView.setText(text);
    }

    void setButtonColor(int color) {
        textView.setTextColor(color);
    }

    void setTextBold(int isBold) {
        if (isBold == 1) {
            textView.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        }
    }
}
