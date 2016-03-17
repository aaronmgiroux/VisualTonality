package com.amgprogramming.visualtonality;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity implements OnClickListener{
	
	//main list
	ImageButton tutorialBtn;	
	ImageButton practiceBtn;
	ImageButton helpBtn;	
	ImageButton infoBtn;	
	
	//create MainActivity screen
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);	
		
		/*AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());	*/	
		
		tutorialBtn = (ImageButton) findViewById(R.id.tutorialBtn);
		practiceBtn = (ImageButton) findViewById(R.id.practiceBtn);
		helpBtn = (ImageButton) findViewById(R.id.helpBtn);
		infoBtn = (ImageButton) findViewById(R.id.infoBtn);
		
		tutorialBtn.setOnClickListener(this);
		practiceBtn.setOnClickListener(this);
		helpBtn.setOnClickListener(this);
		infoBtn.setOnClickListener(this);
        
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
		if(v == tutorialBtn){				
			Intent intent = new Intent(getApplicationContext(), TutorialsActivity.class);
		    startActivity(intent);				
		}
		if(v == practiceBtn){				
			Intent intent = new Intent(getApplicationContext(), SongsActivity.class);
		    startActivity(intent);				
		}
		if(v == helpBtn){				
			Intent intent = new Intent(getApplicationContext(), HelpActivity.class);
		    startActivity(intent);				
		}
		if(v == infoBtn){				
			Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
		    startActivity(intent);				
		}
		
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
	
	public void onBackPressed() {

	    Intent intent = new Intent();
	            intent.setAction(Intent.ACTION_MAIN);
	            intent.addCategory(Intent.CATEGORY_HOME);

	            startActivity(intent);

	        return;
	    }
	
	/*@Override
	  public void onDestroy() {
	    if (adView != null) {
	      adView.destroy();
	    }
	    super.onDestroy();
	  }*/

}
