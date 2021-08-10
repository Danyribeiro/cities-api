package com.github.Danyribeiro.citiesapi.countries.repository;

import com.github.Danyribeiro.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
