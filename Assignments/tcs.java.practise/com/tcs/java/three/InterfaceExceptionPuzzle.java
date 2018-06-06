package com.tcs.java.three;

import java.io.FileNotFoundException;
import java.io.IOException;

interface House{
	public void find() throws FileNotFoundException;
}

interface Home{
	public void find() throws IOException;
}

class P implements Home{
	@Override
	public void find() throws FileNotFoundException { }

	/*@Override
	 * public void find(){ }
	
	@Override
	public void find() throws IOException { }
	
	@Override
	public void find() throws Exception { } //Invalid */
	
}

public class InterfaceExceptionPuzzle implements House,Home{

	public void find(){	}
	
	/*public void find() throws FileNotFoundException{	}
	
	public void find() throws IOException{	}*/
}