package com.martinmunene.springbeerapp.services;

import com.martinmunene.springbeerapp.model.BeerDTO;

import java.util.List;
import java.util.UUID;

/**
 * @author Martin Munene
 */
public interface BeerService {
    List<BeerDTO> listBeers();

    BeerDTO getBeerById(UUID id);

    BeerDTO saveNewBeer(BeerDTO beer);

    void updateBeerById(UUID beerId, BeerDTO beer);

    void deleteById(UUID beerId);

    void patchBeerById(UUID beerId, BeerDTO beer);
}
