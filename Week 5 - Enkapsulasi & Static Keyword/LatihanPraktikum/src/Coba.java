class Processor {
    public static final int PROCESSORS;
    static {
        System.out.println("Mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}

public class Coba {
    public static void main(String[] args) {
        System.out.println(Processor.PROCESSORS);
    }
}
