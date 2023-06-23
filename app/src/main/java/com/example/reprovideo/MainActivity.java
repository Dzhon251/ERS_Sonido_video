package com.example.reprovideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;



public class MainActivity extends AppCompatActivity {

       VideoView VideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView= (VideoView) findViewById(R.id.Video1);


        VideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.espe));


        MediaController mediaController=new MediaController(this);

        VideoView.setMediaController(mediaController);

        mediaController.setAnchorView(VideoView);

        VideoView.start();

        Button playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView.start();
            }
        });
    }
}