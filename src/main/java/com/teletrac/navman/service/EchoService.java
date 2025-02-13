package com.teletrac.navman.service;

import com.teletrac.navman.entity.Echo;
import com.teletrac.navman.repository.EchoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EchoService {
    @Autowired
    private EchoRepository echoRepository;

    public Echo saveEcho(Echo echo) {
        return echoRepository.save(echo);
    }


}
