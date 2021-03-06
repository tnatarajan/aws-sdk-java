/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simpleworkflow.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Activity Task Scheduled Event Attributes JSON Unmarshaller
 */
public class ActivityTaskScheduledEventAttributesJsonUnmarshaller implements Unmarshaller<ActivityTaskScheduledEventAttributes, JsonUnmarshallerContext> {

    

    public ActivityTaskScheduledEventAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActivityTaskScheduledEventAttributes activityTaskScheduledEventAttributes = new ActivityTaskScheduledEventAttributes();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("activityType", targetDepth)) {
                    context.nextToken();
                    activityTaskScheduledEventAttributes.setActivityType(ActivityTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityId", targetDepth)) {
                    context.nextToken();
                    activityTaskScheduledEventAttributes.setActivityId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("input", targetDepth)) {
                    context.nextToken();
                    activityTaskScheduledEventAttributes.setInput(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("control", targetDepth)) {
                    context.nextToken();
                    activityTaskScheduledEventAttributes.setControl(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("scheduleToStartTimeout", targetDepth)) {
                    context.nextToken();
                    activityTaskScheduledEventAttributes.setScheduleToStartTimeout(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("scheduleToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    activityTaskScheduledEventAttributes.setScheduleToCloseTimeout(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    activityTaskScheduledEventAttributes.setStartToCloseTimeout(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskList", targetDepth)) {
                    context.nextToken();
                    activityTaskScheduledEventAttributes.setTaskList(TaskListJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("decisionTaskCompletedEventId", targetDepth)) {
                    context.nextToken();
                    activityTaskScheduledEventAttributes.setDecisionTaskCompletedEventId(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("heartbeatTimeout", targetDepth)) {
                    context.nextToken();
                    activityTaskScheduledEventAttributes.setHeartbeatTimeout(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return activityTaskScheduledEventAttributes;
    }

    private static ActivityTaskScheduledEventAttributesJsonUnmarshaller instance;
    public static ActivityTaskScheduledEventAttributesJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ActivityTaskScheduledEventAttributesJsonUnmarshaller();
        return instance;
    }
}
    