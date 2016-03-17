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

public class ChordsQuizQ2Activity extends Activity implements OnClickListener {	
	
	Button submit5;	
	View textDraw9, textDraw10; 
	RadioGroup answers5;
	RadioButton answerA5, answerB5, answerC5;
	ImageButton nextBtnChordsQ2;
	ImageButton backBtnChordsQ2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chords_quiz_q2_activity);
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
		
		submit5 = (Button) findViewById(R.id.submitBtnCQ2);	
		nextBtnChordsQ2 = (ImageButton) findViewById(R.id.nextBtnChordsQ2);
		backBtnChordsQ2 = (ImageButton) findViewById(R.id.backBtnChordsQ2);
		
		submit5.setOnClickListener(this);
		nextBtnChordsQ2.setOnClickListener(this);
		backBtnChordsQ2.setOnClickListener(this);
		
		textDraw9 = findViewById(R.id.textCorrect5);
		textDraw10 = findViewById(R.id.textWrong5);
		
		answers5 = (RadioGroup) findViewById(R.id.radioGroup5);	
		
		answerA5 = (RadioButton) findViewById(R.id.radio14);
		answerB5 = (RadioButton) findViewById(R.id.radio24);
		answerC5 = (RadioButton) findViewById(R.id.radio34);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == nextBtnChordsQ2){				
			Intent intent = new Intent(getApplicationContext(), ChordsQuizQ3Activity.class);
		    startActivity(intent);				
		}
		if(v == backBtnChordsQ2){				
			Intent intent = new Intent(getApplicationContext(), ChordsQuizActivity.class);
		    startActivity(intent);				
		}
		if(v == submit5){
			if(answerA5.isChecked())
			{
				textDraw10.setVisibility(View.INVISIBLE);
				textDraw9.setVisibility(View.VISIBLE);				
			}
			if(answerB5.isChecked())
			{
				textDraw10.setVisibility(View.VISIBLE);
				textDraw9.setVisibility(View.INVISIBLE);
			}
			if(answerC5.isChecked())
			{
				textDraw10.setVisibility(View.VISIBLE);
				textDraw9.setVisibility(View.INVISIBLE);
			}
							
		}
		
	}
	
	public void onBackPressed()  
    {  		
		this.startActivity(new Intent(this,ChordsQuizActivity.class));  

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
