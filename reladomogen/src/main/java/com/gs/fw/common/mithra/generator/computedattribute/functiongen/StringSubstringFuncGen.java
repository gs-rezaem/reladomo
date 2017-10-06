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

package com.gs.fw.common.mithra.generator.computedattribute.functiongen;


import com.gs.fw.common.mithra.generator.MithraObjectTypeWrapper;
import com.gs.fw.common.mithra.generator.computedattribute.Expression;
import com.gs.fw.common.mithra.generator.computedattribute.FunctionExpression;
import com.gs.fw.common.mithra.generator.computedattribute.type.StringType;
import com.gs.fw.common.mithra.generator.computedattribute.type.Type;
import com.gs.fw.common.mithra.generator.metamodel.ComputedAttributeType;

import java.util.List;

public class StringSubstringFuncGen implements FunctionGenerator
{
    @Override
    public Type getReturnType()
    {
        return new StringType();
    }

    @Override
    public void validateType(FunctionExpression functionExpression, MithraObjectTypeWrapper wrapper, ComputedAttributeType computedAttributeType, List<String> errors)
    {
        Type type = functionExpression.getSourceExpression().getType();
        if (type == null)
        {
            errors.add("Could not determine type for "+functionExpression.getSourceExpression().getPrintableForm()+location(wrapper, computedAttributeType));
        }
        else if (!type.isString())
        {
            errors.add("you can only call substring on a string in "+functionExpression.getSourceExpression().getPrintableForm()+ location(wrapper, computedAttributeType));
        }
    }

    private void checkIsInteger(MithraObjectTypeWrapper wrapper, ComputedAttributeType computedAttributeType, List<String> errors, Expression expression)
    {
        Type type = expression.getType();
        if (!type.isInteger())
        {
            errors.add("Substring requires integer parameters" + location(wrapper, computedAttributeType));
        }
    }

    private String location(MithraObjectTypeWrapper wrapper, ComputedAttributeType computedAttributeType)
    {
        return " in attribute " + computedAttributeType.getName() + " in object " + wrapper.getClassName();
    }

    @Override
    public void validateParameters(FunctionExpression functionExpression, MithraObjectTypeWrapper wrapper, ComputedAttributeType computedAttributeType, List<String> errors)
    {
        List<Expression> parameters = functionExpression.getParameters();
        if (parameters.size() != 2)
        {
            errors.add("Substring requires two integer parameters" + location(wrapper, computedAttributeType));
        }
        else
        {
            checkIsInteger(wrapper, computedAttributeType, errors, parameters.get(0));
            checkIsInteger(wrapper, computedAttributeType, errors, parameters.get(1));
        }
    }

    @Override
    public String getNullGetterCalcExpression(FunctionExpression functionExpression)
    {
        return functionExpression.getSourceExpression().getNullGetterCalcExpression();
    }

    @Override
    public String getGetterCalcExpression(FunctionExpression functionExpression)
    {
        return functionExpression.getSourceExpression().getNullGetterCalcExpression() +" ? null : com.gs.fw.common.mithra.attribute.calculator.SubstringCalculator.safeSubstring("+
                functionExpression.getSourceExpression().getGetterCalcExpression()+", "+functionExpression.getParameters().get(0).getGetterCalcExpression()+", "+
                functionExpression.getParameters().get(1).getGetterCalcExpression()+")";
    }
}
