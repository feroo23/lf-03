package de.szutr.artikelservice.repository;


import de.szutr.artikelservice.model.Artikel;

import java.util.List;

public class ArtikelService {

    private ArtikelDao artikelDao;

    public ArtikelService(){
        artikelDao = new ArtikelDao();
    }

    public Artikel add(Artikel artikel){

    }

    public Artikel read(long id){

    }

    public List<Artikel> read(){

    }
    public Artikel update(Artikel artikel){

    }

    public void delete(long id){

    }
}
