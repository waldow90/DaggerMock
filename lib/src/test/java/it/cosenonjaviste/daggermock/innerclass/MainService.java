package it.cosenonjaviste.daggermock.innerclass;

import javax.inject.Inject;

public class MainService {
    private MyService myService;

    @Inject public MainService(MyService myService) {
        this.myService = myService;
    }

    public MyService getMyService() {
        return myService;
    }
}