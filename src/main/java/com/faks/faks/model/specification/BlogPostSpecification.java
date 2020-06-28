//package com.faks.faks.model.specification;
//
//import org.springframework.data.jpa.domain.Specification;
//
//public class BlogPostSpecification {
//
//    private BlogPostSpecification() {
//    }
//
//    public static Specification<BlogPost> getBlogPostSpecification(FilterBlogPostCommand command) {
//        SharedSpecification<BlogPost> sharedSpecification = new SharedSpecification<>();
//        return Specification.where((sharedSpecification.getEqual(command.getId(), "id"))
//                .and(sharedSpecification.getLike(command.getTitle(), "title")));
//    }
//}
