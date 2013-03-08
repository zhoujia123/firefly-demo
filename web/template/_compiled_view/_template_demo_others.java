import java.io.OutputStream;
import com.firefly.template.support.ObjectNavigator;
import com.firefly.template.Model;
import com.firefly.template.view.AbstractView;
import com.firefly.template.TemplateFactory;
import com.firefly.template.FunctionRegistry;

public class _template_demo_others extends AbstractView {

	public _template_demo_others(TemplateFactory templateFactory){this.templateFactory = templateFactory;}

	@Override
	protected void main(Model model, OutputStream out) throws Throwable {
		ObjectNavigator objNav = ObjectNavigator.getInstance();
		out.write(_TEXT_0);
		model.put("title", "templateDemoOthers");
		templateFactory.getView("/common/head.html").render(model, out);
		out.write(_TEXT_1);
		templateFactory.getView("/common/top.html").render(model, out);
		model.put("title", "thisIsOnePage");
		templateFactory.getView("/common/top.html").render(model, out);
		out.write(_TEXT_2);
		out.write(String.valueOf(10.5).getBytes("UTF-8"));
		out.write(_TEXT_3);
		switch(objNav.getInteger(model, "stage")) {
		case 1:
			out.write(_TEXT_4);
			break;
		case 2:
			out.write(_TEXT_5);
			break;
		default:
			out.write(_TEXT_6);
		}
		out.write(_TEXT_7);
		model.put("msg", "welcom");
		model.put("price", "4.5");
		model.put("testName", objNav.find(model, "name"));
		out.write(_TEXT_8);
		out.write(objNav.getValue(model ,"msg").getBytes("UTF-8"));
		out.write(_TEXT_9);
		out.write(objNav.getValue(model ,"testName").getBytes("UTF-8"));
		out.write(_TEXT_10);
		out.write(objNav.getValue(model ,"price").getBytes("UTF-8"));
		out.write(_TEXT_11);
	}

	private final byte[] _TEXT_0 = str2Byte("<!DOCTYPE html>\n<html>\n<head>\n", "UTF-8");
	private final byte[] _TEXT_1 = str2Byte("</head>\n<body>\n<h2>[eval,include, set, switch, case] demo</h2>\n\n<h3>include后面的URL要以/开头</h3>\n", "UTF-8");
	private final byte[] _TEXT_2 = str2Byte("\n<hr/>\n<h3>eval用来打印一个求值表达式</h3>\n<div>", "UTF-8");
	private final byte[] _TEXT_3 = str2Byte("\n<hr/>\n<h3>switch 语句的使用</h3>\n<div>\n", "UTF-8");
	private final byte[] _TEXT_4 = str2Byte("stage1\n", "UTF-8");
	private final byte[] _TEXT_5 = str2Byte("stage2\n", "UTF-8");
	private final byte[] _TEXT_6 = str2Byte("stage-default\n", "UTF-8");
	private final byte[] _TEXT_7 = str2Byte("</div>\n\n<hr/>\n<h3>set可以把一组键值对保存到model中</h3>\n", "UTF-8");
	private final byte[] _TEXT_8 = str2Byte("<div>\n", "UTF-8");
	private final byte[] _TEXT_9 = str2Byte("&nbsp;&nbsp;", "UTF-8");
	private final byte[] _TEXT_10 = str2Byte("\n</div>\n<div>\napple's price: ", "UTF-8");
	private final byte[] _TEXT_11 = str2Byte("\n</div>\n\n\n</body>\n</html>\n", "UTF-8");
}