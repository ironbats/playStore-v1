package br.com.felipe.repositories;


import br.com.felipe.domain.State;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StateRepository extends JpaRepository<State,Integer> {

    @Override
    List<State> findAll();

    @Override
    List<State> findAllById(Iterable<Integer> iterable);

    @Override
    Optional<State> findById(Integer integer);

    @Override
    Page<State> findAll(Pageable pageable);
}
