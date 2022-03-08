package de.szutr.artikelservice.repository ;

import de.szutr.artikelservice.model.Artikel;

import java.util.List;
import java.util.Map;

public class ArtikelDao {

   private Map<Long, Artikel> artikelListe;

   public void artikelDao(){

   }

   private void initHashMap(){

   }

   public Artikel create(Artikel artikel){
      if (artikelListe.containsKey(artikel.getId())){
         return null;
      }
      else {
         artikelListe.put(artikel.getId(), artikel);
         return artikelListe.get(artikel.getId());
      }
   }

   public Artikel read(long id){

   }
   public List<Artikel> read(){

   }
         
   public update(Artikel artikel) {

   }

   public void delete(long id){

   }

}
