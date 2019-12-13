package com.beyondcoding.springboot.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
// Only valid within a web application context
// One bean is created per user regardless of the number of requests
// The bean lasts until the session time is expired
// Information is not shared between sessions
// Information is available to requests, but not global sessions
public class SessionScopeBean {

}
