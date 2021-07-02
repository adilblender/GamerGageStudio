package com.example.gamergagestudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView fbButton;
    ImageView buttonCall;
    ImageView yTube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yTube = findViewById(R.id.ytube);
        fbButton = findViewById(R.id.fbButton);

        yTube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotUrl("https://www.youtube.com/channel/UCVsxoJLuSuV7T8jTyOPYQQg");
            }
        });
        fbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotUrl("https://www.facebook.com/GamerGageStudio/");
            }
        });

        buttonCall = findViewById(R.id.btncall);
        buttonCall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1234567890"));
                startActivity(intent);

            }
        });

    }

    private void gotUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}