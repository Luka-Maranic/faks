package com.faks.faks.controller;

import com.faks.faks.model.command.base.ApiBasePageCommand;
import com.faks.faks.model.command.subscriber.DeleteSubscriberCommand;
import com.faks.faks.model.command.subscriber.FilterSubscriberCommand;
import com.faks.faks.model.command.subscriber.SaveSubscriberCommand;
import com.faks.faks.model.dto.SubscribeDTO;
import com.faks.faks.model.dto.base.base.ApiBaseDTO;
import com.faks.faks.model.dto.base.base.ApiBasePageDTO;
import com.faks.faks.service.subscribe.SubscribeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subscribe")
public class SubscribeController {

    private final SubscribeService subscribeService;

    public SubscribeController(SubscribeService subscribeService) {
        this.subscribeService = subscribeService;
    }

    @ApiOperation("Save Subscriber")
    @RequestMapping("/save")
    public ApiBaseDTO<SubscribeDTO> saveSubscriber(@RequestBody SaveSubscriberCommand command){
        return subscribeService.saveSubscriber(command);
    }

    @ApiOperation("Filter Subscriber")
    @RequestMapping("/filter")
    public ApiBasePageDTO<SubscribeDTO> filterSubscriber(@RequestBody ApiBasePageCommand<FilterSubscriberCommand> command){
        return subscribeService.filterSubscriber(command);
    }

    @ApiOperation("Delete Subscriber")
    @RequestMapping("/delete")
    public Boolean deleteSubscriber (@RequestBody DeleteSubscriberCommand command){
        return subscribeService.deleteSubscriber(command);
    }
}
