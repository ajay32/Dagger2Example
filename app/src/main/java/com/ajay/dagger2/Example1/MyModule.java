package com.ajay.dagger2.Example1;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class MyModule {

    @Provides
    @Singleton
    static DateInterface gettingDate() {  // return the interface through which all the work is done
        return  new DateImplementation();  // by creating object of class thhat has implemented that interface
    }

}
