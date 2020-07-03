package com.wk.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SmarkLifeCycleComponent implements SmartLifecycle {

    boolean isRunning = true;

    @Override
    public void start() {
        System.out.println("------------------------------------sys out application SmarkLifeCycleComponent stopping---");
    }

    @Override
    public void stop() {
        System.out.println("------------------------------------sys out application SmarkLifeCycleComponent stopping---");
        this.isRunning = false;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable callback) {
        callback.run();
        isRunning=false;
    }

    @Override
    public int getPhase() {
        return 0;
    }
}
