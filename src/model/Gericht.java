package model;

import java.sql.Blob;

public class Gericht {

	private int gerichtID;
	private String gerichtName;
	private int minuten;
	private int stunden;
	private Blob image;

	public Gericht(String gerichtName, int minuten, int stunden, Blob image) {
		super();
		this.gerichtName = gerichtName;
		this.minuten = minuten;
		this.stunden = stunden;
		this.image = image;
	}

	public Gericht(String gerichtName, int minuten, int stunden) {
		super();
		this.gerichtName = gerichtName;
		this.minuten = minuten;
		this.stunden = stunden;
	}

	public Gericht(int gerichtID) {
		this.gerichtID = gerichtID;
	}

	public Gericht() {
		super();
	}

	public int getGerichtID() {
		return gerichtID;
	}

	public void setGerichtID(int gerichtID) {
		this.gerichtID = gerichtID;
	}

	public String getGerichtName() {
		return gerichtName;
	}

	public void setGerichtName(String gerichtName) {
		this.gerichtName = gerichtName;
	}

	public int getMinuten() {
		return minuten;
	}

	public void setMinuten(int minuten) {
		this.minuten = minuten;
	}

	public int getStunden() {
		return stunden;
	}

	public void setStunden(int stunden) {
		this.stunden = stunden;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

}
