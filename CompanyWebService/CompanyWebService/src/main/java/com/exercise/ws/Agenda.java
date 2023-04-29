/* 
* Course: Distributed Programming 2021/2022
* 
* Group:
* Salvati       Vincenzo    0622701550  v.salvati10@studenti.unisa.it
* Giuseppe    	Renzulli    0622701514  g.renzulli4@studenti.unisa.it
* 
*/

/**
    @file Agenda.java
*/

// PURPOSE OF THE FILE: The script generates a Agenda HashMap. 

package com.exercise.ws;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
public class Agenda implements Serializable {

	private Map<Date, String> mapProperty;

	public Agenda() {
		mapProperty = new HashMap<>();
	}

	@XmlJavaTypeAdapter(MapAdapter.class)
	public Map<Date, String> getMapProperty() {
		return mapProperty;
	}

	public void setMapProperty(Map<Date, String> map) {
		this.mapProperty = map;
	}

}