public class MyRunnable2 implements Runnable {
    private String taskName;

    public MyRunnable2(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskName + " is running in thread: " + Thread.currentThread().getName());
        // Lakukan pekerjaan yang dibutuhkan
    }

    public static void main(String[] args) {
        // Membuat instance Runnable
        MyRunnable2 task1 = new MyRunnable2("Task 1");
        MyRunnable2 task2 = new MyRunnable2("Task 2");

        // Membuat thread untuk setiap Runnable
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Memulai eksekusi thread
        thread1.start();
        thread2.start();
    }
}
