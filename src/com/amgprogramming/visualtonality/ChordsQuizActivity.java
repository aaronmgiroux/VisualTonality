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

public class ChordsQuizActivity extends Activity implements OnClickListener {	
	
	Button submit4;	
	View textDraw7, textDraw8; 
	RadioGroup answers4;
	RadioButton answerA4, answerB4, answerC4;
	ImageButton nextBtnChordsQ1;
	ImageButton backBtnChordsQ1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chords_quiz_activity);
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
		
		submit4 = (Button) findViewById(R.id.submitBtnCQ1);	
		nextBtnChordsQ1 = (ImageButton) findViewById(R.id.nextBtnChordsQ1);
		backBtnChordsQ1 = (ImageButton) findViewById(R.id.backBtnChordsQ1);
		
		submit4.setOnClickListener(this);
		nextBtnChordsQ1.setOnClickListener(this);
		backBtnChordsQ1.setOnClickListener(this);
		
		textDraw7 = findViewById(R.id.textCorrect4);
		textDraw8 = findViewById(R.id.textWrong4);
		
		answers4 = (RadioGroup) findViewById(R.id.radioGroup4);	
		
		answerA4 = (RadioButton) findViewById(R.id.radio13);
		answerB4 = (RadioButton) findViewById(R.id.radio23);
		answerC4 = (RadioButton) findViewById(R.id.radio33);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == nextBtnChordsQ1){				
			Intent intent = new Intent(getApplicationContext(), ChordsQuizQ2Activity.class);
		    startActivity(intent);				
		}
		if(v == backBtnChordsQ1){				
			Intent intent = new Intent(getApplicationContext(), ChordsActivity.class);
		    startActivity(intent);				
		}
		if(v == submit4){
			if(answerA4.isChecked())
			{
				textDraw8.setVisibility(View.VISIBLE);
				textDraw7.setVisibility(View.INVISIBLE);				
			}
			if(answerB4.isChecked())
			{
				textDraw8.setVisibility(View.INVISIBLE);
				textDraw7.setVisibility(View.VISIBLE);
			}
			if(answerC4.isChecked())
			{
				textDraw8.setVisibility(View.VISIBLE);
				textDraw7.setVisibility(View.INVISIBLE);
			}
							
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
