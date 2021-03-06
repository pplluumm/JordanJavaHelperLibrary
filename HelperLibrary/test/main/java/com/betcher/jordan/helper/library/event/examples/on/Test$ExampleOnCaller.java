package main.java.com.betcher.jordan.helper.library.event.examples.on;

import main.java.com.betcher.jordan.helper.library.event.onCaller.OnCaller;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

@SuppressWarnings("unchecked")
class Test$ExampleOnCaller
{
	@Test
	public void addThreeCallsBeforeRemoving_onButtonChange_addOnButtonChange3ToButtonCaller()
	{
		ExampleOnButtonChange onButtonChange = mock(ExampleOnButtonChange.class);
		OnCaller<Integer> buttonCaller = mock(OnCaller.class);
		
		ExampleOnCaller exampleOnCaller = new ExampleOnCaller(buttonCaller);
		exampleOnCaller.addThreeCallsBeforeRemoving(onButtonChange);
		
		verify(buttonCaller, times(1)).add(onButtonChange, 3);
	}
	
	@Test
	public void addOneCallBeforeRemoving_onButtonChange_addOnButtonChange1ToButtonCaller()
	{
		ExampleOnButtonChange onButtonChange = mock(ExampleOnButtonChange.class);
		OnCaller<Integer> buttonCaller = mock(OnCaller.class);
		
		ExampleOnCaller exampleOnCaller = new ExampleOnCaller(buttonCaller);
		exampleOnCaller.addOneCallBeforeRemoving(onButtonChange);
		
		verify(buttonCaller, times(1)).add(onButtonChange, 1);
	}
	
	@Test
	public void remove_onButtonChange_removeOnButtonChangeToButtonCaller()
	{
		ExampleOnButtonChange onButtonChange = mock(ExampleOnButtonChange.class);
		OnCaller<Integer> buttonCaller = mock(OnCaller.class);
		
		ExampleOnCaller exampleOnCaller = new ExampleOnCaller(buttonCaller);
		exampleOnCaller.remove(onButtonChange);
		
		verify(buttonCaller, times(1)).remove(onButtonChange);
	}
	
	@Test
	public void add_onButtonChange_addOnButtonChangeToButtonCaller()
	{
		ExampleOnButtonChange onButtonChange = mock(ExampleOnButtonChange.class);
		OnCaller<Integer> buttonCaller = mock(OnCaller.class);
		
		ExampleOnCaller exampleOnCaller = new ExampleOnCaller(buttonCaller);
		exampleOnCaller.add(onButtonChange);
		
		verify(buttonCaller, times(1)).add(onButtonChange);
	}
	
	@Test
	public void onClick_0_buttonCallerCall0()
	{
		int buttonState = 0;
		OnCaller<Integer> buttonCaller = mock(OnCaller.class);
		
		ExampleOnCaller exampleOnCaller = new ExampleOnCaller(buttonCaller);
		exampleOnCaller.onClick(buttonState);
		
		verify(buttonCaller, times(1)).call(buttonState);
	}
	
	@Test
	public void onClick_1_buttonCallerCall1()
	{
		int buttonState = 1;
		OnCaller<Integer> buttonCaller = mock(OnCaller.class);
		
		ExampleOnCaller exampleOnCaller = new ExampleOnCaller(buttonCaller);
		exampleOnCaller.onClick(buttonState);
		
		verify(buttonCaller, times(1)).call(buttonState);
	}
}