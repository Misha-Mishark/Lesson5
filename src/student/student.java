package student;

public class student {
    private String name;
    private int test1,test2,test3;
 
    public student(String name, int test1,int test2, int test3){
    this.name = name;
    this.test1 = test1;
    this.test2 = test2;
    this.test3 = test3;
    }
    
    public student(){
        this("",0,0,0);
    }
    
    public student(student other){
        
     this(other.name,other.test1,other.test2,other.test3);
                
                }

    public void setName(String n){
        name = n;
    }
    public void setScore(int i,int score){
        if(i==1) test1=score;
        else if(i==2) test2 = score;
        else test3=score;
    }
    public String getName(){
        return name;
    }
    public int getScore(int i){
        if(i==1) return test1;
        else if(i==2) return test2;
        else  return test3;
    }
    public double getAverage(){
    double average;
    average= (test1 + test2 +test3)/3.0;
    return average;
    }
    public int getHighScore(){
        int high = Math.max(test1, test2);
        high = Math.max(test3, high);
        return high;
    }

    public String toString(){
        String str;
        str = "name:\t" + name;
        str += "\nTest1:\t" +test1;
        str += "\nTest2:\t" +test2;
        str += "\nTest3:\t" +test3;
        str += "\n-------------";
        str+= "\nAverage\t"+getAverage();
        return str;
    }
    
}
