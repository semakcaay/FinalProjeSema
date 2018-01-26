package com.semaakcay.FinalProje;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/habermerkezi")
/**
 * Bu sınıfta, haberleri web ile oluşturarak
 * HaberBilgi sınıfına yolluyoruz.
 * @author Sema Akçay
 */
public class Restservis {
	private static final List<HaberBilgi>HaberMetinleri=new ArrayList<HaberBilgi>();
	@RequestMapping("/olustur")
	/**
	 * Bu fonksiyonda yeni haber eklenir.
	 * @param metin haber metnini tutar.
	 * @return yenihaber eklenen haberi döner.
	 */
	public HaberBilgi haberOlustur(String metin) {
		HaberBilgi yenihaber=new HaberBilgi(metin);
		HaberMetinleri.add(yenihaber);
		return yenihaber;
	}
	/**
	 * Eklenen tüm haberleri gösteren fonksiyon.
	 * @return HaberMetinleri tüm haberleri döner.
	 */
	@RequestMapping("/listele")
		public List<HaberBilgi> haberListele(){
			return HaberMetinleri;
		}
	/**
	 * İstenilen haberi siler.
	 * @param id id aracılığıyla haber siler.
	 */
	@RequestMapping("/sil")
	void haberSil(int id) {
		HaberMetinleri.removeIf(argHaberBilgi->argHaberBilgi.getId()==id);
	}
	
}
