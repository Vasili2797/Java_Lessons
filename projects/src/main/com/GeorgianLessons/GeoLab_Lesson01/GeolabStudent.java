package main.com.GeorgianLessons.GeoLab_Lesson01;

public class GeolabStudent {
    private boolean cardStatus=false;
    private String name;

    public GeolabStudent(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setBoolean(boolean card){
        this.cardStatus=card;
    }
    public boolean getCardStatus(){
        return cardStatus;
    }

    public static void main(String[] args) {
        GeolabStudent lataria = new GeolabStudent("Student Name");
        GeolabStudent Student2 = new GeolabStudent("Second Name");
        System.out.println(lataria.getName());
        System.out.println(lataria.getCardStatus());
        lataria.setBoolean(true);
        System.out.println(lataria.getCardStatus());


        String myString = "This is my string in the class";
        String result="";
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)=='t'){
                result+="a";
            }else{
                result+=myString.charAt(i);
            }
        }
        System.out.println(result);

    }
}
