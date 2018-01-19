import com.zbl.nettyrpc.annotation.FieldTypeAnnotation;
import com.zbl.nettyrpc.annotation.MethodAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by jdd on 2017/10/11.
 */
@FieldTypeAnnotation(type = "class", hobby = {"life"})
public class ReflectAnnotation {

    @FieldTypeAnnotation(hobby = {"sleep", "play"})
    private String maomao;

    @FieldTypeAnnotation(hobby = {"game", "shop"}, age = 25, type = "normal")
    private String zhaobaoliang;

    @MethodAnnotation
    public void method1(){

    }

    @MethodAnnotation(desc = "method2")
    public void method2(){

    }

    public static void main(String[] args) {
        //用反射将注解解析出来
        Class<ReflectAnnotation> clz = ReflectAnnotation.class;
        //解析类上的注解
        boolean clzHasAnno = clz.isAnnotationPresent(FieldTypeAnnotation.class);
        if (clzHasAnno){
            //获取类上的注解
            FieldTypeAnnotation annotation = clz.getAnnotation(FieldTypeAnnotation.class);
            int age = annotation.age();
            String[] hobby = annotation.hobby();
            String type = annotation.type();
            System.out.println(clz.getName() + " age = " + age + ", hobby = " + Arrays.asList(hobby).toString() + " type = " + type);
        }

        //解析字段上的注解
        Field[] fields = clz.getDeclaredFields();
        for (Field field : fields){
            boolean fieldHasAnno = field.isAnnotationPresent(FieldTypeAnnotation.class);
            if (fieldHasAnno){
                FieldTypeAnnotation fieldAnno = field.getAnnotation(FieldTypeAnnotation.class);
                int age = fieldAnno.age();
                String[] hobby = fieldAnno.hobby();
                String type = fieldAnno.type();
                System.out.println(field.getName() + " age = " + age + ", hobby = " + Arrays.asList(hobby).toString() + " type = " + type);
            }
        }

        //解析方法上的注解
        Method[] methods = clz.getDeclaredMethods();
        for (Method method : methods){
            boolean methodHasAnno = method.isAnnotationPresent(MethodAnnotation.class);
            if (methodHasAnno){
                MethodAnnotation methodAnno = method.getAnnotation(MethodAnnotation.class);
                String desc = methodAnno.desc();
                System.out.println(method.getName() + " desc = " + desc);
            }
        }
    }

}
