package com.teletrac.navman.controller;

import com.teletrac.navman.dto.DeviceDto;
import com.teletrac.navman.entity.Device;
import com.teletrac.navman.service.DeviceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @PostMapping("/device")
    public ResponseEntity<String> saveDevice(@Valid @RequestBody DeviceDto deviceDto) {
        Device device = new Device();
        device.setRecordType(deviceDto.getRecordType());
        device.setEventDateTime(deviceDto.getEventDateTime());
        device.setFieldA(deviceDto.getFieldA());
        device.setFieldB(deviceDto.getFieldB());
        device.setFieldC(deviceDto.getFieldC());

        Long deviceId = deviceService.saveDevice(device);
        return new ResponseEntity<String>("DeviceId: "+deviceId, HttpStatus.CREATED);
    }

    @GetMapping("/nocontent")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public ResponseEntity<String> noContent() {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("HTTP Status will be CREATED (CODE 204)\n");
    }
}
