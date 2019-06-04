/**
 * 
 */
package com.abstractfactory.design.patterns.computer;

/**
 * @author 788247
 *
 */
public class Server implements Computer {

	public String RAM;
	private String HDDisc;
	
	public Server(String RAM, String HDDisc){
		this.RAM = RAM;
		this.HDDisc = HDDisc;
	}
	
	public String RAM() {
		return null;
	}

	
	public String HDDisc() {
		return null;
	}

}
