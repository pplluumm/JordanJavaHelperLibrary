package main.java.com.betcher.jordan.helper.library.event.examples.at;

import main.java.com.betcher.jordan.helper.library.event.AtCaller;
import main.java.com.betcher.jordan.helper.library.event.examples.ExampleThirdParty;

public class ExampleAtCaller implements ExampleThirdParty
{
	private AtCaller AtButtonPressed;
	private AtCaller AtButtonReleased;
	
	public ExampleAtCaller(AtCaller atButtonPressed, AtCaller atButtonReleased)
	{
		//this.AtButtonPressed = atButtonPressed;
		//this.AtButtonReleased = atButtonReleased;
		atButtonPressed.call();
	}
	
	public void add(AtButtonPressed atButtonPressed)
	{
		//AtButtonPressed.add(atButtonPressed, 1);
	}
	
	public void addOneCall(AtButtonPressed atButtonPressed)
	{
		//AtButtonPressed.add(atButtonPressed, 1);
	}
	
	public void add(AtButtonReleased atButtonReleased)
	{
		//AtButtonReleased.add(atButtonReleased);
	}
	
	public void remove(AtButtonPressed atButtonPressed)
	{
		//AtButtonPressed.remove(atButtonPressed);
	}
	
	public void remove(AtButtonReleased atButtonReleased)
	{
		//AtButtonPressed.remove(atButtonReleased);
	}
	
	@Override
	public void onClick(int buttonState)
	{
		/*
		switch(buttonState)
		{
			case ExampleThirdParty.BUTTON_PRESSED -> AtButtonPressed.call();
			case ExampleThirdParty.BUTTON_RELEASED -> AtButtonReleased.call();
		}
		//*/
	}
}