package com.example.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.test.entity.Demo;
import com.example.test.mapper.DemoMapper;
import com.example.test.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements DemoService {


}
