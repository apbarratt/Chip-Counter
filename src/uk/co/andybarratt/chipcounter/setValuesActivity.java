package uk.co.andybarratt.chipcounter;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class SetValuesActivity extends CustomActivity
{
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //remove the android title bar
        
        setContentView(R.layout.values);
        
        loadChipValues();
        chips[0].setDrawable(R.drawable.blue);
        chips[1].setDrawable(R.drawable.green);
        chips[2].setDrawable(R.drawable.lightblue);
        chips[3].setDrawable(R.drawable.orange);
        chips[4].setDrawable(R.drawable.pink);
        chips[5].setDrawable(R.drawable.purple);
        chips[6].setDrawable(R.drawable.red);
        chips[7].setDrawable(R.drawable.yellow);
        chips[8].setDrawable(R.drawable.white);
        chips[9].setDrawable(R.drawable.black);
        chips[10].setDrawable(R.drawable.gray);
        
        final EditText [] values = new EditText [11];
        
        values[0] = (EditText) findViewById(R.id.blueValue);
        values[1] = (EditText) findViewById(R.id.greenValue);
        values[2] = (EditText) findViewById(R.id.lightblueValue);
        values[3] = (EditText) findViewById(R.id.orangeValue);
        values[4] = (EditText) findViewById(R.id.pinkValue);
        values[5] = (EditText) findViewById(R.id.purpleValue);
        values[6] = (EditText) findViewById(R.id.redValue);
        values[7] = (EditText) findViewById(R.id.yellowValue);
        values[8] = (EditText) findViewById(R.id.whiteValue);
        values[9] = (EditText) findViewById(R.id.blackValue);
        values[10] = (EditText) findViewById(R.id.grayValue);
        

        
        
        for(int i=0; i<11; i++)
        {
        	if(chips[i].getValue()>0)
        	{
        		String formatedValue = dec.format(chips[i].getValue());
            	values[i].setText(formatedValue);
        	}
        }
        
        
        
        final Button btnSaveValues = (Button) findViewById(R.id.btnSaveValues); //initialise set values button
    	btnSaveValues.setOnClickListener(new OnClickListener() {
    		@Override
    		public void onClick(final View view) {
    			Log.d(TAG, "Save Values button pressed.");
    			
    			SharedPreferences.Editor editor = settings.edit();

    			for(int i=0; i<11; i++)
    	        {
    	        	//create unique names for chip data
    	        	String valueName = "value" + i;
    	        	String drawableName = "drawable" + i;
    	        	
    	        	//get value from form
    	        	float value = 0;
    	        	if(!(values[i].getText().toString().equals("")))
    	        		value = Float.parseFloat(values[i].getText().toString());
    	        	
    	        	//put data into storage.
    	        	editor.putFloat(valueName, value);
    	        	editor.putInt(drawableName, chips[i].getDrawable());
    	        }
    			editor.commit();
    			
    			//Start the chip counter activity again.
    			Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
    		}
    	});
    	addLinkListener();
    }
}