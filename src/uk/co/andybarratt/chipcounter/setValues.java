package uk.co.andybarratt.chipcounter;

import android.app.Activity;
import android.os.Bundle;


public class setValues extends Activity
{
	public static final String TAG = "ChipCounter";
	Chip [] chips = null;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.values);
        
        
        /*
        final Button btnSetValues = (Button) findViewById(R.id.btnSetValues); //initialise set values button
    	btnSetValues.setOnClickListener(new OnClickListener() {
    		@Override
    		public void onClick(final View view) {
    			Log.v(TAG, "Save Values button pressed.");
    		}
    	});
    	*/
    }
}