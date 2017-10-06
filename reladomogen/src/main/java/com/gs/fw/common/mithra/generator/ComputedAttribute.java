/*
  Copyright 2016 Goldman Sachs.
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing,
  software distributed under the License is distributed on an
  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  KIND, either express or implied.  See the License for the
  specific language governing permissions and limitations
  under the License.
 */

package com.gs.fw.common.mithra.generator;

import com.gs.fw.common.mithra.generator.metamodel.AttributePureType;
import com.gs.fw.common.mithra.generator.metamodel.ComputedAttributeType;

public class ComputedAttribute extends Attribute
{

    private ComputedAttributeType computedAttributeType;

    public ComputedAttribute(MithraObjectTypeWrapper owner, ComputedAttributeType computedAttributeType)
    {
        super(new AttributePureType(computedAttributeType.getName(), computedAttributeType.getJavaType()), owner);
        this.computedAttributeType = computedAttributeType;
    }

    public String getNullGetterCalcExpression()
    {
        return this.computedAttributeType.getNullGetterCalcExpression();
    }

    public String getGetterCalcExpression()
    {
        return this.computedAttributeType.getGetterCalcExpression();
    }

    @Override
    public boolean isComputed()
    {
        return true;
    }
}
