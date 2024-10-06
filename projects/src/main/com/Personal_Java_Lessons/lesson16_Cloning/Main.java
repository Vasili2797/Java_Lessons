package main.com.Personal_Java_Lessons.lesson16_Cloning;

public class Main {
    public static void main(String[] args){
        DollySheet dollySheet = new DollySheet();
        DollySheet dollySheet2 =foo(dollySheet);

        dollySheet.setName("Dolly");
        dollySheet2.setName("Dolly the II");
        System.out.println(dollySheet.getName());
        System.out.println(dollySheet2.getName());
    }
    public static DollySheet foo(DollySheet dollySheet2){
        DollySheet dolly=null;
        try {
            dolly = (DollySheet) dollySheet2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return dolly;
    }
}
