import java.io.OutputStream;
import com.firefly.template.support.ObjectNavigator;
import com.firefly.template.Model;
import com.firefly.template.view.AbstractView;
import com.firefly.template.TemplateFactory;
import com.firefly.template.FunctionRegistry;

public class _common_head extends AbstractView {

	public _common_head(TemplateFactory templateFactory){this.templateFactory = templateFactory;}

	@Override
	protected void main(Model model, OutputStream out) throws Throwable {
		ObjectNavigator objNav = ObjectNavigator.getInstance();
		out.write(_TEXT_0);
	}

	private final byte[] _TEXT_0 = str2Byte("<!DOCTYPE html>\n<html>\n<head>\n<title>this is head html page</title>\n</head>\n<body>\n\n</body>\n</html>\n", "UTF-8");
}