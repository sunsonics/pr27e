package com.example.pr27e;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Создаем экземпляр класса Draw2D
        Draw2D draw2D = new Draw2D(this);

        // Устанавливаем Draw2D в качестве содержимого экрана
        setContentView(draw2D);
    }
}