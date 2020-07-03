package com.wk.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class LifeCycleComponent implements Lifecycle {
    boolean isRunning = false;

    public LifeCycleComponent() {
        this.isRunning = true;
    }

    @Override
    public void start() {
        log.info("------------------------------------application  LifeCycleComponent running------------");
        System.out.println("------------------------------------sys out application LifeCycleComponent stopping-----");

    }

    @Override
    public void stop() {
        log.info("------------------------------------application LifeCycleComponent stopping--------------------");
        System.out.println("------------------------------------sys out application LifeCycleComponent stopping---");
        this.isRunning = false;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}
