package com.ajay.dagger2.Example1;


import javax.inject.Singleton;

import dagger.Component;
// component is an interface connected to App
@Singleton
@Component(modules = MyModule.class)  // this class will return concete object // connected to Module
interface MyComponent {

    void inject(MainActivity mainActivity);  //we gonna inject this class
}
