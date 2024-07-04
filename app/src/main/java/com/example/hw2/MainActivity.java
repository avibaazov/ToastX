package com.example.hw2;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.toastx.ToastManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        ToastManager toastManager = new ToastManager(this);
        ToastManager.warning(this, "This is a warning message", Toast.LENGTH_SHORT);
        ToastManager.success(this, "This is a success message", Toast.LENGTH_SHORT);
        ToastManager.error(this, "This is an error message", Toast.LENGTH_LONG);
        ToastManager.info(this, "This is an info message", Toast.LENGTH_SHORT);

        // Test the simplified methods with custom positions
        ToastManager.warningAtPosition(this, "This is a warning message at position", Toast.LENGTH_SHORT, Gravity.TOP, 0, 100);
        ToastManager.successAtPosition(this, "This is a success message at position", Toast.LENGTH_SHORT, Gravity.TOP, 0, 100);
        ToastManager.errorAtPosition(this, "This is an error message at position", Toast.LENGTH_LONG, Gravity.BOTTOM, 0, 100);
        ToastManager.infoAtPosition(this, "This is an info message at position", Toast.LENGTH_SHORT, Gravity.CENTER, 0, 100);

    }
    }
