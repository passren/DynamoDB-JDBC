package org.passren.dynamodb.engine;

import java.util.LinkedList;
import java.util.Map;

import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

public interface Executor {
    
    public void execute();

    public LinkedList<Map<String, AttributeValue>> getResponseData();

    public void close();
}
