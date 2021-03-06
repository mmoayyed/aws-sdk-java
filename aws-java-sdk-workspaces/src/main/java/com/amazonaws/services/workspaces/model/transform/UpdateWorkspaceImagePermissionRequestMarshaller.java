/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.workspaces.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateWorkspaceImagePermissionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateWorkspaceImagePermissionRequestMarshaller {

    private static final MarshallingInfo<String> IMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageId").build();
    private static final MarshallingInfo<Boolean> ALLOWCOPYIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowCopyImage").build();
    private static final MarshallingInfo<String> SHAREDACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SharedAccountId").build();

    private static final UpdateWorkspaceImagePermissionRequestMarshaller instance = new UpdateWorkspaceImagePermissionRequestMarshaller();

    public static UpdateWorkspaceImagePermissionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateWorkspaceImagePermissionRequest updateWorkspaceImagePermissionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateWorkspaceImagePermissionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateWorkspaceImagePermissionRequest.getImageId(), IMAGEID_BINDING);
            protocolMarshaller.marshall(updateWorkspaceImagePermissionRequest.getAllowCopyImage(), ALLOWCOPYIMAGE_BINDING);
            protocolMarshaller.marshall(updateWorkspaceImagePermissionRequest.getSharedAccountId(), SHAREDACCOUNTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
