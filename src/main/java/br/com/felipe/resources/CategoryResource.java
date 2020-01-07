package br.com.felipe.resources;

import br.com.felipe.domain.Category;
import br.com.felipe.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "/insert")
    public void createCategoriesWithProducts() {
        categoryService.createProductsAndCategories();
    }

    @GetMapping(value = "/category/{id}")
    public ResponseEntity<?> getCategories(@PathVariable Integer id) {
        Category category = categoryService.findCategoryById(id);
        return ResponseEntity.ok().body(category);
    }
}
