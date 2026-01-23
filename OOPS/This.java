
class Builder {
       int val;
       Builder setValue1(int val){
           this.val=val;
           return this;
           
       }
       void display(){
           System.out.println("Value :"+val);
       }
     
    public static void main(String[] args) {
     
           Builder n = new Builder();
           n.setValue1(50).display();
              n.setValue1(30).display();
       }
    
} 