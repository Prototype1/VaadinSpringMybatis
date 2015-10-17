package com.simplevaadin.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.simplevaadin.servlet.mapper.UserMapper;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
public class MyUi extends UI {

	@Autowired
	UserMapper userService;

	@Override
	protected void init(VaadinRequest request) {

		VerticalLayout layout = new VerticalLayout();
		// just add a new Label with ButtonClicked on Click
		layout.addComponent(new Button("Click", e -> layout.addComponent(new Label(userService.selectUser() + ""))));

		setContent(layout);

	}

}
