public class Cau03 {
    public static void main(String[] args){
        String version = System.getProperty("java.version");
        String runtimeversion = System.getProperty("java.runtime.version");
        String vendor = System.getProperty("java.vendor");
        String vendorurl = System.getProperty("java.vendor.url");
        String home = System.getProperty("java.home");
        String classpath = System.getProperty("java.classpath");
        System.out.println("Java version: " + version);
        System.out.println("Java Runtime Version: " + runtimeversion);
        System.out.println("Java Home" + home);
        System.out.println("Java Vendor: " + vendor);
        System.out.println("Java Vendor URL: "+ vendorurl);
        System.out.println("Java Class Path" + classpath);

    }
}
