package com.amgprogramming.visualtonality;

import org.w3c.dom.Text;

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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class NotesQuizActivity extends Activity implements OnClickListener {	
	
	Button submit;
	Text textCorrect;
	View textDraw, textDraw2; 
	RadioGroup answers;
	RadioButton answerA, answerB, answerC;
	ImageButton nextBtnNotesQ1;
	ImageButton backBtnNotesQ1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notes_quiz_activity);
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
	    
		submit = (Button) findViewById(R.id.submitBtnNQ1);	
		nextBtnNotesQ1 = (ImageButton) findViewById(R.id.nextBtnNotesQ1);
		backBtnNotesQ1 = (ImageButton) findViewById(R.id.backBtnNotesQ1);
		
		submit.setOnClickListener(this);
		nextBtnNotesQ1.setOnClickListener(this);
		backBtnNotesQ1.setOnClickListener(this);
		
		textDraw = findViewById(R.id.textCorrect);
		textDraw2 = findViewById(R.id.textWrong);
		
		answers = (RadioGroup) findViewById(R.id.radioGroup1);	
		
		answerA = (RadioButton) findViewById(R.id.radio0);
		answerB = (RadioButton) findViewById(R.id.radio1);
		answerC = (RadioButton) findViewById(R.id.radio2);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == nextBtnNotesQ1){				
			Intent intent = new Intent(getApplicationContext(), NotesQuizQ2Activity.class);
		    startActivity(intent);				
		}
		if(v == backBtnNotesQ1){				
			Intent intent = new Intent(getApplicationContext(), Notes1Activity.class);
		    startActivity(intent);				
		}
		if(v == submit){
			if(answerA.isChecked())
			{
				textDraw2.setVisibility(View.VISIBLE);
				textDraw.setVisibility(View.INVISIBLE);				
			}
			if(answerB.isChecked())
			{
				textDraw2.setVisibility(View.INVISIBLE);
				textDraw.setVisibility(View.VISIBLE);
			}
			if(answerC.isChecked())
			{
				textDraw2.setVisibility(View.VISIBLE);
				textDraw.setVisibility(View.INVISIBLE);
			}
							
		}
		
	}
	
	public void onBackPressed()  
    {  		
		this.startActivity(new Intent(this,Notes1Activity.class));  

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
