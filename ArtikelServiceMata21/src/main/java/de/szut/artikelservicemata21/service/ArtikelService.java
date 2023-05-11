package de.szut.artikelservicemata21.service;

import de.szut.artikelservicemata21.model.Artikel;
import de.szut.artikelservicemata21.repositorie.ArtikelDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtikelService {

    private ArtikelDao artikelDao;

    public ArtikelService() {
        artikelDao = new ArtikelDao();
    }


    public Artikel add(Artikel artikel) {
        return artikelDao.create(artikel);
    }

    public Artikel read(long id) {
        return artikelDao.read(id);
    }

    public List<Artikel> read() {
        return artikelDao.read();
    }

    public Artikel update(Artikel artikel) {
        return artikelDao.update(artikel);
    }

    public void delete(long id) {
        artikelDao.delete(id);
    }
}
