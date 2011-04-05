/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create Dhcp Options Request Marshaller
 */
public class CreateDhcpOptionsRequestMarshaller implements Marshaller<Request<CreateDhcpOptionsRequest>, CreateDhcpOptionsRequest> {

    public Request<CreateDhcpOptionsRequest> marshall(CreateDhcpOptionsRequest createDhcpOptionsRequest) {
        Request<CreateDhcpOptionsRequest> request = new DefaultRequest<CreateDhcpOptionsRequest>(createDhcpOptionsRequest, "AmazonEC2");
        request.addParameter("Action", "CreateDhcpOptions");
        request.addParameter("Version", "2011-02-28");

        if (createDhcpOptionsRequest != null) {
            java.util.List<DhcpConfiguration> dhcpConfigurationsList = createDhcpOptionsRequest.getDhcpConfigurations();
            int dhcpConfigurationsListIndex = 1;
            for (DhcpConfiguration dhcpConfigurationsListValue : dhcpConfigurationsList) {
                if (dhcpConfigurationsListValue != null) {
                    if (dhcpConfigurationsListValue.getKey() != null) {
                        request.addParameter("DhcpConfiguration." + dhcpConfigurationsListIndex + ".Key", StringUtils.fromString(dhcpConfigurationsListValue.getKey()));
                    }
                }
                if (dhcpConfigurationsListValue != null) {
                    java.util.List<String> valuesList = dhcpConfigurationsListValue.getValues();
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("DhcpConfiguration." + dhcpConfigurationsListIndex + ".Value." + valuesListIndex, StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }

                dhcpConfigurationsListIndex++;
            }
        }


        return request;
    }
}
