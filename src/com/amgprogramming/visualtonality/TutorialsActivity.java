package com.amgprogramming.visualtonality;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class TutorialsActivity extends Activity implements OnClickListener{
	
	ImageButton notesBtn;
	ImageButton chordsBtn;
	ImageButton octavesBtn;
	ImageButton backBtnTutorials;
	

	//create TutorialsActivity screen
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorials_activity);	
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
		
		notesBtn = (ImageButton) findViewById(R.id.notesBtn);
		chordsBtn = (ImageButton) findViewById(R.id.chordsBtn);
		octavesBtn = (ImageButton) findViewById(R.id.octavesBtn);	
		backBtnTutorials = (ImageButton) findViewById(R.id.backBtnTutorials);
		
		notesBtn.setOnClickListener(this);
		chordsBtn.setOnClickListener(this);
		octavesBtn.setOnClickListener(this);
		backBtnTutorials.setOnClickListener(this);
        
	}
	
	//create and setup what happens when user clicks built-in menu button on hardware
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == backBtnTutorials){				
			Intent intent = new Intent(getApplicationContext(), MainActivity.class);
		    startActivity(intent);				
		}		
		if(v == notesBtn){				
			Intent intent = new Intent(getApplicationContext(), Notes1Activity.class);
		    startActivity(intent);				
		}
		if(v == chordsBtn){				
			Intent intent = new Intent(getApplicationContext(), ChordsActivity.class);
		    startActivity(intent);				
		}
		if(v == octavesBtn){				
			Intent intent = new Intent(getApplicationContext(), OctavesActivity.class);
		    startActivity(intent);				
		}
		
	}	
	
	public void onBackPressed()  
    {  		
		this.startActivity(new Intent(this,MainActivity.class));  

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