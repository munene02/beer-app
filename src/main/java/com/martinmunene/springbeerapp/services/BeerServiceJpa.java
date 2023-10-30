package com.martinmunene.springbeerapp.services;

import com.martinmunene.springbeerapp.entities.Beer;
import com.martinmunene.springbeerapp.mappers.BeerMapper;
import com.martinmunene.springbeerapp.model.BeerDTO;
import com.martinmunene.springbeerapp.repositories.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

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
        return beerRepository.findAll()
                .stream()
                .map(mapper::beerToBeerDto)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<BeerDTO> getBeerById(UUID id) {
        return Optional.ofNullable(mapper.beerToBeerDto(beerRepository.findById(id)
                .orElse(null)));
    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beer) {
        Beer savedBeer =  beerRepository.save(mapper.beerDtoToBeer(beer));
        return mapper.beerToBeerDto(savedBeer);
    }

    @Override
    public Optional<BeerDTO> updateBeerById(UUID beerId, BeerDTO beer) {
        AtomicReference<Optional<BeerDTO>> atomicReference = new AtomicReference<>();
        beerRepository.findById(beerId).ifPresentOrElse(foundBeer -> {
            foundBeer.setBeerName(beer.getBeerName());
            foundBeer.setBeerStyle(beer.getBeerStyle());
            foundBeer.setUpc(beer.getUpc());
            foundBeer.setPrice(beer.getPrice());

            atomicReference.set(Optional.of(mapper.beerToBeerDto(beerRepository.save(foundBeer))));
        }, ()->{
            atomicReference.set(Optional.empty());
        });

        return atomicReference.get();
    }

    @Override
    public boolean deleteById(UUID beerId) {
        if(beerRepository.existsById(beerId)){
            beerRepository.deleteById(beerId);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void patchBeerById(UUID beerId, BeerDTO beer) {

    }
}
