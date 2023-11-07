package com.martinmunene.springbeerapp.services;

import com.martinmunene.springbeerapp.model.BeerCSVRecord;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

/**
 * @author Martin Munene
 */
public interface BeerCsvService {
    List<BeerCSVRecord> convertCSV(File csvFile);
}
