package cn.ctlyt.exam.service;

import cn.ctlyt.exam.mapper.OptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassNameOptionService
 * @Description
 * @Author 村头老杨头
 * @Date 2020/3/17 0017 4:17
 * @Version V1.0
 **/
@Service
public class OptionService {
    @Autowired
    OptionMapper optionMapper;
}
