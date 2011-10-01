package uk.co.andybarratt.chipcounter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ChipCounterActivity extends CustomActivity
{	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        Log.v(TAG, "Checking number of chips");
        if(loadChipValues()==false)
        {
        	setContentView(R.layout.no_chips);
        	Log.v(TAG, "No Chips Set, showing welcome screen.");
        	final Button btnSetValues = (Button) findViewById(R.id.btnSetValues); //initialise set values button
        	btnSetValues.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(final View view) {
        			Log.v(TAG, "Set Chip Values button pressed.");
        			Intent myIntent = new Intent(view.getContext(), setValues.class);
	                startActivityForResult(myIntent, 0);
        		}
        	});
        }
        else
        {
        	setContentView(R.layout.main);
        	Log.v(TAG, "Chips found, showing main layout.");
        }
    }
}