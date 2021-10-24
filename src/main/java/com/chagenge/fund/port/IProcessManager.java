package com.chagenge.fund.port;

import com.chagenge.fund.exception.ProcessException;
import com.chagenge.fund.model.ResponseProcessManager;

import java.util.List;

public interface IProcessManager {

    public ResponseProcessManager invoke(List<String> command) throws ProcessException;
    public ResponseProcessManager invoke(String request) throws ProcessException;

}
