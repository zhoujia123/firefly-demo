import java.io.OutputStream;
import com.firefly.template.support.ObjectNavigator;
import com.firefly.template.Model;
import com.firefly.template.view.AbstractView;
import com.firefly.template.TemplateFactory;
import com.firefly.template.FunctionRegistry;

public class _food extends AbstractView {

	public _food(TemplateFactory templateFactory){this.templateFactory = templateFactory;}

	@Override
	protected void main(Model model, OutputStream out) throws Throwable {
		ObjectNavigator objNav = ObjectNavigator.getInstance();
		out.write(_TEXT_0);
		out.write(objNav.getValue(model ,"hello").getBytes("UTF-8"));
		out.write(_TEXT_1);
		out.write(objNav.getValue(model ,"fruit0.name").getBytes("UTF-8"));
		out.write(_TEXT_2);
		out.write(objNav.getValue(model ,"fruit0.price").getBytes("UTF-8"));
		out.write(_TEXT_3);
		out.write(objNav.getValue(model ,"strawberry.name").getBytes("UTF-8"));
		out.write(_TEXT_4);
		out.write(objNav.getValue(model ,"strawberry.price").getBytes("UTF-8"));
		out.write(_TEXT_5);
	}

	private final byte[] _TEXT_0 = str2Byte("<html>\n<head>\n<title> food page</title>\n</head>\n<body>\n<h1>", "UTF-8");
	private final byte[] _TEXT_1 = str2Byte("</h1>\n\n======fruit0==", "UTF-8");
	private final byte[] _TEXT_2 = str2Byte("==", "UTF-8");
	private final byte[] _TEXT_3 = str2Byte("==========<br/>\n======strawberry==", "UTF-8");
	private final byte[] _TEXT_4 = str2Byte("==", "UTF-8");
	private final byte[] _TEXT_5 = str2Byte("==========<br/>\n\n</body>\n</html>\n", "UTF-8");
}