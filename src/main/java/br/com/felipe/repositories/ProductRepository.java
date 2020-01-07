package br.com.felipe.repositories;


import br.com.felipe.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Override
    List<Product> findAll();

    @Override
    List<Product> findAllById(Iterable<Integer> iterable);

    @Override
    Optional<Product> findById(Integer integer);

    @Override
    Page<Product> findAll(Pageable pageable);
}
