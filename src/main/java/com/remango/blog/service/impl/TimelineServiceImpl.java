package com.remango.blog.service.impl;

import com.remango.blog.entity.PageList;
import com.remango.blog.entity.Timeline;
import com.remango.blog.service.TimelineService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by li on 2019/3/16.
 */
@Service
public class TimelineServiceImpl implements TimelineService {

    @Override
    public PageList<Timeline> queryTimelineList(Integer offset, Integer limit) {
        PageList<Timeline> timelinePageList = new PageList<>();

        return timelinePageList;
    }

    @Override
    public void saveTimeline(Timeline timeline) {

    }

    @Override
    public List<Timeline> queryTimelineListByName(String name) {
        return null;
    }
}
