package com.beyondcoding.springboot.injection;

import com.beyondcoding.springboot.creation.manual.ReusableBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ManualInjection2 {

    private final List<ReusableBean> numberBeans;

    public ManualInjection2(@Qualifier("numberBeans") List<ReusableBean> numberBeans) {
        this.numberBeans = numberBeans;
    }

    public String getMessage() {
        StringBuilder builder = new StringBuilder();
        builder.append("Bean messages:\n");
        String message = numberBeans.stream()
                .map(ReusableBean::getMessage)
                .collect(Collectors.joining("\n"));
        builder.append(message);
        return builder.toString();
    }
}
