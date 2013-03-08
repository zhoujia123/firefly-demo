import java.io.OutputStream;
import com.firefly.template.support.ObjectNavigator;
import com.firefly.template.Model;
import com.firefly.template.view.AbstractView;
import com.firefly.template.TemplateFactory;
import com.firefly.template.FunctionRegistry;

public class _book extends AbstractView {

	public _book(TemplateFactory templateFactory){this.templateFactory = templateFactory;}

	@Override
	protected void main(Model model, OutputStream out) throws Throwable {
		ObjectNavigator objNav = ObjectNavigator.getInstance();
		out.write(_TEXT_0);
		out.write(objNav.getValue(model ,"book.id").getBytes("UTF-8"));
		out.write(_TEXT_1);
		out.write(objNav.getValue(model ,"book.name").getBytes("UTF-8"));
		out.write(_TEXT_2);
		out.write(objNav.getValue(model ,"book.author").getBytes("UTF-8"));
		out.write(_TEXT_3);
		out.write(objNav.getValue(model ,"book.price").getBytes("UTF-8"));
		out.write(_TEXT_4);
	}

	private final byte[] _TEXT_0 = str2Byte("<!DOCTYPE html>\n<html>\n<head>\n<title> book html</title>\n</head>\n<body>\n<h1>book 结果页面</h1>\n| ", "UTF-8");
	private final byte[] _TEXT_1 = str2Byte(" | ", "UTF-8");
	private final byte[] _TEXT_2 = str2Byte(" | ", "UTF-8");
	private final byte[] _TEXT_3 = str2Byte(" | ", "UTF-8");
	private final byte[] _TEXT_4 = str2Byte(" |\n\n</body>\n</html>\n", "UTF-8");
}