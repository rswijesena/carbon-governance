/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.governance.comparator;

import org.wso2.carbon.governance.comparator.text.TextComparator;
import org.wso2.carbon.governance.comparator.wsdl.WSDLComparator;

import java.util.ArrayList;
import java.util.List;

public class GovernanceDiffGeneratorFactory implements DiffGeneratorFactory {

    /*
    This will load DiffGenerator configuration from governance.xml file.
     */
    @Override
    public DiffGenerator getDiffGenerator() {
        List<Comparator<?>> comparators = new ArrayList<>();
        comparators.add(new TextComparator());
        comparators.add(new WSDLComparator());
        return new DiffGenerator(comparators);
    }
}
