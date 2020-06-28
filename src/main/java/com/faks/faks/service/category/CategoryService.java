package com.faks.faks.service.category;

import com.faks.faks.model.command.base.ApiBasePageCommand;
import com.faks.faks.model.command.category.DeleteCategoryCommand;
import com.faks.faks.model.command.category.FilterCategoryCommand;
import com.faks.faks.model.command.category.SaveCategoryCommand;
import com.faks.faks.model.dto.CategoryDTO;
import com.faks.faks.model.dto.base.base.ApiBaseDTO;
import com.faks.faks.model.dto.base.base.ApiBasePageDTO;

public interface CategoryService {

    ApiBaseDTO<CategoryDTO> saveCategory(SaveCategoryCommand command);

    Boolean deleteCategory(DeleteCategoryCommand command);

    ApiBasePageDTO<CategoryDTO> filterCategory(ApiBasePageCommand<FilterCategoryCommand> command);
}
