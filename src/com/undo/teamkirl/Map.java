package com.undo.teamkirl;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Map extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        
        Button bbtn = (Button)findViewById(R.id.backbtn);
        bbtn.setOnClickListener(this);
    }

    public void onClick(View v){
    	//Intent nextIntent = new Intent( this ,SubActivity01.class );
    	//startActivity(nextIntent);
    	finish();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
