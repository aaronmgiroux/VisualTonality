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

public class ChordsQuizQ3Activity extends Activity implements OnClickListener {	
	
	Button submit6;	
	View textDraw11, textDraw12; 
	RadioGroup answers6;
	RadioButton answerA6, answerB6, answerC6;
	ImageButton nextBtnChordsQ3;
	ImageButton backBtnChordsQ3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chords_quiz_q3_activity);
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
		
		submit6 = (Button) findViewById(R.id.submitBtnCQ3);	
		nextBtnChordsQ3 = (ImageButton) findViewById(R.id.nextBtnChordsQ3);
		backBtnChordsQ3 = (ImageButton) findViewById(R.id.backBtnChordsQ3);
		
		submit6.setOnClickListener(this);
		nextBtnChordsQ3.setOnClickListener(this);
		backBtnChordsQ3.setOnClickListener(this);
		
		textDraw11 = findViewById(R.id.textCorrect6);
		textDraw12 = findViewById(R.id.textWrong6);
		
		answers6 = (RadioGroup) findViewById(R.id.radioGroup6);	
		
		answerA6 = (RadioButton) findViewById(R.id.radio15);
		answerB6 = (RadioButton) findViewById(R.id.radio25);
		answerC6 = (RadioButton) findViewById(R.id.radio35);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == nextBtnChordsQ3){				
			Intent intent = new Intent(getApplicationContext(), ChordsActivity.class);
		    startActivity(intent);				
		}
		if(v == backBtnChordsQ3){				
			Intent intent = new Intent(getApplicationContext(), ChordsQuizQ2Activity.class);
		    startActivity(intent);				
		}
		if(v == submit6){
			if(answerA6.isChecked())
			{
				textDraw12.setVisibility(View.VISIBLE);
				textDraw11.setVisibility(View.INVISIBLE);				
			}
			if(answerB6.isChecked())
			{
				textDraw12.setVisibility(View.VISIBLE);
				textDraw11.setVisibility(View.INVISIBLE);
			}
			if(answerC6.isChecked())
			{
				textDraw12.setVisibility(View.INVISIBLE);
				textDraw11.setVisibility(View.VISIBLE);
			}
							
		}
		
	}
	
	public void onBackPressed()  
    {  		
		this.startActivity(new Intent(this,ChordsQuizQ2Activity.class));  

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
