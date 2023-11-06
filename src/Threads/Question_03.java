package Threads;
    class GFG extends Thread {
        public void run()
        {
            System.out.println("Thread Started Running...");
        }

        public static void main(String[] args)
        {
            GFG g1 = new GFG();
            g1.start();
        }
    }

