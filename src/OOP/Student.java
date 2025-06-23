package OOP;

import kitchen.*;

class TestClass{
    public int num1 = 20;
    public int num2 = 40;

    public int Cong(int a, int b){
        return a+b;
    }

//    public void hienthi(){
//        System.out.println(Cong());
//    }
}

class WebSite {
    /*public String gg ="url1";
    public String ggmap = "url2";*/
    public String gg, ggmap;

    public WebSite (String gg, String ggmap){
        this.gg = gg;
        this.ggmap = ggmap;
    }

    public void displayURRL(){
        System.out.println("URRL:" +gg+" and "+ggmap);
    }

    public String getGg(){
        return gg;
    }
    public String getGgmap(){
        return ggmap;
    }

    public void setGg(String gg){
        this.gg = gg;
    }
    public void setGgmap(String ggmap){
        this.ggmap = ggmap;
    }

}

public class Student {
    public String fullName;
    public int numID;

    public Student(){
        fullName = "Nin";
        numID = 3119;
    }

    public Student(String fullName, Integer numID){
        this.fullName = fullName;
        this.numID = numID;
    }
    public void displayInfo(){
        System.out.println(fullName+ " : "+numID);
    }

    public String getFullName(){
        return fullName;
    }

    public Integer getNumID(){
        return numID;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public void setNumID (Integer numID){
        this.numID = numID;
    }

    public void cooking() {
        kitchenBox kc = new kitchenBox("dao","muỗng","taoNe");
        kc.prepareIngredients();

    }




}
