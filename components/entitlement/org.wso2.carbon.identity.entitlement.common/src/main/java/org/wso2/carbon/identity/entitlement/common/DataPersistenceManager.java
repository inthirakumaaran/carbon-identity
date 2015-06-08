/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.identity.entitlement.common;

import org.wso2.carbon.identity.entitlement.common.dto.PolicyEditorDataHolder;

import java.util.Map;

/**
 *
 */
public interface DataPersistenceManager {

    /**
     * Build and Load the policy editor data from persistence storage
     *
     * @return PolicyEditorDataHolder
     * @throws PolicyEditorException throws
     */
    public Map<String, PolicyEditorDataHolder> buildDataHolder() throws PolicyEditorException;

    /**
     * Persist policy editor data in to  persistence storage
     *
     * @param policyEditorType policy editor type
     * @param xmlConfig        String
     * @throws PolicyEditorException throws
     */
    public void persistConfig(String policyEditorType, String xmlConfig) throws PolicyEditorException;

    /**
     * Get policy editor data from persistence storage
     *
     * @return String
     */
    public Map<String, String> getConfig();
}
