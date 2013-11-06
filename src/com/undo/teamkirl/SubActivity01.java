package com.undo.teamkirl;

import com.undo.teamkirl.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SubActivity01 extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub01);
        
        Button abtn = (Button)findViewById(R.id.actionbtn);
        abtn.setOnClickListener(this);
        
        Button hbtn = (Button)findViewById(R.id.historybtn);
        hbtn.setOnClickListener(this);
        
        Button mbtn = (Button)findViewById(R.id.mapbtn);
        mbtn.setOnClickListener(this);
        
        Button bbtn = (Button)findViewById(R.id.bookbtn);
        bbtn.setOnClickListener(this);
    }

    public void onClick(View v){
    	//Intent nextIntent = new Intent( this ,SubActivity01.class );
    	//startActivity(nextIntent);
    	if(v.getId() == R.id.actionbtn) {
    		Intent nextIntent = new Intent( this ,Motion.class );
        	startActivity(nextIntent);
		} else if(v.getId() == R.id.historybtn) {
    		Intent nextIntent = new Intent( this ,History.class );
        	startActivity(nextIntent);
		} else if(v.getId() == R.id.mapbtn) {
    		Intent nextIntent = new Intent( this ,Map.class );
        	startActivity(nextIntent);
		} else if(v.getId() == R.id.bookbtn) {
    		Intent nextIntent = new Intent( this ,Book.class );
        	startActivity(nextIntent);
		}
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
}
