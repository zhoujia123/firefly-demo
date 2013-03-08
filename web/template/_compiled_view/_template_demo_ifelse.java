import java.io.OutputStream;
import com.firefly.template.support.ObjectNavigator;
import com.firefly.template.Model;
import com.firefly.template.view.AbstractView;
import com.firefly.template.TemplateFactory;
import com.firefly.template.FunctionRegistry;

public class _template_demo_ifelse extends AbstractView {

	public _template_demo_ifelse(TemplateFactory templateFactory){this.templateFactory = templateFactory;}

	@Override
	protected void main(Model model, OutputStream out) throws Throwable {
		ObjectNavigator objNav = ObjectNavigator.getInstance();
		out.write(_TEXT_0);
		if (objNav.getBoolean(model ,"login")){
			out.write(_TEXT_1);
			out.write(objNav.getValue(model ,"user.name").getBytes("UTF-8"));
		} else {
			out.write(_TEXT_2);
		}
		out.write(_TEXT_3);
		out.write(objNav.getValue(model ,"user.name").getBytes("UTF-8"));
		out.write(_TEXT_4);
		if ((objNav.getInteger(model ,"user.age") > 18)){
			out.write(_TEXT_5);
			out.write(objNav.getValue(model ,"user.name").getBytes("UTF-8"));
			out.write(_TEXT_6);
		}
		if ((30 <= objNav.getInteger(model ,"user.age"))){
			out.write(_TEXT_7);
			out.write(objNav.getValue(model ,"user.name").getBytes("UTF-8"));
			out.write(_TEXT_8);
		}
		out.write(_TEXT_9);
		FunctionRegistry.get("testFunction").render(model, out, 3, "hello", objNav.find(model, "user.age"));
		out.write(_TEXT_10);
		FunctionRegistry.get("testFunction2").render(model, out);
		out.write(_TEXT_11);
		if (((Object)("Pengtao Qiu")).equals(objNav.find(model ,"user.name"))){
			out.write(_TEXT_12);
		} else if (((Object)("Bob")).equals(objNav.find(model ,"user.name"))){
			out.write(_TEXT_13);
		} else if (((Object)("Jim")).equals(objNav.find(model ,"user.name"))){
			out.write(_TEXT_14);
		} else {
			out.write(_TEXT_15);
		}
		out.write(_TEXT_16);
	}

	private final byte[] _TEXT_0 = str2Byte("<!DOCTYPE html>\n<html>\n<head>\n<title> template demo ifelse</title>\n</head>\n<body>\n<div>\n", "UTF-8");
	private final byte[] _TEXT_1 = str2Byte("Welcome ", "UTF-8");
	private final byte[] _TEXT_2 = str2Byte("can not access\n", "UTF-8");
	private final byte[] _TEXT_3 = str2Byte("</div>\n\n<hr/>\n<h3>", "UTF-8");
	private final byte[] _TEXT_4 = str2Byte("打印model对象属性的值</h3>\n", "UTF-8");
	private final byte[] _TEXT_5 = str2Byte("<div>", "UTF-8");
	private final byte[] _TEXT_6 = str2Byte("'s age more than 18</div>\n", "UTF-8");
	private final byte[] _TEXT_7 = str2Byte("<div>", "UTF-8");
	private final byte[] _TEXT_8 = str2Byte("'s age less then 30</div>\n", "UTF-8");
	private final byte[] _TEXT_9 = str2Byte("\n\n<hr/>\n<div>", "UTF-8");
	private final byte[] _TEXT_10 = str2Byte("</div>\n<div>", "UTF-8");
	private final byte[] _TEXT_11 = str2Byte("</div>\n\n\n\n<h3>条件表达式语法和java语法一样，支持多条件和括号等</h3>\n<div>\n", "UTF-8");
	private final byte[] _TEXT_12 = str2Byte("master come\n", "UTF-8");
	private final byte[] _TEXT_13 = str2Byte("joke come\n", "UTF-8");
	private final byte[] _TEXT_14 = str2Byte("Jim come\n", "UTF-8");
	private final byte[] _TEXT_15 = str2Byte("small potato come\n", "UTF-8");
	private final byte[] _TEXT_16 = str2Byte("</div>\n\n\n</body>\n</html>\n", "UTF-8");
}