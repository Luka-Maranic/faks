package com.faks.faks.service.subscribe;

import com.faks.faks.model.command.base.ApiBasePageCommand;
import com.faks.faks.model.command.subscriber.DeleteSubscriberCommand;
import com.faks.faks.model.command.subscriber.FilterSubscriberCommand;
import com.faks.faks.model.command.subscriber.SaveSubscriberCommand;
import com.faks.faks.model.dto.SubscribeDTO;
import com.faks.faks.model.dto.base.base.ApiBaseDTO;
import com.faks.faks.model.dto.base.base.ApiBasePageDTO;

public interface SubscribeService {

    ApiBaseDTO<SubscribeDTO> saveSubscriber(SaveSubscriberCommand command);

    ApiBasePageDTO<SubscribeDTO> filterSubscriber(ApiBasePageCommand<FilterSubscriberCommand> command);

    Boolean deleteSubscriber (DeleteSubscriberCommand command);
}
