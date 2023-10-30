package com.martinmunene.springbeerapp.services;

import com.martinmunene.springbeerapp.mappers.BeerMapper;
import com.martinmunene.springbeerapp.model.BeerDTO;
import com.martinmunene.springbeerapp.repositories.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Martin Munene
 */
@Service
@Primary
@RequiredArgsConstructor
public class BeerServiceJpa implements BeerService {
    private final BeerRepository beerRepository;
    private final BeerMapper mapper;

    @Override
    public List<BeerDTO> listBeers() {
        return null;
    }

    @Override
    public Optional<BeerDTO> getBeerById(UUID id) {
        return Optional.empty();
    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beer) {
        return null;
    }

    @Override
    public Optional<BeerDTO> updateBeerById(UUID beerId, BeerDTO beer) {
        return Optional.empty();
    }

    @Override
    public void deleteById(UUID beerId) {

    }

    @Override
    public void patchBeerById(UUID beerId, BeerDTO beer) {

    }
}
