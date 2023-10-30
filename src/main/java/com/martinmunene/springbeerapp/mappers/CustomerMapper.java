package com.martinmunene.springbeerapp.mappers;

import com.martinmunene.springbeerapp.entities.Customer;
import com.martinmunene.springbeerapp.model.CustomerDTO;
import org.mapstruct.Mapper;

/**
 * @author Martin Munene
 */
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO customerDTO);

    CustomerDTO customerToCustomerDto(Customer customer);
}
