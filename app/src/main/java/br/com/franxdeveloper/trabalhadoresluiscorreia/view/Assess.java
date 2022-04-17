package br.com.franxdeveloper.trabalhadoresluiscorreia.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class Assess extends View {
    int WIDTH,HEIGHT;
    public Assess(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        WIDTH = getWidth();
        HEIGHT = getHeight();
        Log.d("Screen",WIDTH+"");
    }
}
