class Thread1{
    public static void main(String a[]){
        Runnable obj1= () ->{
            for(int i=0;i<10;i++){
                System.out.println("Hello World");
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){
                    throw new RuntimeException(e);
                }
            }
        };
          Runnable obj2= () ->{
            for(int i=0;i<10;i++){
                System.out.println("Hi");
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1=  new Thread(obj1);
             Thread t2=  new Thread(obj2);
             t1.start();
             t2.start();
    }
}