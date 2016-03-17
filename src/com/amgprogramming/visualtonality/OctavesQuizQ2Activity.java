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

public class OctavesQuizQ2Activity extends Activity implements OnClickListener {	
	
	Button submit8;	
	View textDraw15, textDraw16; 
	RadioGroup answers8;
	RadioButton answerA8, answerB8, answerC8;
	ImageButton nextBtnOctavesQ2;
	ImageButton backBtnOctavesQ2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.octaves_quiz_q2_activity);
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
		
		submit8 = (Button) findViewById(R.id.submitBtnOQ2);	
		nextBtnOctavesQ2 = (ImageButton) findViewById(R.id.nextBtnOctavesQ2);
		backBtnOctavesQ2 = (ImageButton) findViewById(R.id.backBtnOctavesQ2);
		
		submit8.setOnClickListener(this);
		nextBtnOctavesQ2.setOnClickListener(this);
		backBtnOctavesQ2.setOnClickListener(this);
		
		textDraw15 = findViewById(R.id.textCorrect8);
		textDraw16 = findViewById(R.id.textWrong8);
		
		answers8 = (RadioGroup) findViewById(R.id.radioGroup8);	
		
		answerA8 = (RadioButton) findViewById(R.id.radio17);
		answerB8 = (RadioButton) findViewById(R.id.radio27);
		answerC8 = (RadioButton) findViewById(R.id.radio37);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == nextBtnOctavesQ2){				
			Intent intent = new Intent(getApplicationContext(), OctavesQuizQ3Activity.class);
		    startActivity(intent);				
		}
		if(v == backBtnOctavesQ2){				
			Intent intent = new Intent(getApplicationContext(), OctavesQuizActivity.class);
		    startActivity(intent);				
		}
		if(v == submit8){
			if(answerA8.isChecked())
			{
				textDraw16.setVisibility(View.VISIBLE);
				textDraw15.setVisibility(View.INVISIBLE);				
			}
			if(answerB8.isChecked())
			{
				textDraw16.setVisibility(View.VISIBLE);
				textDraw15.setVisibility(View.INVISIBLE);
			}
			if(answerC8.isChecked())
			{
				textDraw16.setVisibility(View.INVISIBLE);
				textDraw15.setVisibility(View.VISIBLE);
			}
							
		}
		
	}
	
	public void onBackPressed()  
    {  		
		this.startActivity(new Intent(this,OctavesQuizActivity.class));  

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
