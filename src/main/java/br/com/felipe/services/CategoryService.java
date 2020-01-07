package br.com.felipe.services;


import br.com.felipe.domain.Category;
import br.com.felipe.domain.Product;
import br.com.felipe.repositories.CategoryRepository;
import br.com.felipe.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    public Category findCategoryById(Integer id) {

        Optional<Category> optionalCategory = categoryRepository.findById(id);

        return optionalCategory.orElseThrow(()-> new RuntimeException("Not found a Category with this Id " + id));
    }

    public void createProductsAndCategories() {
        Category category = new Category(null, "category1");
        Category category2 = new Category(null, "category2");

        Product p1 = new Product(null, "Impressora", 300.00);
        Product p2 = new Product(null, "Notebook", 400.00);
        Product p3 = new Product(null, "Livro", 500.00);

        p1.getCategories().add(category);
        p2.getCategories().add(category2);
        p3.getCategories().addAll(Arrays.asList(category, category2));

        categoryRepository.saveAll(Arrays.asList(category, category2));
        productRepository.saveAll(Arrays.asList(p1, p2, p3));
    }
}
