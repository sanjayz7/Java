class Car{
  int year;
  String model;
  String type;
  Engine eng;

  Car(String model,int year,String type){
    this.model=model;
    this.year=year;
   
    eng=new Engine(type);
  }
  void start()
  {
    
  }
}