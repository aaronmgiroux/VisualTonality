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

public class Notes1Activity extends Activity implements OnClickListener{
	
	ImageButton notesBtn2nd;
	ImageButton evalBtnNotes;
	ImageButton backBtnNotes;
	ImageButton treBtnNotes;
	ImageButton bass1BtnNotes;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notes1_activity);	
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
		
		notesBtn2nd = (ImageButton) findViewById(R.id.notesBtn2nd);	
		evalBtnNotes = (ImageButton) findViewById(R.id.evalBtnNotes);
		backBtnNotes = (ImageButton) findViewById(R.id.backBtnNotes);
		treBtnNotes = (ImageButton) findViewById(R.id.treBtnNotes);
		bass1BtnNotes = (ImageButton) findViewById(R.id.bassBtnNotes);
		
		notesBtn2nd.setOnClickListener(this);	
		evalBtnNotes.setOnClickListener(this);
		backBtnNotes.setOnClickListener(this);
		treBtnNotes.setOnClickListener(this);
		bass1BtnNotes.setOnClickListener(this);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		
		if(v == backBtnNotes){				
			Intent intent = new Intent(getApplicationContext(), TutorialsActivity.class);
		    startActivity(intent);				
		}
		if(v == notesBtn2nd){				
			Intent intent = new Intent(getApplicationContext(), Notes2Activity.class);
		    startActivity(intent);				
		}
		if(v == evalBtnNotes){				
			Intent intent = new Intent(getApplicationContext(), NotesQuizActivity.class);
		    startActivity(intent);				
		}
		if(v == treBtnNotes){				
			Intent intent = new Intent(getApplicationContext(), Treble1Activity.class);
		    startActivity(intent);				
		}
		
		if(v == bass1BtnNotes){				
			Intent intent = new Intent(getApplicationContext(), Bass1Activity.class);
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
