package com.faks.faks.model.dto;

import com.faks.faks.model.entity.Category;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class CategoryDTO {
    private Long id;
    private String name;

    public static CategoryDTO fromEntity(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());

        return categoryDTO;
    }

    public static List<CategoryDTO> fromList(List<Category> categories) {
        return categories.stream().map(CategoryDTO::fromEntity).collect(Collectors.toList());
    }
}
