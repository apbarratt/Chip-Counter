package uk.co.andybarratt.chipcounter;

import android.os.Bundle;
import android.view.Window;


public class Ranking extends CustomActivity
{
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //remove the android title bar
        
        setContentView(R.layout.rankings);
        
    	addLinkListener();
    }
}