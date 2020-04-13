package com.example.restservice.web.service;

import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {
    @Override
    public void show() {
        System.out.println("NewsServiceImpl.show");
    }
}
