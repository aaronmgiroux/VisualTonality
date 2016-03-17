package com.amgprogramming.visualtonality;

import android.app.Activity;
import android.content.Intent;

import com.amgprogramming.visualtonality.R;
import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class ChordsActivity extends Activity implements OnClickListener{
	
	ImageButton evalBtnChords;
	ImageButton backBtnChords;
	ImageButton CBtnChords;
	ImageButton gMajorBtn;
	ImageButton fMajorBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chords_activity);	
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
		
		evalBtnChords = (ImageButton) findViewById(R.id.evalBtnChords);
		backBtnChords = (ImageButton) findViewById(R.id.backBtnChords);
		CBtnChords = (ImageButton) findViewById(R.id.oneOctaveBtn);
		gMajorBtn = (ImageButton) findViewById(R.id.gMajorBtn);
		fMajorBtn = (ImageButton) findViewById(R.id.fMajorBtn);
		
		evalBtnChords.setOnClickListener(this);
		backBtnChords.setOnClickListener(this);
		CBtnChords.setOnClickListener(this);
		gMajorBtn.setOnClickListener(this);
		fMajorBtn.setOnClickListener(this);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == evalBtnChords){				
			Intent intent = new Intent(getApplicationContext(), ChordsQuizActivity.class);
		    startActivity(intent);				
		}
		if(v == backBtnChords){				
			Intent intent = new Intent(getApplicationContext(), TutorialsActivity.class);
		    startActivity(intent);				
		}
		if(v == CBtnChords){				
			Intent intent = new Intent(getApplicationContext(), CMajor1Activity.class);
		    startActivity(intent);				
		}
		if(v == gMajorBtn){				
			Intent intent = new Intent(getApplicationContext(), GMajor1Activity.class);
		    startActivity(intent);				
		}
		if(v == fMajorBtn){				
			Intent intent = new Intent(getApplicationContext(), FMajor1Activity.class);
		    startActivity(intent);				
		}
		
	}
	
	public void onBackPressed()  
    {  		
		this.startActivity(new Intent(this,TutorialsActivity.class));  

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
