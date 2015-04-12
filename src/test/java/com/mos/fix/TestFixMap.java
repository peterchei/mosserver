package com.mos.fix;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import com.mos.fix.FixMap.Map;

public class TestFixMap {

	@Test
	public void testMap() throws Exception {

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(FixMap.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			FixMap fixMapper = new FixMap();
			fixMapper.getMaps().add(new Map());
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
			InputStream input = FixMap.class.getResourceAsStream("FixMap.xml");

			FixMap map = (FixMap) jaxbUnMarshaller.unmarshal(input);

			jaxbMarshaller.marshal(map, System.out);

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

	}
}
