package com.simplevaadin.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.alump.masonry.MasonryDnDWrapper;

import com.simplevaadin.servlet.mapper.UserMapper;
import com.vaadin.annotations.Theme;
import com.vaadin.event.dd.DragAndDropEvent;
import com.vaadin.event.dd.DropHandler;
import com.vaadin.event.dd.acceptcriteria.AcceptCriterion;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import fi.jasoft.dragdroplayouts.drophandlers.DefaultGridLayoutDropHandler;

@SpringUI
@Theme("valo")
public class MyUi extends UI {

	@Autowired
	UserMapper userService;
	public static final String NAME = "dd-grid-layout";

	private static final int ROWS = 4;
	private static final int COLUMNS = 4;

	@Override
	protected void init(VaadinRequest request) {
		MasonryDnDWrapper layout = new MasonryDnDWrapper();

		layout.setReorderable(true);
		
		layout.setDropHandler(new DefaultGridLayoutDropHandler());
		
		layout.addComponentToLayout(new Button("xxx"));

		layout.addComponentToLayout(new Button("asd"));

		layout.addComponentToLayout(new Button("sd"));

		layout.addComponentToLayout(new Button("hfg"));

		layout.addComponentToLayout(new Button("cxv"));

		setContent(layout);

	}

}
