//package com.faks.faks.model.specification;
//
//
//import hr.hivetech.model.command.category.FilterCategoryCommand;
//import hr.hivetech.model.entity.Category;
//import org.springframework.data.jpa.domain.Specification;
//
//public class CategorySpecification {
//
//    private CategorySpecification() {
//    }
//
//    public static Specification<Category> getCategorySpecification(FilterCategoryCommand command) {
//        SharedSpecification<Category> sharedSpecification = new SharedSpecification<>();
//        return Specification.where((sharedSpecification.getEqual(command.getCategoryId(), "id"))
//                .and(sharedSpecification.getLike(command.getName(), "name")));
//    }
//}
