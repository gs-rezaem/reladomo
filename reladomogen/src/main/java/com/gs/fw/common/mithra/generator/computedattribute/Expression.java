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

package com.gs.fw.common.mithra.generator.computedattribute;


import com.gs.fw.common.mithra.generator.MithraObjectTypeWrapper;
import com.gs.fw.common.mithra.generator.computedattribute.type.Type;
import com.gs.fw.common.mithra.generator.metamodel.ComputedAttributeType;

import java.util.List;
import java.util.Set;

public abstract class Expression
{
    public abstract Type getType();

    public abstract void addAttributeList(Set<String> result);

    public abstract void resolveAttributes(MithraObjectTypeWrapper wrapper, ComputedAttributeType computedAttributeType, List<String> errors);

    public abstract String getNullGetterCalcExpression();

    public abstract String getGetterCalcExpression();

    public abstract String getPrintableForm();
}
