package com.test.client;

import com.test.client.service.setup.SetupService;
import com.test.client.view.AppWindow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    private static final String LOCAL_HOST = "localhost";

    @Autowired
    private SetupService setupService;
    @Autowired
    private AppWindow window;

    public static void main(String... args) {
        SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.setHeadless(false);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (args.length > 0) {
            this.setupService.setHost(args[0]);
        } else {
            this.setupService.setHost(LOCAL_HOST);
        }
        this.window.open();
    }
}
