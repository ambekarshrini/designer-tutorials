package org.vaadin.example;

import com.vaadin.cdi.CDIView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

@CDIView(OrderView.VIEW_NAME)
public class OrderView extends OrderViewDesign implements View {

    public static final String VIEW_NAME = "order";

    @Override
    public void enter(ViewChangeEvent event) {
        // TODO Auto-generated method stub

    }

}
