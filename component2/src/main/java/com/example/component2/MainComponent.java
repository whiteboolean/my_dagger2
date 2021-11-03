package com.example.component2;

import dagger.Component;

@Component(modules = {MainModule.class})
public interface MainComponent {
    TestSubComponent getTestSubsComponent();
}
