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

public class NotesQuizQ3Activity extends Activity implements OnClickListener {	
	
	Button submit3;	
	View textDraw5, textDraw6; 
	RadioGroup answers3;
	RadioButton answerA3, answerB3, answerC3; 
	ImageButton nextBtnNotesQ3;
	ImageButton backBtnNotesQ3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notes_quiz_q3_activity);
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
		
		submit3 = (Button) findViewById(R.id.submitBtnNQ3);
		nextBtnNotesQ3 = (ImageButton) findViewById(R.id.nextBtnNotesQ3);
		backBtnNotesQ3 = (ImageButton) findViewById(R.id.backBtnNotesQ3);
		
		submit3.setOnClickListener(this);	
		nextBtnNotesQ3.setOnClickListener(this);
		backBtnNotesQ3.setOnClickListener(this);
		
		textDraw5 = findViewById(R.id.textCorrect3);
		textDraw6 = findViewById(R.id.textWrong3);
		
		answers3 = (RadioGroup) findViewById(R.id.radioGroup3);	
		
		answerA3 = (RadioButton) findViewById(R.id.radio02);
		answerB3 = (RadioButton) findViewById(R.id.radio12);
		answerC3 = (RadioButton) findViewById(R.id.radio22);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == nextBtnNotesQ3){				
			Intent intent = new Intent(getApplicationContext(), Notes1Activity.class);
		    startActivity(intent);				
		}
		if(v == backBtnNotesQ3){				
			Intent intent = new Intent(getApplicationContext(), NotesQuizQ2Activity.class);
		    startActivity(intent);				
		}
		if(v == submit3){
			if(answerA3.isChecked())
			{
				textDraw6.setVisibility(View.VISIBLE);
				textDraw5.setVisibility(View.INVISIBLE);				
			}
			if(answerB3.isChecked())
			{
				textDraw6.setVisibility(View.VISIBLE);
				textDraw5.setVisibility(View.INVISIBLE);
			}
			if(answerC3.isChecked())
			{
				textDraw6.setVisibility(View.INVISIBLE);
				textDraw5.setVisibility(View.VISIBLE);
			}
							
		}
		
	}
	
	public void onBackPressed()  
    {  		
		this.startActivity(new Intent(this,NotesQuizQ2Activity.class));  

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
