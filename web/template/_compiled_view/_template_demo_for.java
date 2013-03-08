import java.io.OutputStream;
import com.firefly.template.support.ObjectNavigator;
import com.firefly.template.Model;
import com.firefly.template.view.AbstractView;
import com.firefly.template.TemplateFactory;
import com.firefly.template.FunctionRegistry;

public class _template_demo_for extends AbstractView {

	public _template_demo_for(TemplateFactory templateFactory){this.templateFactory = templateFactory;}

	@Override
	protected void main(Model model, OutputStream out) throws Throwable {
		ObjectNavigator objNav = ObjectNavigator.getInstance();
		out.write(_TEXT_0);
		int i_index = -1;
		for(Object i : objNav.getCollection(model, "intArr")){
			i_index++;
			model.put("i", i);
			model.put("i_index", i_index);
			out.write(objNav.getValue(model ,"i").getBytes("UTF-8"));
			out.write(_TEXT_1);
		}
		out.write(_TEXT_2);
		FunctionRegistry.get("len").render(model, out, objNav.find(model, "users"));
		out.write(_TEXT_3);
		int u_index = -1;
		for(Object u : objNav.getCollection(model, "users")){
			u_index++;
			model.put("u", u);
			model.put("u_index", u_index);
			out.write(_TEXT_4);
			out.write(objNav.getValue(model ,"u_index").getBytes("UTF-8"));
			out.write(_TEXT_5);
			out.write(objNav.getValue(model ,"u.name").getBytes("UTF-8"));
			out.write(_TEXT_6);
			FunctionRegistry.get("len").render(model, out, objNav.find(model, "u.name"));
			out.write(_TEXT_7);
			out.write(objNav.getValue(model ,"u.age").getBytes("UTF-8"));
			out.write(_TEXT_8);
		}
		out.write(_TEXT_9);
	}

	private final byte[] _TEXT_0 = str2Byte("<!DOCTYPE html>\n<html>\n<head>\n<title>template demo for</title>\n</head>\n<body>\n<div>\n", "UTF-8");
	private final byte[] _TEXT_1 = str2Byte(" &nbsp;&nbsp;\n", "UTF-8");
	private final byte[] _TEXT_2 = str2Byte("</div>\n\n<hr/>\n<h3>'$'{len(users)}是一个函数调用，表示打印users对象的长度</h3>\n<h4>其中'$'{u_index}是获取循环当前下标的自增变量</h4>\n<div>\n<div>users的size为:", "UTF-8");
	private final byte[] _TEXT_3 = str2Byte("</div> <hr/>\n<table style=\"table-layout: fixed;border: 1px\">\n<thead style=\"text-align: center;\">\n<tr><th>index</th><th>name</th><th>name_len</th><th>age</th></tr>\n</thead>\n<tbody>\n", "UTF-8");
	private final byte[] _TEXT_4 = str2Byte("<tr><td>", "UTF-8");
	private final byte[] _TEXT_5 = str2Byte("</td><td>", "UTF-8");
	private final byte[] _TEXT_6 = str2Byte("</td><td>", "UTF-8");
	private final byte[] _TEXT_7 = str2Byte("</td><td>", "UTF-8");
	private final byte[] _TEXT_8 = str2Byte("</td></tr>\n", "UTF-8");
	private final byte[] _TEXT_9 = str2Byte("</tbody>\n</table>\n</div>\n</body>\n</html>\n", "UTF-8");
}