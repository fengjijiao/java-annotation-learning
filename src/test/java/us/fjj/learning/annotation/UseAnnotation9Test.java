package us.fjj.learning.annotation;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class UseAnnotation9Test {
    @Test
    public void m1() throws NoSuchMethodException {
        Method method = UseAnnotation9.class.getDeclaredMethod("m1", String.class);
        for (Parameter parameter :
                method.getParameters()) {
            System.out.println("参数" + parameter.getName() + "的注解有：");
            for (Annotation annotation :
                    parameter.getAnnotations()) {
                System.out.println(annotation);
            }
        }
        /**
         * 参数name的注解有：
         * @us.fjj.learning.annotation.Ann9("\u540d\u5b57")
         */
    }
}