public class MultiThreadExample {
    public static void main(String[] args) {
        // Membuat dan menjalankan beberapa thread
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new MyRunnable(i));
            thread.start();
        }
    }
}

class MyRunnable implements Runnable {
    private int threadNumber;

    public MyRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + threadNumber + " is running - iteration " + i);
            try {
                // Simulasi kerja dengan tidur selama 1 detik
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
