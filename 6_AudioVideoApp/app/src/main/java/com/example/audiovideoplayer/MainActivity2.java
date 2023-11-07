package com.example.audiovideoplayer;


import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        VideoView videoView = findViewById(R.id.videoView);

        String path = "android.resource://com.example.audiovideoplayer/raw/vishnu";
//        String path = "android.resource://".concat(getPackageName()).concat("/raw/").concat(String.valueOf(R.raw.vishnu));
        Uri uri = Uri.parse(path);

        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}
