package prac6;

class Factory {
    public OS getCurrentOS(String inputos) {
        OS os = null;
        if (inputos.equals("windows")) {
            os = new windowsOS();
        } else if (inputos.equals("linux")) {
            os = new linuxOS();
        } else if (inputos.equals("mac")) {
            os = new macOS();
        }
        return os;
    }
}

interface OS {
    void getOS();
}
class windowsOS implements OS {
    public void getOS () {
        System.out.println("Это Windows");
    }
}
class linuxOS implements OS {
    public void getOS () {
        System.out.println("Это Linux");
    }
}
class macOS implements OS {
    public void getOS () {
        System.out.println("Это MacOS");
    }
}

public class FactoryTest {
    public static void main(String[] args){
        String win = "linux";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(win);
        os.getOS();
    }
}