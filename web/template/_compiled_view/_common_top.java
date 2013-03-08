import java.io.OutputStream;
import com.firefly.template.support.ObjectNavigator;
import com.firefly.template.Model;
import com.firefly.template.view.AbstractView;
import com.firefly.template.TemplateFactory;
import com.firefly.template.FunctionRegistry;

public class _common_top extends AbstractView {

	public _common_top(TemplateFactory templateFactory){this.templateFactory = templateFactory;}

	@Override
	protected void main(Model model, OutputStream out) throws Throwable {
		ObjectNavigator objNav = ObjectNavigator.getInstance();
		out.write(_TEXT_0);
	}

	private final byte[] _TEXT_0 = str2Byte("<!DOCTYPE html>\n<html>\n<head>\n<title>top html page</title>\n</head>\n<body>\n<hr/><b>************************************************************************************</b><hr/>\n</body>\n</html>\n", "UTF-8");
}