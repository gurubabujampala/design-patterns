/**
 * 
 */
package com.abstractfactory.design.patterns.computerfactory;

import com.abstractfactory.design.patterns.computer.Computer;
import com.abstractfactory.design.patterns.computer.PC;

/**
 * @author 788247
 *
 */
public class PCFactory implements AbstractComputerFactory {

	public Computer createComputer() {
		return new PC(this.RAM, this.HDDisc);
	}

	public String RAM;
	public String HDDisc;
	
	public PCFactory(String RAM, String HDDisc){
		this.RAM = RAM;
		this.HDDisc = HDDisc;
	}
}
