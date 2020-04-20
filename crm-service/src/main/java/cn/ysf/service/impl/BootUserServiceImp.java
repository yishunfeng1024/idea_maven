package cn.ysf.service.impl;

import cn.ysf.bean.BootUser;
import cn.ysf.mapper.BootUserMapper;
import cn.ysf.service.BootUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author YiShunFeng
 * @version 1.0
 * @description cn.ysf.service.impl
 * @data 2020/4/19
 */
@Service
@Transactional
public class BootUserServiceImp implements BootUserService {
    @Autowired
    private BootUserMapper bootUserMapper;
    @Override
    public void save(BootUser bootUser) {
        bootUserMapper.save(bootUser);
    }
}
