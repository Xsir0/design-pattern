package cflms;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @ClassName Test
 * @Description
 * @Author xsir
 * @Date 2021/8/12 上午6:27
 * @Version V1.0
 */
public class Test {

    public static void main(String[] args) {
        Client client = new Client();
        String name = client.getClass().getPackage().getName();

        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();

        String s = name.replaceAll(".", "/");

        Enumeration<URL> resources = null;

        try{
            resources = contextClassLoader.getResources(s);
        }catch (IOException e){
            e.printStackTrace();
        }

        List<File> dirs = new ArrayList<>();
        while(resources.hasMoreElements()){
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList<Class> classes = new ArrayList<>();
        for (File dir : dirs) {
            classes.addAll(findClasses(dir,s));
        }
        for (Class aClass : classes) {
            System.out.println(aClass.getName());
        }


    }

    private static List<Class> findClasses(File dir,String packageName){
        List<Class> classes = new ArrayList<>();
        if(!dir.exists()){
            return classes;
        }

        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isDirectory()){
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file,packageName+"."+file.getName()));
            }else if (file.getName().endsWith(".class")){
                try{
                    classes.add(Class.forName(packageName+"."+file.getName().substring(0,file.getName().length()-6)));
                }catch (ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        }
        return classes;
    }



}
