package de.szut.artikelservicemata21.repositorie;

import de.szut.artikelservicemata21.model.Artikel;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ArtikelDao {

    private Map<Long, Artikel> artikelListe = new HashMap<>();

    public ArtikelDao() {
        initHashMap();
    }

    private void initHashMap(){
        insert(new Artikel(1, "ka", "ba", 2, 2));
        insert(new Artikel(2, "sdf", "sdfs", 2, 2));
        insert(new Artikel(3, "sdf", "jukhba", 2, 2));

    }

    public void insert(Artikel artikel){
        this.artikelListe.put(artikel.getId(), artikel);
    }

    public Artikel create(Artikel artikel) {
        if (artikelListe.containsKey(artikel.getId())) {
            return null;
        } else {
            artikelListe.put(artikel.getId(), artikel);
            return artikelListe.get(artikel.getId());
        }
    }

    public Artikel read(long id) {
        Artikel artikel = artikelListe.get(id);
        return artikel;
    }

    public List<Artikel> read() {
        Collection<Artikel> artikels = artikelListe.values();
        ArrayList<Artikel> arrayList = new ArrayList<>(artikels);
        return arrayList;
    }

    public Artikel update(Artikel artikel) {
        if (artikelListe.containsKey(artikel.getId())) {
            return artikelListe.replace(artikel.getId(), artikel);
        } else {
            return null;
        }
    }

    public void delete(long id) {
        artikelListe.remove(id);
    }


}
