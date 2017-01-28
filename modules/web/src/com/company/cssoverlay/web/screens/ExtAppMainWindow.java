package com.company.cssoverlay.web.screens;

import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Label;
import org.vaadin.overlay.CustomClickableOverlay;
import org.vaadin.overlay.CustomOverlay;

import javax.inject.Inject;
import java.util.Map;

public class ExtAppMainWindow extends AppMainWindow {

    @Inject
    private Button demoBtn;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        Label vLabel = new Label("10");
        vLabel.setStyleName("overlay-badge");

        AbstractComponent vButton = demoBtn.unwrap(AbstractComponent.class);
        CustomOverlay overlay = new CustomClickableOverlay(vLabel, vButton);
        overlay.setComponentAnchor(com.vaadin.ui.Alignment.TOP_LEFT);
        overlay.setOverlayAnchor(com.vaadin.ui.Alignment.MIDDLE_CENTER);
        overlay.setXOffset(0);
        overlay.setYOffset(0);

        AbstractOrderedLayout vLayout = workArea.getInitialLayout().unwrap(AbstractOrderedLayout.class);
        vLayout.addComponent(overlay);
    }
}