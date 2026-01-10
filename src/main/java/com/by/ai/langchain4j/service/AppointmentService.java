package com.by.ai.langchain4j.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.by.ai.langchain4j.entity.Appointment;

/**
 * @author zhouboyang
 * @version 1.0
 * @ClassName AppointmentService
 * @description: TODO
 * @date 2026/1/10 16:42
 */
public interface AppointmentService extends IService<Appointment> {

    Appointment getOne(Appointment appointment);
}
