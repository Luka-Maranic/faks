package com.faks.faks.model.command.category;

import com.faks.faks.model.entity.Category;
import lombok.Data;

@Data
public class SaveCategoryCommand {
    private Long id;
    private String name;

    public Category toEntity() {
        Category category = new Category();
        category.setId(this.id);
        category.setName(this.name);

        return category;
    }
}
