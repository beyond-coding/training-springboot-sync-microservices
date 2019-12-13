package com.beyondcoding.springboot.injection;

import com.beyondcoding.springboot.creation.automatic.basic.BusinessLogicBean;
import com.beyondcoding.springboot.creation.automatic.basic.DataManagementBean;
import com.beyondcoding.springboot.creation.automatic.basic.GeneralBean;
import com.beyondcoding.springboot.creation.automatic.basic.ViewBean;
import org.springframework.stereotype.Component;

@Component
public class BasicAutomaticInjection {

    private final GeneralBean generalBean;
    private final DataManagementBean dataManagementBean;
    private final BusinessLogicBean businessLogicBean;
    private final ViewBean viewBean;

    public BasicAutomaticInjection(GeneralBean generalBean, DataManagementBean dataManagementBean, BusinessLogicBean businessLogicBean, ViewBean viewBean) {
        this.generalBean = generalBean;
        this.dataManagementBean = dataManagementBean;
        this.businessLogicBean = businessLogicBean;
        this.viewBean = viewBean;
    }

    public String getMessage() {
        StringBuilder builder = new StringBuilder();
        builder.append("Bean messages:\n");
        builder.append(generalBean.getMessage() + "\n");
        builder.append(dataManagementBean.getMessage() + "\n");
        builder.append(businessLogicBean.getMessage() + "\n");
        builder.append(viewBean.getMessage());
        return builder.toString();
    }

}
