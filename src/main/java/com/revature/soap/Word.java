package com.revature.soap;

/**
 * @author raj & rob
 *
 */
public class Word {

	String english;
	String root;
	String type;
	String[] endings;
	
	
	public Word(String english, String root, String type, String partOfSpeech, String[] endings) {
		this.english = english;
		this.root = root;
		this.type = type;
		
		if(partOfSpeech.equals("noun")) {
			this.endings = new String[12];
			this.endings = endings;
			
		}else {
			this.endings = new String[7];
			this.endings = endings;
		}	
	}

	private String getEnglish() {
		return english;
	}

	private void setEnglish(String english) {
		this.english = english;
	}

	private String getRoot() {
		return root;
	}

	private void setRoot(String root) {
		this.root = root;
	}

	private String getType() {
		return type;
	}

	private void setType(String type) {
		this.type = type;
	}

	private String[] getEndings() {
		return endings;
	}

	private void setEndings(String[] endings) {
		this.endings = endings;
	}
	
}
