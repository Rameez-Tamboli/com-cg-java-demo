package com.cg.demo.conc;

 

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.cg.demo.col.Employee;

 

public class CallableDemo2 implements Callable<Employee> {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CallableDemo2 obj = new CallableDemo2();
        
        ExecutorService service = Executors.newSingleThreadExecutor();
        
        Future<Employee> future = service.submit(obj); 
        Employee emp = future.get();
        System.out.println(emp);
        service.shutdown();
    }
    @Override
    public Employee call() throws Exception {
        
        Employee em = new Employee(101 , "rameez" , 80.5);
        
        return em;
    }

 

}
 