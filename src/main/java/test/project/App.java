package test.project;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public App(String path) throws IOException {
        System.out.println("dao:===" + (new File(path + "/")).mkdirs());
        System.out.println("bean:===" + (new File(path + "/bean/")).mkdirs());
        System.out.println("service:===" + (new File(path + "rvice/")).mkdirs());
        System.out.println("util:===" + (new File(path + "/util/")).mkdirs());
        System.out.println("servlet:===" + (new File(path + "rvlet/")).mkdirs());
        System.out.println("输出路径：===" + path);
    }

    public static void main( String[] args )
    {

    }
}
