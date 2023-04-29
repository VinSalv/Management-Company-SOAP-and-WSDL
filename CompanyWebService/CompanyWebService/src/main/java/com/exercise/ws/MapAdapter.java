/* 
* Course: Distributed Programming 2021/2022
* 
* Group:
* Salvati       Vincenzo    0622701550  v.salvati10@studenti.unisa.it
* Giuseppe    	Renzulli    0622701514  g.renzulli4@studenti.unisa.it
* 
*/

/**
    @file MapAdapter.java
*/

// PURPOSE OF THE FILE: The script manages the XML Adapter for the Agenda HashMap. 

package com.exercise.ws;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import java.util.Date;

class MapAdapter extends XmlAdapter<MapElements[], Map<Date, String>> {

	public MapElements[] marshal(Map<Date, String> arg0) {

		MapElements[] mapElements = new MapElements[arg0.size()];
		int i = 0;
		for (Map.Entry<Date, String> entry : arg0.entrySet())
			mapElements[i++] = new MapElements(entry.getKey(), entry.getValue());

		return mapElements;

	}

	public Map<Date, String> unmarshal(MapElements[] arg0) {

		Map<Date, String> r = new HashMap<>();
		for (MapElements element : arg0)
			r.put(element.key, element.value);
		return r;

	}

}