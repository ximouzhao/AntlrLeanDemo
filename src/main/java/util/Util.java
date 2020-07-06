package util;

public class Util {
    public static void info(String msg){
        Throwable t=new Throwable();
        StackTraceElement[] st=t.getStackTrace();
        System.out.println("执行的类名："+st[1].getClassName()+";方法名："+st[1].getMethodName()+" text:"+msg);
    }
}
