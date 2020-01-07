package br.com.felipe.repositories;


import br.com.felipe.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Override
    List<Customer> findAll();

    @Override
    List<Customer> findAllById(Iterable<Integer> iterable);

    @Override
    Optional<Customer> findById(Integer integer);

    @Override
    Page<Customer> findAll(Pageable pageable);
}
