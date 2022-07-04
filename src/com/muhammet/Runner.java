package com.muhammet;

import com.muhammet.entity.Personel;
import com.muhammet.entity.Unvanlar;

import static com.muhammet.entity.Sabitler.*;
public class Runner {

	public static void main(String[] args) {

		/**
		 * Sorun-> 
		 * 1-> unvan kýsmý String olsa idi Müdür için -> müdür, Müdür, MÜDÜR, müd., md.
		 * -> zabýt katibi -> zb kt., zabýt katibi- izinli, 
		 * Geçici efektif olmayan Çözüm-> 
		 * 2-> String yerine int kullanýrým böylece ünvana karþýlýk girilen yasýyal deðer 
		 * kullanýlýr.
		 * Doðru olan çözüm->
		 * 3-> enum kullanmaktýr. çünkü kiþiyi bellibir deðer girmeye zorluyoruz ve içinde istediðimiz 
		 * parametreyi alaýyoruz.
		 */
		Personel personel = 
				new Personel("Ayþe VAR", "Ankara merkez", "0 555 666 99 88", 145827, 0);// hata yok bug var
		

		 personel = 
					new Personel("Ayþe VAR", "Ankara merkez", "0 555 666 99 88", UNVAN_MUDUR, DURUM_AKTIF);// doðru
			//																	ünvan          durum
		 personel = 
					new Personel("Ayþe VAR", "Ankara merkez", "0 555 666 99 88", DURUM_AKTIF, UNVAN_MUDUR);// hata yok bug
	
		 /**
		  *  Enum
		  */
		 
		 // Unvanlar unvanlar = new Unvanlar(); // enum için yanlýþ
		 // Unvanlar.Muhendis = 6;  // deðer de atayamadým.
		 System.out.println("Mühendis....: "+ Unvanlar.Muhendis);
		 System.out.println("Mühendis....: "+ Unvanlar.Muhendis);
		 
		 personel = 
					new Personel("Ayþe VAR", "Ankara merkez", "0 555 666 99 88",Unvanlar.Muhendis ,0 );
	
		 personel = 
					new Personel("Ayþe VAR", "Ankara merkez", "0 555 666 99 88", Unvanlar.Muhendis.getNo(), 1);// hata yok bug
	
	}

}
