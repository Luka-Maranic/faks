package com.faks.faks.model.dto;

import com.faks.faks.model.entity.Subscribe;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class SubscribeDTO {
    private Long id;
    private String fullName;
    private String email;
    private Boolean active;

    public static SubscribeDTO fromEntity(Subscribe subscribe) {
        SubscribeDTO subscribeDTO = new SubscribeDTO();
        subscribeDTO.setId(subscribe.getId());
        subscribeDTO.setFullName(subscribe.getFullName());
        subscribeDTO.setEmail(subscribe.getEmail());
        subscribeDTO.setActive(subscribe.getActive());

        return subscribeDTO;
    }

    public static List<SubscribeDTO> fromList (List<Subscribe> subscribes){
        return subscribes.stream().map(SubscribeDTO::fromEntity).collect(Collectors.toList());
    }
}
