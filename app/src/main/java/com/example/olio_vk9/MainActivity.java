package com.example.olio_vk9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserStorage u = UserStorage.getInstance();
    }

    public void switchToAskInformation(View view) {
        Intent intent = new Intent(this, AskInformationActivity.class);
        startActivity(intent);
    }


}