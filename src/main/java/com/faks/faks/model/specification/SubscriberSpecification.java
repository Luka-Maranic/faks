//package com.faks.faks.model.specification;
//
//import hr.hivetech.model.command.subscriber.FilterSubscriberCommand;
//import hr.hivetech.model.entity.Subscriber;
//import org.springframework.data.jpa.domain.Specification;
//
//public class SubscriberSpecification {
//
//    private SubscriberSpecification() {
//    }
//
//    public static Specification<Subscriber> getSubscriberSpecification(FilterSubscriberCommand command) {
//        SharedSpecification<Subscriber> sharedSpecification = new SharedSpecification<>();
//        return Specification.where((sharedSpecification.getEqual(command.getId(), "id"))
//                .and(sharedSpecification.getLike(command.getFullName(), "fullName")));
//    }
//}
