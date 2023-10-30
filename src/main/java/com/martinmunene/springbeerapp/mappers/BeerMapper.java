package com.martinmunene.springbeerapp.mappers;

import com.martinmunene.springbeerapp.entities.Beer;
import com.martinmunene.springbeerapp.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * @author Martin Munene
 */
@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDTO beerDTO);

    BeerDTO beerToBeerDto(Beer beer);
}
