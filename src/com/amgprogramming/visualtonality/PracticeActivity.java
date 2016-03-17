package com.amgprogramming.visualtonality;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.audiofx.PresetReverb;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.ScrollView;

@SuppressLint("NewApi")
public class PracticeActivity extends Activity implements OnTouchListener, OnClickListener{
	
	MediaPlayer mp;
	ImageButton playWith,playWithout;
	ImageButton backBtnPractice;
	ImageButton cBtn2,dBtn2,eBtn2,fBtn2,gBtn2,aBtn2,bBtn2;
	MediaPlayer mpc2,mpd2,mpe2,mpf2,mpg2,mpa2,mpb2;
	PresetReverb reverb;	
		
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sheet_activity2);	
		
		/*AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());*/				
		
		mpc2 = MediaPlayer.create(this, R.raw.cnote2);
		mpc2.setLooping(false);

		mpd2 = MediaPlayer.create(this, R.raw.dnote2);
		mpd2.setLooping(false);
		
		mpe2 = MediaPlayer.create(this, R.raw.enote2);
		mpe2.setLooping(false);
		
		mpf2 = MediaPlayer.create(this, R.raw.fnote2);
		mpf2.setLooping(false);
		
		mpg2 = MediaPlayer.create(this, R.raw.gnote2);
		mpg2.setLooping(false);
		
		mpa2 = MediaPlayer.create(this, R.raw.anote2);
		mpa2.setLooping(false);
		
		mpb2 = MediaPlayer.create(this, R.raw.bnote2);
		mpb2.setLooping(false);
		
		mp = MediaPlayer.create(this, R.raw.jbf);
		mp.setLooping(false);	
		
		playWith = (ImageButton) findViewById(R.id.playSheetMusic);
		playWithout = (ImageButton) findViewById(R.id.playSheet);
		backBtnPractice = (ImageButton) findViewById(R.id.backBtnPractice);
		
		cBtn2 = (ImageButton) findViewById(R.id.cBtn2);
		dBtn2 = (ImageButton) findViewById(R.id.dBtn2);
		eBtn2 = (ImageButton) findViewById(R.id.eBtn2);
		fBtn2 = (ImageButton) findViewById(R.id.fBtn2);
		gBtn2 = (ImageButton) findViewById(R.id.gBtn2);
		aBtn2 = (ImageButton) findViewById(R.id.aBtn2);
		bBtn2 = (ImageButton) findViewById(R.id.bBtn2);
		
		playWith.setOnClickListener(this);
		playWithout.setOnClickListener(this);
		backBtnPractice.setOnClickListener(this);
		
		cBtn2.setOnTouchListener(this);
		dBtn2.setOnTouchListener(this);
		eBtn2.setOnTouchListener(this);
		fBtn2.setOnTouchListener(this);
		gBtn2.setOnTouchListener(this);
		aBtn2.setOnTouchListener(this);
		bBtn2.setOnTouchListener(this);
		
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@SuppressLint("NewApi")
	@Override
	public void onClick(View v) {
		if(v == backBtnPractice){				
			if(mp != null){
	    		mp.stop();
	    		this.startActivity(new Intent(this,SongsActivity.class));
	    		
	    	}
	    	else{
	    		 this.startActivity(new Intent(this,SongsActivity.class));  

	 	        return;
	    	}				
		}
		if(v == playWith){
			if(mp.isPlaying()){
				mp.stop();
				this.startActivity(new Intent(this,SongsActivity.class));
			}
			mp.start();			
			
			ObjectAnimator animator = ObjectAnimator.ofInt(findViewById(R.id.scrollView1), "scrollY", 3000 );
			animator.setDuration(35000);
			animator.start();
			
		}
		if(v == playWithout){
			if(mp.isPlaying()){
				mp.stop();
				this.startActivity(new Intent(this,SongsActivity.class));
			}						
			
			ObjectAnimator animator = ObjectAnimator.ofInt(findViewById(R.id.scrollView1), "scrollY", 3000 );
			animator.setDuration(35000);
			animator.start();
			
		}
		
	}	
	
	public void onBackPressed()  
    {  		
    	if(mp != null){
    		mp.stop();
    		this.startActivity(new Intent(this,SongsActivity.class));
    	}
    	else{
    		 this.startActivity(new Intent(this,SongsActivity.class));  

 	        return;
    	}
         
    }	
	
	public boolean onTouch(View v, MotionEvent event) {
		if(v == cBtn2)
		{
			switch(event.getAction() & MotionEvent.ACTION_MASK) {
			case MotionEvent.ACTION_DOWN:
            // Finger started pressing --> play sound in loop mode
				try { 		        
					mpc2 = MediaPlayer.create(this, R.raw.cnote2);					
					mpc2.setLooping(false);
					mpc2.start();
				} catch (Exception e) {}
				break;
			case MotionEvent.ACTION_UP:
            // Finger released --> stop playback
				try {	
					/*reverb = new PresetReverb(1, mpc2.getAudioSessionId());
					reverb.setPreset(PresetReverb.PRESET_LARGEROOM);
					reverb.setEnabled(true);
					mpc2.attachAuxEffect(reverb.getId());
					mpc2.setAuxEffectSendLevel(1.0f);*/
					mpc2.stop();
					mpc2.release();
				} catch (Exception e) {}
				break;
			}
			
		}
		if(v == dBtn2)
		{
			switch(event.getAction() & MotionEvent.ACTION_MASK) {
			case MotionEvent.ACTION_DOWN:
            // Finger started pressing --> play sound in loop mode
				try {  
					mpd2 = MediaPlayer.create(this, R.raw.dnote2);
					mpd2.setLooping(false);
					mpd2.start();
				} catch (Exception e) {}
				break;
			case MotionEvent.ACTION_UP:
            // Finger released --> stop playback
				try {
					mpd2.stop();	
					mpd2.release();
				} catch (Exception e) {}
				break;
			}
			
		}
		if(v == eBtn2)
		{
			switch(event.getAction() & MotionEvent.ACTION_MASK) {
			case MotionEvent.ACTION_DOWN:
            // Finger started pressing --> play sound in loop mode
				try {  
					mpe2 = MediaPlayer.create(this, R.raw.enote2);
					mpe2.setLooping(false);
					mpe2.start();
				} catch (Exception e) {}
				break;
			case MotionEvent.ACTION_UP:
            // Finger released --> stop playback
				try {
					mpe2.stop();
					mpe2.release();
				} catch (Exception e) {}
				break;
			}
			
		}
		if(v == fBtn2)
		{
			switch(event.getAction() & MotionEvent.ACTION_MASK) {
			case MotionEvent.ACTION_DOWN:
            // Finger started pressing --> play sound in loop mode
				try {  
					mpf2 = MediaPlayer.create(this, R.raw.fnote2);
					mpf2.setLooping(false);
					mpf2.start();
				} catch (Exception e) {}
				break;
			case MotionEvent.ACTION_UP:
            // Finger released --> stop playback
				try {
					mpf2.stop();	
					mpf2.release();
				} catch (Exception e) {}
				break;
			}
			
		}
		if(v == gBtn2)
		{
			switch(event.getAction() & MotionEvent.ACTION_MASK) {
			case MotionEvent.ACTION_DOWN:
            // Finger started pressing --> play sound in loop mode
				try {  
					mpg2 = MediaPlayer.create(this, R.raw.gnote2);
					mpg2.setLooping(false);
					mpg2.start();
				} catch (Exception e) {}
				break;
			case MotionEvent.ACTION_UP:
            // Finger released --> stop playback
				try {
					mpg2.stop();	
					mpg2.release();
				} catch (Exception e) {}
				break;
			}
			
		}
		if(v == aBtn2)
		{
			switch(event.getAction() & MotionEvent.ACTION_MASK) {
			case MotionEvent.ACTION_DOWN:
            // Finger started pressing --> play sound in loop mode
				try {  
					mpa2 = MediaPlayer.create(this, R.raw.anote2);
					mpa2.setLooping(false);
					mpa2.start();
				} catch (Exception e) {}
				break;
			case MotionEvent.ACTION_UP:
            // Finger released --> stop playback
				try {
					mpa2.stop();
					mpa2.release();
				} catch (Exception e) {}
				break;
			}
			
		}
		if(v == bBtn2)
		{
			switch(event.getAction() & MotionEvent.ACTION_MASK) {
			case MotionEvent.ACTION_DOWN:
            // Finger started pressing --> play sound in loop mode
				try {  
					mpb2 = MediaPlayer.create(this, R.raw.bnote2);
					mpb2.setLooping(false);
					mpb2.start();
				} catch (Exception e) {}
				break;
			case MotionEvent.ACTION_UP:
            // Finger released --> stop playback
				try {
					mpb2.stop();
					mpb2.release();
				} catch (Exception e) {}
				break;
			}
			
		}
		
		return false;
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    
	    case R.id.menu_help:
	    	this.startActivity(new Intent(this,HelpActivity.class));
	        return true;
	        
	    case R.id.menu_info:
	    	this.startActivity(new Intent(this,InfoActivity.class));
	        return true;
	   
	    case R.id.menu_exit:
	    	Intent intent = new Intent();
            intent.setAction(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);

            startActivity(intent);	        
	        return true;
	    
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
	
	

}
