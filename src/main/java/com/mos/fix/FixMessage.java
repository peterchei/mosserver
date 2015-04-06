package com.mos.fix;

/**
 * 
 * 
 * @author Hung
 *
 */
public class FixMessage {

		
	private String rawMessage;

	public FixMessage(String message) {
		rawMessage = message;
		validate();
		build();
	}

	public void validate() {

	}

	private void build() {

	}

	public String getValue(int tagNumber) {

		return null;
	}

	public String[] getRepeatingGroupValues(int tagNumber) {

		return null;
	}

	public boolean isPresent(int tagNumber) {

		return false;
	}
	
	public MessageType getMessageType() {
		return null;
	}

}
