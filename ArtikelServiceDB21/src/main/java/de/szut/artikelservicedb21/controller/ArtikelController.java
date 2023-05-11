package de.szut.artikelservicedb21.controller;


import de.szut.artikelservicedb21.model.Artikel;
import de.szut.artikelservicedb21.service.ArtikelService;

import java.util.List;

@RestController
@RequestMapping("/myappdata/articles")
public class ArtikelController {

    private ArtikelService artikelService;

    public ArtikelController(){
        artikelService = new ArtikelService();
    }

    @GetMapping
    public ResponseEntity<List<Artikel>> getArtikel(){
        List<Artikel> artikelList = artikelService.read();
        return new ResponseEntity<>(artikelList, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Artikel> getArtikel(@PathVariable long id ) {
        Artikel artikel = artikelService.read(id);
        return new ResponseEntity<>(artikel, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Artikel> addArtikel(@RequestBody Artikel request){
        Artikel artikel = artikelService.add(request);
        return new ResponseEntity<>(artikel, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateArtikel(@RequestBody Artikel request){
        artikelService.update(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteArtikel(@PathVariable long id){
        artikelService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

