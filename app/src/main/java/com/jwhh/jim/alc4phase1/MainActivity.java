package com.jwhh.jim.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set 'Welcome to ALC 4.0' {welcomeTextView} to BOLD.
        ((TextView) findViewById(R.id.welcomeTextView)).setTypeface(null, Typeface.BOLD);
    }
    public void aboutALC_Click(View view) {
        startActivity(new Intent(this, AboutALCActivity.class));
}
    public void myProfile_Click(View view) {
        startActivity(new Intent(this, MyProfileActivity.class));
    }
}
