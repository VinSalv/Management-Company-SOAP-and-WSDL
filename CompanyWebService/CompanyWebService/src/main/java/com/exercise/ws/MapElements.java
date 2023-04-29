/* 
* Course: Distributed Programming 2021/2022
* 
* Group:
* Salvati       Vincenzo    0622701550  v.salvati10@studenti.unisa.it
* Giuseppe    	Renzulli    0622701514  g.renzulli4@studenti.unisa.it
* 
*/

/**
    @file MapElements.java
*/

// PURPOSE OF THE FILE: The script manages the Agenda HashMap's elements. 

package com.exercise.ws;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

class MapElements {

	@XmlElement
	public Date key;

	@XmlElement
	public String value;

	private MapElements() {
	} // Required by JAXB

	public MapElements(Date key, String value) {
		this.key = key;
		this.value = value;
	}
}