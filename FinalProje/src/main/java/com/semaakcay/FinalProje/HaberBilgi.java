package com.semaakcay.FinalProje;
/**
 * Bu class, haberlerin temel bilgilerini tutar.
 * @author Sema Akçay
 */
public class HaberBilgi {
	private int id;
    private static int COUNT=0;
    public String metin;
    /**
     * Sınıfın yapıcı fonksiyonu. Yeni haber eklemek
     * için bu fonksiyon kullanılır.
     * @param metin haber metnini tutan parametre.
     */
    public HaberBilgi(String metin) {
     super();
     this.id=++COUNT;
     this.metin=metin;
    }
    /**
     * getter fonskiyonu
     * @return id
     */
    public int getId() {
     return id;
    }
    /**
     * getter fonskiyonu
     * @return metin
     */
    public String getMetin() {
     return metin;
    }
}
