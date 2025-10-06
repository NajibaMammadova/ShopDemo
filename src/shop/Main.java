package shop;

public class Main {
    class Clothing extends Product {
        private Clothing(String name, double price,String size) {
            super(name,price);
            this.size =size;
        }
        @Override
        public void displayInfo(){
            System.out.println("Geyim mehsulu:" + name);
            System.out.println("Olcu :" + size);
            System.out.println("Qiymeti :",price);
        }
        class Technology extends Product{
            private int warrantyPeriod;
            public Technology(String name, double price,int warrantyPeriod){
                super(name,price);
                this.warrantyPeriod=warrantyPeriod
            }
            @Override
                    public void displayInfo(){
                System.out.println(" texnologiya mehsulu:" + name);
                System.out.println(" zemanet muddeti:" + warrantyPeriod + "il");
                System.out.println(" Qiymeti:" + price);
            }public class Main{
                public static void main(String[] args){
                    Clothing c1= new Clothing("t-shirt",19.99,"M");
                    Clothing c2= new Clothing("Sweater"199.99,"S");
                    Technology t1=new Technology ("Smartphone",500.90,2);
                    Technology t2=new Technology("Lap top",1000.99,80000);
                    c1.displayInfo();
                    System.out.println();
                    c2.displayInfo();
                    System.out.println();
                    t1.displayInfo();
                    System.out.println();
                    t2.displayInfo();
                }
            }


        }
    }
}
