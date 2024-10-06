package main.com.Personal_Java_Lessons.lesson12_enumLesson;

public enum Music {
    Classic(5,"Classic"),Rock(8,"Rock"),Pop(12,"Pop");

    private int i;
    private String name;

    Music(int i, String name){
        this.i=i;
        this.name=name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    public void foo(){
        System.out.println("The ID for classic music: "+Music.Classic.getI());
        System.out.println("The genre name for the music: "+Music.Classic.getName());
    }

    public static void main(String[] args){

        Music mc = Music.Classic;
        for(Music element : Music.values()){
            System.out.println(element);
        }

        System.out.println();

        Music mc2 = Music.valueOf(Music.class,"Rock");
        System.out.println(mc);
        System.out.println(mc2);

        System.out.println(mc2.ordinal());//So what ordinal() function does is say the index in array

        //mc=Music.Pop;
        switch (mc){
            case Classic:
                System.out.println("Classic");
                break;
            case Pop:
                System.out.println("Pop");
                break;
            case Rock:
                System.out.println("Rock");
                break;
        }
        System.out.println();

        mc.foo();


    }

}
