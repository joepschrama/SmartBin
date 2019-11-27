package com.company.partials.layout;

import com.company.navigation.Navibuttons;
import com.company.smartbinHeader.header;

import javax.swing.*;
import java.awt.*;

public class screen
{
    public screen(JPanel content, String screenTitle)
    {
        JFrame frame = new JFrame(screenTitle);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.add(new header().headerPanel, Component.TOP_ALIGNMENT);
        mainPanel.add(content, Component.CENTER_ALIGNMENT);
        mainPanel.add(new Navibuttons().naviPanel, Component.BOTTOM_ALIGNMENT);
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
