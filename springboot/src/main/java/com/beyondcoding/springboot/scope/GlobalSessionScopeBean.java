package com.beyondcoding.springboot.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("globalSession")
// Only valid within a web application context
// One bean is created on application start
// The bean lasts until the application is shut down
// Information is available to sessions and requests
public class GlobalSessionScopeBean {

}
