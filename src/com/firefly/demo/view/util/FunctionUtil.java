package com.firefly.demo.view.util;

import com.firefly.template.Function;
import com.firefly.template.FunctionRegistry;
import com.firefly.template.Model;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 13-3-8
 * Time: 下午4:32
 * To change this template use File | Settings | File Templates.
 */
public abstract class FunctionUtil {

     public static class TestFunction implements Function {
         @Override
         public void render(Model model, OutputStream out, Object... obj) {
             Integer i = (Integer)obj[0];
             String str = (String)obj[1];
             String o = String.valueOf(obj[2]);

             try {
                 out.write((i + "|" + str + "|" + o).getBytes("UTF-8"));
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }

    public static class TestFuntion2 implements Function{
        @Override
        public void render(Model model, OutputStream out, Object... obj) throws Throwable {
            out.write("this is printed by testFunction2".getBytes());
        }
    }


    public static void RegistFunction(){

        FunctionRegistry.add("testFunction", new TestFunction());
        FunctionRegistry.add("testFunction2", new TestFuntion2());

    }

}
