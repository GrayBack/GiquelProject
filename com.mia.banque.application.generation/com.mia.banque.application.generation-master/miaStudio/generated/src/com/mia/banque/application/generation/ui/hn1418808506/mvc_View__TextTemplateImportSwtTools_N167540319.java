package com.mia.banque.application.generation.ui.hn1418808506;

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
public class mvc_View__TextTemplateImportSwtTools_N167540319 extends com.mia.studio.generation.compilation.AbstractCompiledAction implements com.mia.studio.kernel.compiler.CompiledAction {

	public mvc_View__TextTemplateImportSwtTools_N167540319() {
		//Do nothing
	}

	//For internal use only
	mvc_View__TextTemplateImportSwtTools_N167540319(int anyInt, java.util.List anyList) {
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
								"TextTemplateImportSwtTools", argument.getClass().getName(),
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
			throw new IllegalArgumentException("Wrong number of parameters in call to ''TextTemplateImportSwtTools''");

		final com.mia.formation.mvc.View current = __check_arg__(com.mia.formation.mvc.View.class, _action_parameters[0]);
		final com.mia.openapi.gen.Context context = __check_arg__(com.mia.openapi.gen.Context.class, _action_parameters[1]);
		final com.mia.openapi.gen.GenerationServicesManager manager = __check_arg__(com.mia.openapi.gen.GenerationServicesManager.class, _action_parameters[2]);

		return __invoke_user_code__(current, context, manager);
	}

	public String __invoke_user_code__(final com.mia.formation.mvc.View current, final com.mia.openapi.gen.Context context, final com.mia.openapi.gen.GenerationServicesManager manager)
{

java.lang.StringBuilder _template_buffer = new java.lang.StringBuilder();
_template_buffer.append("import org.eclipse.swt.SWT;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.events.SelectionAdapter;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.events.SelectionEvent;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.layout.GridData;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.layout.GridLayout;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Button;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Display;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Label;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Shell;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Text;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.List;");
_template_buffer.append('\n');
_template_buffer.append("import org.eclipse.swt.widgets.Group;");
return _template_buffer.toString();

}
}
