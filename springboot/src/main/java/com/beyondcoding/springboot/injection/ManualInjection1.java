package com.beyondcoding.springboot.injection;

import com.beyondcoding.springboot.creation.manual.ReusableBean;
import org.springframework.stereotype.Component;

@Component
public class ManualInjection1 {

    private final ReusableBean blueBean;
    private final ReusableBean greenBean;


    public ManualInjection1(ReusableBean blueBean, ReusableBean greenBean) {
        this.blueBean = blueBean;
        this.greenBean = greenBean;
    }

    public String getMessage() {
        StringBuilder builder = new StringBuilder();
        builder.append("Bean messages:\n");
        builder.append(blueBean.getMessage() + "\n");
        builder.append(greenBean.getMessage());
        return builder.toString();
    }

}
