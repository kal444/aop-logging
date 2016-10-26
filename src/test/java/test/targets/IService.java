package test.targets;

public interface IService {

    Response operationA(RequestA request);

    Response operationB(RequestB request);

    Response operationC(RequestC request);

    void operationP(int request);

    void operationV();

}
