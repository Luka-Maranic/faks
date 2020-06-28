package com.faks.faks.model.specification;

import com.faks.faks.model.command.subscriber.FilterSubscriberCommand;
import com.faks.faks.model.entity.Subscribe;

import org.springframework.data.jpa.domain.Specification;

public class SubscriberSpecification {

    private SubscriberSpecification() {
    }

    public static Specification<Subscribe> getSubscriberSpecification(FilterSubscriberCommand command) {
        SharedSpecification<Subscribe> sharedSpecification = new SharedSpecification<>();
        return Specification.where((sharedSpecification.getEqual(command.getId(), "id"))
                .and(sharedSpecification.getLike(command.getFullName(), "fullName")));
    }
}
