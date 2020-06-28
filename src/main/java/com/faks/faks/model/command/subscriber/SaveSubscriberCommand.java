package com.faks.faks.model.command.subscriber;

import com.faks.faks.model.command.category.SaveCategoryCommand;
import com.faks.faks.model.entity.Subscribe;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class SaveSubscriberCommand {
    private Long id;
    private String fullName;
    private String email;
    private Boolean active;
    private List<SaveCategoryCommand> categories;

    public Subscribe toEntity() {
        Subscribe subscribe = new Subscribe();
        subscribe.setId(this.id);
        subscribe.setFullName(this.fullName);
        subscribe.setEmail(this.email);
        subscribe.setActive(this.active);
        if (this.categories != null) {
            subscribe.setCategories(this.categories.stream().map(cl -> {
                if (cl != null) {
                    return cl.toEntity();
                } else return null;
            }).collect(Collectors.toList()));
        }
        return subscribe;
    }
}
