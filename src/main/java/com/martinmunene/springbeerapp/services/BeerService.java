package com.martinmunene.springbeerapp.services;

import com.martinmunene.springbeerapp.model.BeerDTO;
import com.martinmunene.springbeerapp.model.BeerStyle;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Martin Munene
 */
public interface BeerService {
    List<BeerDTO> listBeers(String beerName, BeerStyle beerStyle, Boolean showInventory);

    Optional<BeerDTO> getBeerById(UUID id);


    BeerDTO saveNewBeer(BeerDTO beer);

    Optional<BeerDTO> updateBeerById(UUID beerId, BeerDTO beer);

    boolean deleteById(UUID beerId);

    Optional<BeerDTO> patchBeerById(UUID beerId, BeerDTO beer);
}
