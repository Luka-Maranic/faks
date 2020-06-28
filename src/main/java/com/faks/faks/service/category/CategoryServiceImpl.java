package com.faks.faks.service.category;

import com.faks.faks.model.command.base.ApiBasePageCommand;
import com.faks.faks.model.command.category.DeleteCategoryCommand;
import com.faks.faks.model.command.category.FilterCategoryCommand;
import com.faks.faks.model.command.category.SaveCategoryCommand;
import com.faks.faks.model.dto.CategoryDTO;
import com.faks.faks.model.dto.base.base.ApiBaseDTO;
import com.faks.faks.model.dto.base.base.ApiBasePageDTO;
import com.faks.faks.model.dto.base.base.PageDTO;
import com.faks.faks.model.entity.Category;
import com.faks.faks.model.specification.CategorySpecification;
import com.faks.faks.repository.CategoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Transactional
    @Override
    public ApiBaseDTO<CategoryDTO> saveCategory(SaveCategoryCommand command){
        return ApiBaseDTO.generateSuccessResponse(CategoryDTO.fromEntity(categoryRepository.save(command.toEntity())));
    }

    @Override
    public Boolean deleteCategory (DeleteCategoryCommand command){
        categoryRepository.deleteById(command.getId());
        return true;
    }

    @Transactional
    @Override
    public ApiBasePageDTO<CategoryDTO> filterCategory(ApiBasePageCommand<FilterCategoryCommand> command){
        Page<Category> category = categoryRepository.findAll(CategorySpecification.getCategorySpecification(command.getCommand()),
                command.getPagination().generatePagingAndSortingRequest());
        return ApiBasePageDTO.setApiPageResponse(CategoryDTO.fromList(category.getContent()),PageDTO.ofPage(category));
    }
}
