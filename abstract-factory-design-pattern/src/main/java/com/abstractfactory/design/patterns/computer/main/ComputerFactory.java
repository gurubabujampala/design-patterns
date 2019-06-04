/**
 * 
 */
package com.abstractfactory.design.patterns.computer.main;

import com.abstractfactory.design.patterns.computer.Computer;
import com.abstractfactory.design.patterns.computerfactory.AbstractComputerFactory;

/**
 * @author 788247
 *
 */
public class ComputerFactory {

	private ComputerFactory(){
		
	}
	
	public static Computer createComputer(AbstractComputerFactory abstractComputerFactory){
		return abstractComputerFactory.createComputer();
	}
}
