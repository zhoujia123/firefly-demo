import java.io.OutputStream;
import com.firefly.template.support.ObjectNavigator;
import com.firefly.template.Model;
import com.firefly.template.view.AbstractView;
import com.firefly.template.TemplateFactory;
import com.firefly.template.FunctionRegistry;

public class _list_book extends AbstractView {

	public _list_book(TemplateFactory templateFactory){this.templateFactory = templateFactory;}

	@Override
	protected void main(Model model, OutputStream out) throws Throwable {
		ObjectNavigator objNav = ObjectNavigator.getInstance();
		out.write(_TEXT_0);
		out.write(objNav.getValue(model ,"user.name").getBytes("UTF-8"));
		out.write(_TEXT_1);
		out.write(objNav.getValue(model ,"user.role").getBytes("UTF-8"));
		out.write(_TEXT_2);
		if (((Object)("admin")).equals(objNav.find(model ,"user.role"))){
			out.write(_TEXT_3);
			int book_index = -1;
			for(Object book : objNav.getCollection(model, "books")){
				book_index++;
				model.put("book", book);
				model.put("book_index", book_index);
				if ((objNav.getInteger(model ,"book.price") > 0)){
					out.write(_TEXT_4);
					out.write(objNav.getValue(model ,"book_index").getBytes("UTF-8"));
					out.write(_TEXT_5);
					out.write(objNav.getValue(model ,"book.title").getBytes("UTF-8"));
					out.write(_TEXT_6);
					out.write(objNav.getValue(model ,"book.author").getBytes("UTF-8"));
					out.write(_TEXT_7);
					out.write(objNav.getValue(model ,"book.publisher").getBytes("UTF-8"));
					out.write(_TEXT_8);
					FunctionRegistry.get("dateFormat").render(model, out, objNav.find(model, "book.publication"));
					out.write(_TEXT_9);
					out.write(objNav.getValue(model ,"book.price").getBytes("UTF-8"));
					out.write(_TEXT_10);
					out.write(objNav.getValue(model ,"book.discount").getBytes("UTF-8"));
					out.write(_TEXT_11);
					FunctionRegistry.get("book_count").render(model, out, objNav.find(model, "book"));
					out.write(_TEXT_12);
				}
			}
			out.write(_TEXT_13);
		} else if (objNav.find(model ,"user") != null){
			out.write(_TEXT_14);
		} else {
			out.write(_TEXT_15);
		}
		out.write(_TEXT_16);
	}

	private final byte[] _TEXT_0 = str2Byte("<!DOCTYPE html>\n<html>\n<body>\n<div>", "UTF-8");
	private final byte[] _TEXT_1 = str2Byte("/", "UTF-8");
	private final byte[] _TEXT_2 = str2Byte("</div>\n", "UTF-8");
	private final byte[] _TEXT_3 = str2Byte("<table>\n<tr>\n<th>NO.</th>\n<th>Title</th>\n<th>Author</th>\n<th>Publisher</th>\n<th>PublicationDate</th>\n<th>Price</th>\n<th>DiscountPercent</th>\n<th>DiscountPrice</th>\n</tr>\n", "UTF-8");
	private final byte[] _TEXT_4 = str2Byte("<tr>\n<td>", "UTF-8");
	private final byte[] _TEXT_5 = str2Byte("</td>\n<td>", "UTF-8");
	private final byte[] _TEXT_6 = str2Byte("</td>\n<td>", "UTF-8");
	private final byte[] _TEXT_7 = str2Byte("</td>\n<td>", "UTF-8");
	private final byte[] _TEXT_8 = str2Byte("</td>\n<td>", "UTF-8");
	private final byte[] _TEXT_9 = str2Byte("</td>\n<td>", "UTF-8");
	private final byte[] _TEXT_10 = str2Byte("</td>\n<td>", "UTF-8");
	private final byte[] _TEXT_11 = str2Byte("%</td>\n<td>", "UTF-8");
	private final byte[] _TEXT_12 = str2Byte("</td>\n</tr>\n", "UTF-8");
	private final byte[] _TEXT_13 = str2Byte("</table>\n", "UTF-8");
	private final byte[] _TEXT_14 = str2Byte("<table>\n<tr>\n<td>No privilege.</td>\n</tr>\n</table>\n", "UTF-8");
	private final byte[] _TEXT_15 = str2Byte("<table>\n<tr>\n<td>No login.</td>\n</tr>\n</table>\n", "UTF-8");
	private final byte[] _TEXT_16 = str2Byte("</body>\n</html>\n", "UTF-8");
}