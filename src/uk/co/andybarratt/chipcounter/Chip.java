package uk.co.andybarratt.chipcounter;

public class Chip {
	
	private String drawable;
	private float value;
	
	public Chip(String drawable, float value)
	{
		this.drawable = drawable;
		this.value = value;
	}

	public String getDrawable()
	{
		return drawable;
	}
	
	public void setDrawable(String drawable)
	{
		this.drawable = drawable;
	}
	
	public float getValue()
	{
		return value;
	}
	
	public void setValue(float value)
	{
		this.value = value;
	}
	
	public float getTotalValue(int numChips)
	{
		return value * numChips;
	}

}
