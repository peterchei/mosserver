package com.mos.fix;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FixMap")
public class FixMap {

	private List<Map> maps = new ArrayList<Map>();

	@XmlElement(name = "Map")
	public List<Map> getMaps() {
		return maps;
	}

	public static class Map {

		private int tagNumber;
		private String tagName;
		private Boolean isRepeatingGroup;
		
		@XmlAttribute(name = "ID")
		public int getTagNumber() {
			return tagNumber;
		}

		@XmlAttribute(name = "TagName")
		public String getTagName() {
			return tagName;
		}

		@XmlAttribute(name = "isRepeatingGroup")
		public Boolean getIsRepeatingGroup() {
			return isRepeatingGroup;
		}


		public void setTagNumber(int tagNumber) {
			this.tagNumber = tagNumber;
		}
		
		public void setTagName(String tagName) {
			this.tagName = tagName;
		}

		
		public void setIsRepeatingGroup(Boolean isRepeatingGroup) {
			this.isRepeatingGroup = isRepeatingGroup;
		}

	}

}
