package com.company.partials.layout;

import com.company.partials.navigation.Navibuttons;
import com.company.partials.header.header;

import javax.swing.*;
import java.awt.*;

public class screen
{
    //static JDialog frame;
    static JPanel mainPanel;
    static JFrame frame = new JFrame();


    public screen(JPanel content, String screenTitle, boolean visible)
    {
        mainPanel = new JPanel();
        //frame = new JFrame();
        frame.setTitle(screenTitle);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.add(new header().headerPanel, Component.TOP_ALIGNMENT);
        //mainPanel.add(content, Component.CENTER_ALIGNMENT);
        setContent(content, screenTitle);
        mainPanel.add(new Navibuttons().naviPanel, Component.BOTTOM_ALIGNMENT);
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        //frame.setModal(true);
        frame.setVisible(visible);
    }

    public static void setContent(JPanel content, String title)
    {
        frame.setTitle(title);
        System.out.println(content);
        mainPanel.add(content, Component.CENTER_ALIGNMENT);
    }
}
