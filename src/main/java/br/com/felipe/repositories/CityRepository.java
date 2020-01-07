package br.com.felipe.repositories;


import br.com.felipe.domain.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {

    @Override
    List<City> findAll();

    @Override
    List<City> findAllById(Iterable<Integer> iterable);

    @Override
    Optional<City> findById(Integer integer);

    @Override
    Page<City> findAll(Pageable pageable);
}
