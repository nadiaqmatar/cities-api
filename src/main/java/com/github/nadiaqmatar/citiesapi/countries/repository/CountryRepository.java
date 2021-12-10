package com.github.nadiaqmatar.citiesapi.countries.repository;

import com.github.nadiaqmatar.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
