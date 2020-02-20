package org.optum.erp.dms.utils;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Documents {

	
	private ArrayList<Document> document;

	public ArrayList<Document> getDocument() {
		return document;
	}

	public void setDocument(ArrayList<Document> document) {
		this.document = document;
	}

	@Override
	public String toString() {
		return "Documents [document=" + document + "]";
	}
	
	
}
