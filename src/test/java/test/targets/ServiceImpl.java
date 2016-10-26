package test.targets;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService {
    public Response operationA(RequestA request) {
        return new Response("ACode", "AResponse");
    }

    public Response operationB(RequestB request) {
        return new Response("BCode", "BResponse");
    }

    public Response operationC(RequestC request) {
        return new Response("CCode", "CResponse");
    }

    public void operationP(int request) {

    }

    public void operationV() {

    }

}
