import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME) //megadjuk hogy mikor akarjuk használni az annotációt. itt runtime-kor
@interface MyAnno{ //létrehozunk egy interface-t az annotáció értékeinek
    String str();
    int val();
}

class Meta2{
    @MyAnno(str= "Annotation example", val=100) //létrehozzuk az annotációt
    public static void myMethod(String s, int x){
        
        Meta2 ob = new Meta2(); //saját példány
        
        try {
            Class<?> c = ob.getClass(); //elkérjük a classt amelyben az annotációt akarjuk kérni és eltároljuk ebbe a Class referenciába

            Method m= c.getMethod("myMethod", String.class, int.class); //elkérjük a metódust amihez az annotáció van kapcsolva

            MyAnno anno = m.getAnnotation(MyAnno.class); //elkérjük az annotációt az annotáció class literállal

            System.out.println(anno.str() + " " + anno.val()); //elkérjük az annotáció értékeit
            }
        catch(NoSuchMethodException e){
            System.out.println("Method not found! ");
        }
    }
        public static void main(String args[]){
            myMethod("test",10);
        }
}