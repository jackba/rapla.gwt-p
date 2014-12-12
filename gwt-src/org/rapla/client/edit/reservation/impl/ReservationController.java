package org.rapla.client.edit.reservation.impl;


import java.awt.GridLayout;

import javax.inject.Inject;

import org.rapla.client.plugin.view.ContentDrawer;
import org.rapla.client.plugin.view.ViewSelectionChangedEvent.ViewSelectionChangedHandler;
import org.rapla.client.plugin.view.infos.InfoController;
import org.rapla.client.plugin.view.resoursedates.ResourceDatesController;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TabBar;
import com.google.gwt.user.client.ui.Widget;

public class ReservationController implements ContentDrawer, ViewSelectionChangedHandler{

//	private ContentDrawer infoDrawer;
	
	@Inject
	InfoController infoController;
	@Inject
	ResourceDatesController resourceDatesController;
	
	private DockPanel layout;
	private FlowPanel tabBarPanel;
	private FlowPanel contentPanel;
	private FlowPanel buttonsPanel;
	
	private TabBar bar;
	
	private Label cancel;
	private Label save;
	private Label delete;
	
	@Override
	public Widget createContent() {
		// TODO Auto-generated method stub
		
	    bar = new TabBar();
	    bar.addTab("Veranstaltungsinfos");
	    bar.addTab("Termine und Resourcen");
	    //bar.setTabEnabled(0, false);
	    bar.selectTab(0);
	    
	    cancel = new Label("abbrechen");
	    cancel.setStyleName("cancelButton");
	    cancel.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				// PopUp wird geschlossen ohne speichern oder l�schen
				
			}
	    	
	    });
	    
	    save = new Label("speichern");
	    save.setStyleName("saveButton");
	    save.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				// Veranstaltung wird gespeichert
				
			}
	    	
	    });	    
	    
	    delete = new Label("l\u00F6schen");
	    delete.setStyleName("deleteButton");
	    delete.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				// Veranstaltung wird gel�scht
				
			}
	    	
	    });
	    
	    //layout = new Grid(0,3);
	   // Integer heightBar = (int) ((Window.getClientHeight() * 0.95) * 0.1);
	    //Integer heightContent = (int) ((Window.getClientHeight() * 0.95) * 0.8);
	   // layout.getCellFormatter().setHeight(0, 0, (heightBar).toString());
	    //layout.getCellFormatter().setHeight(0, 1, (heightBar).toString());
	    //layout.getCellFormatter().setHeight(0, 1, (heightContent).toString());
	    layout = new DockPanel();
	    tabBarPanel = new FlowPanel();
		contentPanel = new FlowPanel();
		buttonsPanel = new FlowPanel();

		
		bar.addSelectionHandler(new SelectionHandler<Integer>() {
	        public void onSelection(SelectionEvent<Integer> event) {
	          // Let the user know what they just did.
	          //Window.alert("You clicked tab " + event.getSelectedItem());
	        	 contentPanel.clear();
	        	 contentPanel.add(event.getSelectedItem() == 0 ? infoController.createContent() : resourceDatesController.createContent());
	        }});
		 
		tabBarPanel.add(bar);
	
		
		buttonsPanel.add(cancel);
		buttonsPanel.add(save);
		buttonsPanel.add(delete);
		
	    layout.add(buttonsPanel, DockPanel.SOUTH);
	    layout.add(tabBarPanel, DockPanel.NORTH);
	    layout.add(contentPanel, DockPanel.CENTER);
	    
		return layout;
	}

	@Override
	public void updateContent() {
		// TODO Auto-generated method stub

	}
	
	public ContentDrawer getSelectedContentDrawer() {		
		return this;
	}

	@Override
	public void viewChanged() {
		// TODO Auto-generated method stub
		
	}

	

}
