package com.muhammet.entity;

public enum Unvanlar {
	
	Mudur("Müdür",1),
	Hizmetli("Hizmetli",2),
	Muhendis("Muhendis",3),
	Memur("Memur",4),
	ZabitKatibi("ZabitKatibi",5),
	Ceo("Ceo",6);
	
	String ad;
	int no;
	
	Unvanlar(String ad, int no) {
		this.ad = ad;
		this.no = no;
	}

	public String getAd() {
		return ad;
	}

	public int getNo() {
		return no;
	}

	
}
