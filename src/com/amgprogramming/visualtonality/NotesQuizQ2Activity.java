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

public class NotesQuizQ2Activity extends Activity implements OnClickListener {	
	
	Button submit2;	
	View textDraw3, textDraw4; 
	RadioGroup answers2;
	RadioButton answerA2, answerB2, answerC2; 
	ImageButton nextBtnNotesQ2;
	ImageButton backBtnNotesQ2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notes_quiz_q2_activity);
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
		
		submit2 = (Button) findViewById(R.id.submitBtnNQ2);
		nextBtnNotesQ2 = (ImageButton) findViewById(R.id.nextBtnNotesQ2);
		backBtnNotesQ2 = (ImageButton) findViewById(R.id.backBtnNotesQ2);
		
		submit2.setOnClickListener(this);	
		nextBtnNotesQ2.setOnClickListener(this);
		backBtnNotesQ2.setOnClickListener(this);
		
		textDraw3 = findViewById(R.id.textCorrect2);
		textDraw4 = findViewById(R.id.textWrong2);
		
		answers2 = (RadioGroup) findViewById(R.id.radioGroup2);	
		
		answerA2 = (RadioButton) findViewById(R.id.radio01);
		answerB2 = (RadioButton) findViewById(R.id.radio11);
		answerC2 = (RadioButton) findViewById(R.id.radio21);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == nextBtnNotesQ2){				
			Intent intent = new Intent(getApplicationContext(), NotesQuizQ3Activity.class);
		    startActivity(intent);				
		}
		if(v == backBtnNotesQ2){				
			Intent intent = new Intent(getApplicationContext(), NotesQuizActivity.class);
		    startActivity(intent);				
		}
		if(v == submit2){
			if(answerA2.isChecked())
			{
				textDraw4.setVisibility(View.VISIBLE);
				textDraw3.setVisibility(View.INVISIBLE);				
			}
			if(answerB2.isChecked())
			{
				textDraw4.setVisibility(View.VISIBLE);
				textDraw3.setVisibility(View.INVISIBLE);
			}
			if(answerC2.isChecked())
			{
				textDraw4.setVisibility(View.INVISIBLE);
				textDraw3.setVisibility(View.VISIBLE);
			}
							
		}
		
	}
	
	public void onBackPressed()  
    {  		
		this.startActivity(new Intent(this,NotesQuizActivity.class));  

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
