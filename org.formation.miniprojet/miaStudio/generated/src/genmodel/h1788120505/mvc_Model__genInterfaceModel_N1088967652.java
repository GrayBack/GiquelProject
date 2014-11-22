package genmodel.h1788120505;

import com.mia.formation.mvc.*;
import com.mia.metamodel.*;
import com.mia.openapi.*;
import com.mia.openapi.refactoring.model.*;
import com.mia.openapi.reflect.*;
import com.mia.resource.*;
import java.io.*;
import java.util.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.util.*;

@SuppressWarnings({"unused","unchecked","rawtypes","nls","serial","static-method",})
public class mvc_Model__genInterfaceModel_N1088967652 extends com.mia.studio.generation.compilation.AbstractCompiledAction implements com.mia.studio.kernel.compiler.CompiledAction {

	public mvc_Model__genInterfaceModel_N1088967652() {
		//Do nothing
	}

	//For internal use only
	mvc_Model__genInterfaceModel_N1088967652(int anyInt, java.util.List anyList) {
		java.util.List<java.lang.Integer> otherList = anyList;
		throw new java.lang.UnsupportedOperationException();
	}

	private static <T> T __check_arg__(java.lang.Class<T> expectedClass, java.lang.Object argument) {
		T result = null;
		if (java.lang.Integer.class.equals(expectedClass) && argument instanceof java.lang.Double) {
			result = (T) new java.lang.Integer(((java.lang.Double) argument).intValue());
		} else if (java.lang.Float.class.equals(expectedClass) && argument instanceof java.lang.Double) {
			result = (T) new java.lang.Float(((java.lang.Double) argument).floatValue());
		} else {
			try {			
				result = expectedClass.cast(argument);
			} catch(Throwable ex) {
				throw new IllegalArgumentException(
						java.lang.String.format(
								"Bad parameter type in call to %s. Found '%s' when expected '%s'.",
								"genInterfaceModel", argument.getClass().getName(),
								expectedClass.getName()));
			}
		}
		return result;
	}


	public java.lang.Object evaluate(java.lang.Object[] _action_parameters) {
		return runAction(_action_parameters);
	}

	public String runAction(java.lang.Object[] _action_parameters) {
		if (_action_parameters.length != 3)
			throw new IllegalArgumentException("Wrong number of parameters in call to ''genInterfaceModel''");

		final com.mia.formation.mvc.Model current = __check_arg__(com.mia.formation.mvc.Model.class, _action_parameters[0]);
		final com.mia.openapi.gen.Context context = __check_arg__(com.mia.openapi.gen.Context.class, _action_parameters[1]);
		final com.mia.openapi.gen.GenerationServicesManager manager = __check_arg__(com.mia.openapi.gen.GenerationServicesManager.class, _action_parameters[2]);

		return __invoke_user_code__(current, context, manager);
	}

	public String __invoke_user_code__(final com.mia.formation.mvc.Model current, final com.mia.openapi.gen.Context context, final com.mia.openapi.gen.GenerationServicesManager manager)
{

java.lang.StringBuilder _template_buffer = new java.lang.StringBuilder();
_template_buffer.append("package com.mia.banque.model;");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("import java.util.List;");
_template_buffer.append('\n');
_template_buffer.append('\n');
_template_buffer.append("public interface I");
_template_buffer.append(manager.action(current, "name"));_template_buffer.append(" {");
_template_buffer.append('\n');
_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "macroGetter"));_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "macroSetter"));_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "macroListGetInt"));_template_buffer.append('\n');

_template_buffer.append(manager.action(current, "macroListSetInt"));_template_buffer.append('\n');
_template_buffer.append("}");
return _template_buffer.toString();

}
}
