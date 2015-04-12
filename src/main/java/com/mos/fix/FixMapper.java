package com.mos.fix;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.inject.Inject;
import com.mos.fix.FixMap.Map;

/**
 * Convert FIX message to a POJO java object based on mappings.xml
 * 
 * 
 * @author Hung
 *
 */
public class FixMapper {

	@Inject
	private static FixMapper instance = null;
	private static FixMap map = null;

	public static FixMapper getInstance() throws JAXBException {

		if (instance != null) {
			return instance;
		} else {
			instance = new FixMapper();
			return instance;
		}
	}

	private FixMapper() throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(FixMap.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
		InputStream input = FixMap.class.getResourceAsStream("FixMap.xml");

		map = (FixMap) jaxbUnMarshaller.unmarshal(input);

	}
	
	public FixMap getFixMap() {
		return map;
	}
	
	public static void main(String args[]) throws JAXBException {
		
		FixMapper mapper = FixMapper.getInstance();		
		FixMap map = mapper.getFixMap();		
		for (Map item: map.getMaps()) {			
			System.out.println(item.getTagName());
		}
		

	}



}
