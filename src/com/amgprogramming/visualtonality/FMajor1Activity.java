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

public class FMajor1Activity extends Activity implements OnClickListener{	
	
	ImageButton nextBtnFMajor1;
	ImageButton backBtnFMajor1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fmajor1_activity);	
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
		
		nextBtnFMajor1 = (ImageButton) findViewById(R.id.nextBtnFMajor1);
		backBtnFMajor1 = (ImageButton) findViewById(R.id.backBtnFMajor1);
		
		nextBtnFMajor1.setOnClickListener(this);
		backBtnFMajor1.setOnClickListener(this);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == nextBtnFMajor1){				
			Intent intent = new Intent(getApplicationContext(), FMajor2Activity.class);
		    startActivity(intent);				
		}
		if(v == backBtnFMajor1){				
			Intent intent = new Intent(getApplicationContext(), ChordsActivity.class);
		    startActivity(intent);				
		}
		
	}
	
	public void onBackPressed()  
    {  		
		this.startActivity(new Intent(this,ChordsActivity.class));  

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
