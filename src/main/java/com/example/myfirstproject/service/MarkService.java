package com.example.myfirstproject.service;

import com.example.myfirstproject.entity.Mark;

public interface MarkService {
    public Integer getMark(Integer markId);
    public Mark save(Mark mark);
    public Mark update(Mark mark);
    public Mark delete(Mark mark);
}
