class SetGetname extends Thread{  
  public void run(){  
   System.out.println("running...");  
  }  
 public static void main(String args[]){  
  SetGetname t1=new SetGetname();  
  SetGetname t2=new SetGetname();  
  System.out.println("Name of t1:"+t1.getName());  
  System.out.println("Name of t2:"+t2.getName());  
   
  t1.start();  
  t2.start();  
  
  t1.setName("Multiple Name");  
  System.out.println("After changing name of t1:"+t1.getName());  
 }  
}  
