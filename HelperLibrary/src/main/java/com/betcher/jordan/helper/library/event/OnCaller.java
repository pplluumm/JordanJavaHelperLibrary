package main.java.com.betcher.jordan.helper.library.event;

import java.util.*;

public class OnCaller<T>
{
	ArrayList<On<T>> ons = new ArrayList<>();
	HashMap<On<T>, Integer> onNumberOfCalls = new HashMap<>();
	
	private int numberOfCalls;
	private T t;
	
	public void add(On<T> on)
	{
		ons.add(on);
	}
	
	public void add(On<T> on, int numberOfCalls)
	{
		onNumberOfCalls.put(on, numberOfCalls);
	}
	
	public void remove(On<T> on)
	{
		ons.remove(on);
	}
	
	public void call(T t)
	{
		if(this.t == null) this.t = t;
		
		Iterator<Map.Entry<On<T>, Integer>> iterator = onNumberOfCalls.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<On<T>, Integer> entry = iterator.next();
			if(entry.getValue() > 0)
			{
				entry.getKey().call(t);
				entry.setValue(entry.getValue() - 1);
			}
			else
			{
				iterator.remove();
			}
		}
		
		for(On<T> on : ons)
		{
			on.call(this.t);
		}
	}
}


