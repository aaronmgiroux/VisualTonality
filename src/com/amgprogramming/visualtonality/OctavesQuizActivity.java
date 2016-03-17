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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class OctavesQuizActivity extends Activity implements OnClickListener {	
	
	Button submit7;	
	View textDraw13, textDraw14; 
	RadioGroup answers7;
	RadioButton answerA7, answerB7, answerC7;
	ImageButton nextBtnOctavesQ1;
	ImageButton backBtnOctavesQ1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.octaves_quiz_activity);
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
		
		submit7 = (Button) findViewById(R.id.submitBtnOQ1);	
		nextBtnOctavesQ1 = (ImageButton) findViewById(R.id.nextBtnOctavesQ1);
		backBtnOctavesQ1 = (ImageButton) findViewById(R.id.backBtnOctavesQ1);
		
		submit7.setOnClickListener(this);
		nextBtnOctavesQ1.setOnClickListener(this);
		backBtnOctavesQ1.setOnClickListener(this);
		
		textDraw13 = findViewById(R.id.textCorrect7);
		textDraw14 = findViewById(R.id.textWrong7);
		
		answers7 = (RadioGroup) findViewById(R.id.radioGroup7);	
		
		answerA7 = (RadioButton) findViewById(R.id.radio16);
		answerB7 = (RadioButton) findViewById(R.id.radio26);
		answerC7 = (RadioButton) findViewById(R.id.radio36);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == nextBtnOctavesQ1){				
			Intent intent = new Intent(getApplicationContext(), OctavesQuizQ2Activity.class);
		    startActivity(intent);				
		}
		if(v == backBtnOctavesQ1){				
			Intent intent = new Intent(getApplicationContext(), OctavesActivity.class);
		    startActivity(intent);				
		}
		if(v == submit7){
			if(answerA7.isChecked())
			{
				textDraw14.setVisibility(View.INVISIBLE);
				textDraw13.setVisibility(View.VISIBLE);				
			}
			if(answerB7.isChecked())
			{
				textDraw14.setVisibility(View.VISIBLE);
				textDraw13.setVisibility(View.INVISIBLE);
			}
			if(answerC7.isChecked())
			{
				textDraw14.setVisibility(View.VISIBLE);
				textDraw13.setVisibility(View.INVISIBLE);
			}
							
		}
		
	}
	
	public void onBackPressed()  
    {  		
		this.startActivity(new Intent(this,OctavesActivity.class));  

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
