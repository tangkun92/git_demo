package com.itheima.videoplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		VideoView vv = (VideoView) findViewById(R.id.vv);
		vv.setVideoPath("http://192.168.1.100:8080/demo.mp4");
		
		vv.setOnErrorListener(new OnErrorListener() {
			
			@Override
			public boolean onError(MediaPlayer mp, int what, int extra) {
				Toast.makeText(MainActivity.this, "≤•∑≈ ß∞‹", 0).show();
				return true;
			}
		});
		vv.start();
	}
}
