package com.testespringvscode.projetoitens.services.ServicesExeptions;

public class ResourceNotFoundExeption extends RuntimeException {

    public ResourceNotFoundExeption(Object id){
        super("Resource not found. Id " + id);
    }
    
}
