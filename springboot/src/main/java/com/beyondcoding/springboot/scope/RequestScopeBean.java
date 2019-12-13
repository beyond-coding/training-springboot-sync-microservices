package com.beyondcoding.springboot.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
// Only valid within a web application context
// One bean is created per user per request
// Information is not available to either sessions or other requests
public class RequestScopeBean {

}
