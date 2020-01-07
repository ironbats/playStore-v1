package br.com.felipe.repositories;


import br.com.felipe.domain.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {

    @Override
    List<Address> findAll();

    @Override
    List<Address> findAllById(Iterable<Integer> iterable);

    @Override
    Optional<Address> findById(Integer integer);

    @Override
    Page<Address> findAll(Pageable pageable);
}
