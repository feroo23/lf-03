package de.szutr.artikelservice.controller;

import de.szutr.artikelservice.model.Artikel;
import de.szutr.artikelservice.service.ArtikelService;

public class controller {

    private ArtikelService artikelService;

    public controller() {
        artikelService = new ArtikelService();
    }
}
