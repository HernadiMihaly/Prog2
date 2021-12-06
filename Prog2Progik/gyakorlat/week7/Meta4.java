import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String description();
}

@Retention(RetentionPolicy.RUNTIME) //megadjuk hogy mikor akarjuk használni az annotációt. itt runtime-kor
@interface MyAnno{ //létrehozunk egy interface-t az annotáció értékeinek
    String str() default "testing";
    int val() default 12;
}

@What(description= "class's annotation")
@MyAnno()
class Meta4{

    @What(description= "Multi annotation")
    @MyAnno(str= "Multi annotation example", val=99) //létrehozzuk az annotációt
    public static void myMethod(String s, int x){
        
        Meta4 ob = new Meta4(); //saját példány
        
        try {
            //class annotációja:
            Annotation annos[]= ob.getClass().getAnnotations(); //elkérjük az összes annotációt és letároljuk
            System.out.println("Annotations for Meta3 class:");
            for (Annotation a : annos){
                System.out.println(a);
            }

            Method m = ob.getClass().getMethod("myMethod",String.class, int.class); //elkérjük a class-t, majd a class egyik methodját a paramétereivel együtt
            annos= m.getAnnotations();

            System.out.println("Annotation of the function:");

            for (Annotation a : annos){
                System.out.println(a);
            }
            }
        catch(NoSuchMethodException e){
            System.out.println("Method not found! ");
        }
    }
        public static void main(String args[]){
            myMethod("test",10);
        }
}