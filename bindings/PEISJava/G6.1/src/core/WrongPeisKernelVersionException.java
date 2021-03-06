/*
    Copyright (C) 2008 - 2011 Federico Pecora
    
    Based on libpeiskernel (Copyright (C) 2005 - 2011  Mathias Broxvall).
    
    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
    02110-1301 USA.
*/


package core;

public class WrongPeisKernelVersionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String peisjavaVersion = null;
	private String peiskernelVersion = null;
	
	public WrongPeisKernelVersionException(String pjV, String pkV) {
		peisjavaVersion = pjV;
		peiskernelVersion = pkV;
	}
	
	public String getMessage() {
		return "PeisJava version " + peisjavaVersion  + " is not compatible with installed PeisKernel version " + peiskernelVersion;
	}
	
	

}
