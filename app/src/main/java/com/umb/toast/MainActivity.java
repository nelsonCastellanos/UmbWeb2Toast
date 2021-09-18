package com.umb.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast();
    }

    private void showToast(){
        Context context = getApplicationContext();
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(
            R.layout.toast_fragment,
            findViewById(R.id.toast_layout_root),false
        );
        TextView textToast = layout.findViewById(R.id.text_toast);
        textToast.setText(getResources().getString(R.string.app_toast));
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}