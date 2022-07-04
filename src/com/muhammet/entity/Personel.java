package com.muhammet.entity;

import java.util.UUID;

public class Personel {

	public String uuid;
	public String ad;
	public String adres;
	public String telefon;	
	public int unvan;
	public Unvanlar unvani;
	public int durum;
	/**
	 * 
	 * @param ad
	 * @param adres
	 * @param telefon
	 * @param unvan -> 1->M�d�r, 2->Hizmetli, 3-> M�hendis ....
	 * @param durum -> 0-> pasif kay�t, 1-> yeni kay�t aktif edicecek, 2-> aktif kay�t, 3-> silimi� kay�t ...
	 */
	public Personel(String ad, String adres, String telefon, int unvan, int durum) {
		super();
		this.uuid = UUID.randomUUID().toString();
		this.ad = ad;
		this.adres = adres;
		this.telefon = telefon;
		this.unvan = unvan;
		this.durum = durum;
	}
	public Personel(String ad, String adres, String telefon, Unvanlar unvani, int durum) {
		super();
		this.uuid = UUID.randomUUID().toString();
		this.ad = ad;
		this.adres = adres;
		this.telefon = telefon;
		this.unvani = unvani;
		this.unvan = unvani.getNo();
		this.durum = durum;
	}
	
	
	
	
}
