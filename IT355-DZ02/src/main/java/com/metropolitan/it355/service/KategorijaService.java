/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metropolitan.it355.service;

import com.metropolitan.it355.model.Kategorija;
import java.util.List;

/**
 *
 * @author Milica Blagojevic
 */
public interface KategorijaService {
    
    public int getCount();

    public List<Kategorija> getAllKategorija();

    public boolean addKategorija(Kategorija kategorija);
    
    public boolean editKategorija(Kategorija kategorija);
    
    public boolean deleteKategorija(Kategorija kategorija);

    public Kategorija getKategorijaByID(int ID);
    
}
