package com.muhammet;

import com.muhammet.entity.Personel;
import com.muhammet.entity.Unvanlar;

import static com.muhammet.entity.Sabitler.*;
public class Runner {

	public static void main(String[] args) {

		/**
		 * Sorun-> 
		 * 1-> unvan k�sm� String olsa idi M�d�r i�in -> m�d�r, M�d�r, M�D�R, m�d., md.
		 * -> zab�t katibi -> zb kt., zab�t katibi- izinli, 
		 * Ge�ici efektif olmayan ��z�m-> 
		 * 2-> String yerine int kullan�r�m b�ylece �nvana kar��l�k girilen yas�yal de�er 
		 * kullan�l�r.
		 * Do�ru olan ��z�m->
		 * 3-> enum kullanmakt�r. ��nk� ki�iyi bellibir de�er girmeye zorluyoruz ve i�inde istedi�imiz 
		 * parametreyi ala�yoruz.
		 */
		Personel personel = 
				new Personel("Ay�e VAR", "Ankara merkez", "0 555 666 99 88", 145827, 0);// hata yok bug var
		

		 personel = 
					new Personel("Ay�e VAR", "Ankara merkez", "0 555 666 99 88", UNVAN_MUDUR, DURUM_AKTIF);// do�ru
			//																	�nvan          durum
		 personel = 
					new Personel("Ay�e VAR", "Ankara merkez", "0 555 666 99 88", DURUM_AKTIF, UNVAN_MUDUR);// hata yok bug
	
		 /**
		  *  Enum
		  */
		 
		 // Unvanlar unvanlar = new Unvanlar(); // enum i�in yanl��
		 // Unvanlar.Muhendis = 6;  // de�er de atayamad�m.
		 System.out.println("M�hendis....: "+ Unvanlar.Muhendis);
		 System.out.println("M�hendis....: "+ Unvanlar.Muhendis);
		 
		 personel = 
					new Personel("Ay�e VAR", "Ankara merkez", "0 555 666 99 88",Unvanlar.Muhendis ,0 );
	
		 personel = 
					new Personel("Ay�e VAR", "Ankara merkez", "0 555 666 99 88", Unvanlar.Muhendis.getNo(), 1);// hata yok bug
	
	}

}
