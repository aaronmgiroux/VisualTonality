package com.amgprogramming.visualtonality;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;

public class Notes3Activity extends Activity implements OnClickListener {
	
	ImageButton backBtnNotes2;	
	ImageButton nextBtnNotes2;
	ImageButton cBtn,csBtn,dBtn,dsBtn,eBtn,fBtn,fsBtn,gBtn,gsBtn,aBtn,asBtn,bBtn;
	MediaPlayer mpc,mpcs,mpd,mpds,mpe,mpf,mpfs,mpg,mpgs,mpa,mpas,mpb;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notes3_activity);	
		
		/*AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());*/
		
		mpc = MediaPlayer.create(this, R.raw.cnote);
		mpc.setLooping(false);
		
		mpd = MediaPlayer.create(this, R.raw.dnote);
		mpd.setLooping(false);

		mpe = MediaPlayer.create(this, R.raw.enote);
		mpe.setLooping(false);
		
		mpf = MediaPlayer.create(this, R.raw.fnote);
		mpf.setLooping(false);
		
		mpg = MediaPlayer.create(this, R.raw.gnote);
		mpg.setLooping(false);
		
		mpa = MediaPlayer.create(this, R.raw.anote);
		mpa.setLooping(false);
		
		mpb = MediaPlayer.create(this, R.raw.bnote);
		mpb.setLooping(false);
		
		mpcs = MediaPlayer.create(this, R.raw.csnote);
		mpcs.setLooping(false);
		
		mpds = MediaPlayer.create(this, R.raw.dsnote);
		mpds.setLooping(false);
		
		mpfs = MediaPlayer.create(this, R.raw.fsnote);
		mpfs.setLooping(false);
		
		mpgs = MediaPlayer.create(this, R.raw.gsnote);
		mpgs.setLooping(false);
		
		mpas = MediaPlayer.create(this, R.raw.asnote);
		mpas.setLooping(false);
		
		backBtnNotes2 = (ImageButton) findViewById(R.id.backBtnNotes2);
		nextBtnNotes2 = (ImageButton) findViewById(R.id.nextBtnNotes2);
		
		cBtn = (ImageButton) findViewById(R.id.cBtn);
		dBtn = (ImageButton) findViewById(R.id.dBtn);
		eBtn = (ImageButton) findViewById(R.id.eBtn);
		fBtn = (ImageButton) findViewById(R.id.fBtn);
		gBtn = (ImageButton) findViewById(R.id.gBtn);
		aBtn = (ImageButton) findViewById(R.id.aBtn);
		bBtn = (ImageButton) findViewById(R.id.bBtn);
		csBtn = (ImageButton) findViewById(R.id.csBtn);
		dsBtn = (ImageButton) findViewById(R.id.dsBtn);
		fsBtn = (ImageButton) findViewById(R.id.fsBtn);
		gsBtn = (ImageButton) findViewById(R.id.gsBtn);
		asBtn = (ImageButton) findViewById(R.id.asBtn);
		
		backBtnNotes2.setOnClickListener(this);
		nextBtnNotes2.setOnClickListener(this);
		
		cBtn.setOnClickListener(this);
		dBtn.setOnClickListener(this);
		eBtn.setOnClickListener(this);
		fBtn.setOnClickListener(this);
		gBtn.setOnClickListener(this);
		aBtn.setOnClickListener(this);
		bBtn.setOnClickListener(this);
		csBtn.setOnClickListener(this);
		dsBtn.setOnClickListener(this);
		fsBtn.setOnClickListener(this);
		gsBtn.setOnClickListener(this);
		asBtn.setOnClickListener(this);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == backBtnNotes2){				
			Intent intent = new Intent(getApplicationContext(), Notes25Activity.class);
		    startActivity(intent);				
		}
		if(v == nextBtnNotes2){				
			Intent intent = new Intent(getApplicationContext(), Notes1Activity.class);
		    startActivity(intent);				
		}
		if(v == cBtn){			
			mpc.start();
		}
		if(v == dBtn){				
			mpd.start();				
		}
		if(v == eBtn){				
			mpe.start();				
		}
		if(v == fBtn){				
			mpf.start();				
		}
		if(v == gBtn){				
			mpg.start();				
		}
		if(v == aBtn){				
			mpa.start();				
		}
		if(v == bBtn){				
			mpb.start();				
		}
		if(v == csBtn){				
			mpcs.start();				
		}
		if(v == dsBtn){				
			mpds.start();				
		}
		if(v == fsBtn){				
			mpfs.start();				
		}
		if(v == gsBtn){				
			mpgs.start();				
		}
		if(v == asBtn){				
			mpas.start();				
		}
		
	}
	
	public void onBackPressed()  
    {  		
		this.startActivity(new Intent(this,Notes25Activity.class));  

	        return;
         
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
