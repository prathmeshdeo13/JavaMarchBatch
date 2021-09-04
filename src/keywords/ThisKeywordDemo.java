package keywords;

public class ThisKeywordDemo {
    int i;

    void setValues(int i){
        this.i=i;
    }

    void show(){
        System.out.println(i);
    }
}

class Xyz {
    public static void main(String[] args) {
        ThisKeywordDemo t =  new ThisKeywordDemo();
        t.setValues(10);
        t.show();
    }
}


//this keyword is reference variable which refers to there current class of object.