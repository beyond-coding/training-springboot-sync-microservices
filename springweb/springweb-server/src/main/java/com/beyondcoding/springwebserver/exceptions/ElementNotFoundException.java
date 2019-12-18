package com.beyondcoding.springwebserver.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Element not found")
public class ElementNotFoundException extends Exception {
}
