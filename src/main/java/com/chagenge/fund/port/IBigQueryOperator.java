package com.chagenge.fund.port;

import com.chagenge.fund.exception.BigQueryOperatorException;

public interface IBigQueryOperator {

    public boolean isValidTable() throws BigQueryOperatorException;

    public String auth();

    public String schema();

    public String createTable();

    public String loadData();
}
