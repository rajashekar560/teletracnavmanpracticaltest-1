package com.teletrac.navman.service;

import com.teletrac.navman.entity.Device;
import com.teletrac.navman.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    public Long saveDevice(Device device) {
        Device savedDevice = deviceRepository.save(device);
        return savedDevice.getDeviceId();
    }
}
