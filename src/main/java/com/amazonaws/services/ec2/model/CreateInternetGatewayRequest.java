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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createInternetGateway(CreateInternetGatewayRequest) CreateInternetGateway operation}.
 * <p>
 * Creates a new Internet gateway in your AWS account. After creating
 * the Internet gateway, you then attach it to a VPC using
 * <code>AttachInternetGateway</code> . For more information about your
 * VPC and Internet gateway, go to Amazon Virtual Private Cloud User
 * Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createInternetGateway(CreateInternetGatewayRequest)
 */
public class CreateInternetGatewayRequest extends AmazonWebServiceRequest {

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("}");
        return sb.toString();
    }
    
}
    