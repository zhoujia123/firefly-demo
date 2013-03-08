import java.io.OutputStream;
import com.firefly.template.support.ObjectNavigator;
import com.firefly.template.Model;
import com.firefly.template.view.AbstractView;
import com.firefly.template.TemplateFactory;
import com.firefly.template.FunctionRegistry;

public class _book_create extends AbstractView {

	public _book_create(TemplateFactory templateFactory){this.templateFactory = templateFactory;}

	@Override
	protected void main(Model model, OutputStream out) throws Throwable {
		ObjectNavigator objNav = ObjectNavigator.getInstance();
		out.write(_TEXT_0);
	}

	private final byte[] _TEXT_0 = str2Byte("<!DOCTYPE html>\n<html>\n<head>\n<title>book create</title>\n</head>\n<body>\n<h1>自动封装request参数到javabean-测试</h1>\n<form action=\"create\" method=\"POST\">\nbook title：<input type=\"text\" name=\"title\"><br/>\nprice：<input type=\"text\" name=\"price\"><br/>\n<input type=\"submit\" value=\"submit\">\n</form>\n\n</body>\n</html>\n", "UTF-8");
}