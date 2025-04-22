package org.example.main.service;

import org.springframework.stereotype.Service;

//@Service("serviceLogic") //specific bean creation name like a aliasing name
@Service("serv")
public class ServiceLogic {
    public ServiceLogic() {
        System.out.println("Serv Bean is Created..");
    }
}
