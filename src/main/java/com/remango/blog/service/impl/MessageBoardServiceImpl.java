package com.remango.blog.service.impl;

import com.remango.blog.entity.MessageBoard;
import com.remango.blog.entity.PageList;
import com.remango.blog.service.MessageBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by li on 2019/3/27.
 */
@Service
public class MessageBoardServiceImpl  implements MessageBoardService {

    @Override
    public void saveMessage(MessageBoard messageBoard) {
        messageBoard.setCreateTime(new Date());
    }

    @Override
    public PageList<MessageBoard> queryMessageList(Integer offset, Integer limit){
        PageList<MessageBoard> messageBoardPageList = new PageList<>();
        return messageBoardPageList;
    }

}
