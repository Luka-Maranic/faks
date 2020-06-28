package com.faks.faks.service.subscribe;

import com.faks.faks.model.command.base.ApiBasePageCommand;
import com.faks.faks.model.command.subscriber.DeleteSubscriberCommand;
import com.faks.faks.model.command.subscriber.FilterSubscriberCommand;
import com.faks.faks.model.command.subscriber.SaveSubscriberCommand;
import com.faks.faks.model.dto.SubscribeDTO;
import com.faks.faks.model.dto.base.base.ApiBaseDTO;
import com.faks.faks.model.dto.base.base.ApiBasePageDTO;
import com.faks.faks.model.dto.base.base.PageDTO;
import com.faks.faks.model.entity.Subscribe;
import com.faks.faks.model.specification.SubscriberSpecification;
import com.faks.faks.repository.SubscribeRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class SubscribeServiceImpl implements SubscribeService {

    private final SubscribeRepository subscribeRepository;

    public SubscribeServiceImpl(SubscribeRepository subscribeRepository) {
        this.subscribeRepository = subscribeRepository;
    }

    @Transactional
    @Override
    public ApiBaseDTO<SubscribeDTO> saveSubscriber(SaveSubscriberCommand command) {
        return ApiBaseDTO.generateSuccessResponse(SubscribeDTO.fromEntity(subscribeRepository.save(command.toEntity())));
    }

    @Transactional
    @Override
    public ApiBasePageDTO<SubscribeDTO> filterSubscriber(ApiBasePageCommand<FilterSubscriberCommand> command) {
        Page<Subscribe> subscribe = subscribeRepository.findAll(SubscriberSpecification.getSubscriberSpecification(command.getCommand()),
                command.getPagination().generatePagingAndSortingRequest());
        return ApiBasePageDTO.setApiPageResponse(SubscribeDTO.fromList(subscribe.getContent()), PageDTO.ofPage(subscribe));
    }

    @Override
    public Boolean deleteSubscriber(DeleteSubscriberCommand command) {
        subscribeRepository.deleteById(command.getId());
        return true;
    }
}
