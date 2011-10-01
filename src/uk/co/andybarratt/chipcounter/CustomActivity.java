package uk.co.andybarratt.chipcounter;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

public class CustomActivity extends Activity
{
	public static final String TAG = "ChipCounter";
	
	protected Chip [] chips = new Chip [11];
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        
    }
    
    public boolean loadChipValues()
    {
    	boolean chipsSet = false;
    	//open settings Shared Preferences
        SharedPreferences settings = getSharedPreferences("ChipCounterValues", 0);
        
        for(int i=0; i<11; i++)
        {
        	//create unique names for chip data
        	String valueName = "value" + i;
        	String drawableName = "drawable" + i;
        	
        	//get data from settings object and read it, set defaults where values not available
        	float chipValue = settings.getFloat(valueName, (float)0.00);
        	String chipDrawable = settings.getString(drawableName, null);
        	
        	//put data into chips array.
        	chips[i] = new Chip(chipDrawable, chipValue);
        	if(chipValue!=0)
        		chipsSet=true;
        }
        return chipsSet;
    }
}