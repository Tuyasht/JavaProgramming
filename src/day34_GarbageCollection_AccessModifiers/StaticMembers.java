package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    public static int num=100;

    public static void method(){

    }
    static {

    }
}



class A{ // outer class can't static

   static class B{ // inner class can be static, member of outer class

       public static void method1(){

       }
    }

}