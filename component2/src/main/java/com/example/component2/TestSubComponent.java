package com.example.component2;

import dagger.Subcomponent;

@Subcomponent(modules = {TestSubModule.class})
public interface TestSubComponent {
    void injectMyActivity(MainActivity activity);
}
