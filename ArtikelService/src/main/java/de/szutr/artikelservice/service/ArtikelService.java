package de.szutr.artikelservice.service;


import de.szutr.artikelservice.model.Artikel;
import de.szutr.artikelservice.repository.ArtikelDao;

import java.util.List;

public class ArtikelService {

    private ArtikelDao artikelDao;

    public ArtikelService() {
        artikelDao = new ArtikelDao();
    }

    public Artikel add(Artikel artikel) {
        artikelDao.
    }

    public Artikel read(long id) {
        return artikelDao.read(id);
    }

    public List<Artikel> read() {
        return artikelDao.read();
    }

    public Artikel update(Artikel artikel) {
        return artikelDao.
    }

    public void delete(long id) {
        artikelDao.delete(id);
    }
}
