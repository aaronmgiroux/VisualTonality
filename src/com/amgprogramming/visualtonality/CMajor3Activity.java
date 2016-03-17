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

public class CMajor3Activity extends Activity implements OnClickListener{	
	
	ImageButton nextBtnCMajor3;
	ImageButton backBtnCMajor3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cmajor3_activity);
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
		
		nextBtnCMajor3 = (ImageButton) findViewById(R.id.nextBtnCMajor3);
		backBtnCMajor3 = (ImageButton) findViewById(R.id.backBtnCMajor3);
		
		nextBtnCMajor3.setOnClickListener(this);
		backBtnCMajor3.setOnClickListener(this);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == nextBtnCMajor3){				
			Intent intent = new Intent(getApplicationContext(), CMajor4Activity.class);
		    startActivity(intent);				
		}
		if(v == backBtnCMajor3){				
			Intent intent = new Intent(getApplicationContext(), CMajor2Activity.class);
		    startActivity(intent);				
		}
		
	}
	
	public void onBackPressed()  
    {  		
		this.startActivity(new Intent(this,CMajor2Activity.class));  

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
