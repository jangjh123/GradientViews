package com.jangjh123.gradientviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class GradientTextView extends RelativeLayout {
    private TextView textView;

    public GradientTextView(Context context) {
        super(context);
        initView();
    }

    public GradientTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
        getAttrs(attrs);
    }

    public GradientTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        initView();
        getAttrs(attrs, defStyle);
    }

    private void initView() {
        inflate(getContext(), R.layout.gradient_textview, this);
        textView = findViewById(R.id.textView);
    }

    private void getAttrs(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.GradientTextView);
        setTypeArray(typedArray);
    }

    private void getAttrs(AttributeSet attrs, int defStyle) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.GradientTextView, defStyle, 0);
        setTypeArray(typedArray);
    }

    private void setTypeArray(TypedArray typedArray) {
        setText(typedArray.getString(R.styleable.GradientTextView_text));
        setTextSize(typedArray.getFloat(R.styleable.GradientTextView_textSize, 15f));
        setTextBold(typedArray.getInt(R.styleable.GradientTextView_textIsBold, 0));

        int startColor = getGradientStartColor(typedArray.getColor(R.styleable.GradientTextView_textStartColor, 0));
        int endColor = getGradientEndColor(typedArray.getColor(R.styleable.GradientTextView_textEndColor, 0));

        TextPaint paint = textView.getPaint();
        float width = paint.measureText(textView.getText().toString());

        Shader shader = new LinearGradient(0, 0, width, textView.getTextSize(), new int[]{
                startColor, endColor
        }, null, Shader.TileMode.CLAMP);

        textView.getPaint().setShader(shader);
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

    void setTextBold(int isBold) {
        if (isBold == 1) {
            textView.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        }
    }
}
