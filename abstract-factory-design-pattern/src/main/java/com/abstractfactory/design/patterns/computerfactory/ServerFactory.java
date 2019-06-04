/**
 * 
 */
package com.abstractfactory.design.patterns.computerfactory;

import com.abstractfactory.design.patterns.computer.Computer;
import com.abstractfactory.design.patterns.computer.Server;

/**
 * @author 788247
 *
 */
public class ServerFactory implements AbstractComputerFactory {

	public Computer createComputer() {
		return new Server(this.RAM, this.HDDisc);
	}

	public String RAM;
	public String HDDisc;
	
	public ServerFactory(String RAM, String HDDisc){
		this.RAM = RAM;
		this.HDDisc = HDDisc;
	}
}
