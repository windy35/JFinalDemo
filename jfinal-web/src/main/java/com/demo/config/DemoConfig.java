package com.demo.config;

import com.demo.controller.HelloController;
import com.jfinal.config.*;

public class DemoConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
    }  @Override
    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
    }  @Override
    public void configPlugin(Plugins me) {

    }  @Override
    public void configInterceptor(Interceptors me) {

    }  @Override
    public void configHandler(Handlers me) {

    }
}
