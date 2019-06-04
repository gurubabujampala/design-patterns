/**
 * 
 */
package com.abstractfactory.design.patterns.computer.main;

import com.abstractfactory.design.patterns.computer.Computer;
import com.abstractfactory.design.patterns.computerfactory.PCFactory;
import com.abstractfactory.design.patterns.computerfactory.ServerFactory;

/**
 * @author 788247
 *
 */
public class ComputerUsage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Computer server = ComputerFactory.createComputer(new ServerFactory("16GB", "Segate-2TB"));
		Computer pc = ComputerFactory.createComputer(new PCFactory("4GB", "Segate-500GB"));
		
		System.out.println("Server Details :: " + server.getClass());
		System.out.println("PC Details :: " + pc.getClass());
	}

}
