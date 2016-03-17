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

public class OctavesQuizQ3Activity extends Activity implements OnClickListener {	
	
	Button submit9;	
	View textDraw17, textDraw18; 
	RadioGroup answers9;
	RadioButton answerA9, answerB9, answerC9;
	ImageButton nextBtnOctavesQ3;
	ImageButton backBtnOctavesQ3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.octaves_quiz_q3_activity);
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
	    adView.loadAd(new AdRequest());
		
		submit9 = (Button) findViewById(R.id.submitBtnOQ3);	
		nextBtnOctavesQ3 = (ImageButton) findViewById(R.id.nextBtnOctavesQ3);
		backBtnOctavesQ3 = (ImageButton) findViewById(R.id.backBtnOctavesQ3);
		
		submit9.setOnClickListener(this);
		nextBtnOctavesQ3.setOnClickListener(this);
		backBtnOctavesQ3.setOnClickListener(this);
		
		textDraw17 = findViewById(R.id.textCorrect9);
		textDraw18 = findViewById(R.id.textWrong9);
		
		answers9 = (RadioGroup) findViewById(R.id.radioGroup9);	
		
		answerA9 = (RadioButton) findViewById(R.id.radio18);
		answerB9 = (RadioButton) findViewById(R.id.radio28);
		answerC9 = (RadioButton) findViewById(R.id.radio38);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == nextBtnOctavesQ3){				
			Intent intent = new Intent(getApplicationContext(), OctavesActivity.class);
		    startActivity(intent);				
		}
		if(v == backBtnOctavesQ3){				
			Intent intent = new Intent(getApplicationContext(), OctavesQuizQ2Activity.class);
		    startActivity(intent);				
		}
		if(v == submit9){
			if(answerA9.isChecked())
			{
				textDraw18.setVisibility(View.INVISIBLE);
				textDraw17.setVisibility(View.VISIBLE);				
			}
			if(answerB9.isChecked())
			{
				textDraw18.setVisibility(View.VISIBLE);
				textDraw17.setVisibility(View.INVISIBLE);
			}
			if(answerC9.isChecked())
			{
				textDraw18.setVisibility(View.VISIBLE);
				textDraw17.setVisibility(View.INVISIBLE);
			}
							
		}
		
	}
	
	public void onBackPressed()  
    {  		
		this.startActivity(new Intent(this,OctavesQuizQ2Activity.class));  

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
