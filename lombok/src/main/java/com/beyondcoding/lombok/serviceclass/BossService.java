package com.beyondcoding.lombok.serviceclass;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BossService {

    private final Service1 service1;
    private final Service1 service2;
    private final Service1 service3;
    private String url;

}
