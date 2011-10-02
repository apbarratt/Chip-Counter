package uk.co.andybarratt.chipcounter;

public class Chip {
	
	private int drawable;
	private float value;
	
	public Chip(int drawable, float value)
	{
		this.drawable = drawable;
		this.value = value;
	}

	public int getDrawable()
	{
		return drawable;
	}
	
	public void setDrawable(int drawable)
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
