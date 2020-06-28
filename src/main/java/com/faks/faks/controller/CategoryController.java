package com.faks.faks.controller;

import com.faks.faks.model.command.base.ApiBasePageCommand;
import com.faks.faks.model.command.category.DeleteCategoryCommand;
import com.faks.faks.model.command.category.FilterCategoryCommand;
import com.faks.faks.model.command.category.SaveCategoryCommand;
import com.faks.faks.model.dto.CategoryDTO;
import com.faks.faks.model.dto.base.base.ApiBaseDTO;
import com.faks.faks.model.dto.base.base.ApiBasePageDTO;
import com.faks.faks.service.category.CategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @ApiOperation("Save Category")
    @RequestMapping("/save")
    public ApiBaseDTO<CategoryDTO> saveCategory(@RequestBody SaveCategoryCommand command) {
        return categoryService.saveCategory(command);
    }

    @ApiOperation("Delete Category")
    @RequestMapping("/delete")
    public Boolean deleteCategory(@RequestBody DeleteCategoryCommand command) {
        return categoryService.deleteCategory(command);
    }

    @ApiOperation("Filter Category")
    @RequestMapping("/filter")
    public ApiBasePageDTO<CategoryDTO> filterCategory(@RequestBody ApiBasePageCommand<FilterCategoryCommand> command){
        return categoryService.filterCategory(command);
    }
}
