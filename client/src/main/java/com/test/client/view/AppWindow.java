package com.test.client.view;

import com.test.client.service.setup.SetupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class AppWindow {

    @Autowired
    private SetupService setupService;

    public void open() {

        JFrame f = new JFrame("City transport.");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel cars = new JLabel("Cars amount");
        cars.setBounds(30, 50, 150, 30);
        JLabel buses = new JLabel("Buses amount");
        buses.setBounds(30, 70, 150, 30);
        JLabel tracks = new JLabel("Tracks amount");
        tracks.setBounds(30, 90, 150, 30);

        JButton b = new JButton("Start traffic");
        b.setBounds(230, 250, 150, 40);

        b.addActionListener(e -> setupService.setupConnection());

        f.add(b);
        f.add(cars);
        f.add(buses);
        f.add(tracks);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
    }
}
