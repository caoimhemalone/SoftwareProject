//Ref: for vlc live stream: https://www.youtube.com/watch?v=JjPsW-7FUng
//For streaming tutorial for Android studios: https://www.youtube.com/watch?v=oEgpGv2CF1U

package com.example.caoimhemalone.amazonaws.softwareproject;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class Livestream extends AppCompatActivity {

    private Button HButton,CButton, EButton, SButton;

    ProgressDialog mDialog;
    VideoView videoView;

    String videoURL = "http://172.20.10.2:8160";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.livestream_content);

        videoView = (VideoView)findViewById(R.id.videoView);
//        Toast.makeText(Livestream.this, "Loading Livestream", Toast.LENGTH_LONG).show();
        final ProgressDialog progressDialog = ProgressDialog.show(Livestream.this, "Please wait...", "Loading Livestream...", true);


        try {
            if (!videoView.isPlaying()) {
                Uri uri = Uri.parse(videoURL);
                videoView.setVideoURI(uri);
                videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {

                    }
                });
            }
            else {
                videoView.pause();

            }
        }

        catch (Exception ex)
        {

        }

        videoView.requestFocus();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
                progressDialog.dismiss();
                videoView.start();
            }
        });

    }
}
