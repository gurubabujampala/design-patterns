/**
 * 
 */
package com.abstractfactory.design.patterns.computer;

/**
 * @author 788247
 *
 */
public class PC implements Computer {

	public String RAM;
	private String HDDisc;
	
	public PC(String RAM, String HDDisc){
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
