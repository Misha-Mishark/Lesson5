
import java.awt.Color;
import java.awt.Graphics;


public class Dice {
    private int Number;
    private Graphics Pen;
    private Color DiceColor;
    public Dice(Graphics Pen){
        /*
        this.Pen = Pen;
        Number = (int)(Math.random()* 6 + 1);
        */
        this(Pen, (int)(Math.random()*6 + 1));
    }
    public Dice(Graphics Pen, int Numbers){
        this.Pen = Pen;
        this.Number = Number;
        DiceColor = Color.white;
    }
    
    public int getNumber(){
        return Number;
    }
    public void Roll(){
        Number = (int)(Math.random() * 6 + 1);
    }
    public void Draw(){
        Pen.setColor(DiceColor);
        Pen.fillRoundRect(25,25,100,100,20,20);
        DrawDots();
        
    }
    public void setColor(Color C){
        DiceColor = C;
    }
    public void DrawDots(){
        if(Number == 1){
            Dot4();
        }
        else if(Number == 2){
            Dot1();
            Dot7();
        }
        else if(Number == 3){
            Dot1();
            Dot4();
            Dot7();
        }
        else if(Number == 4){
            Dot1();
            Dot2();
            Dot6();
            Dot7();
        }
        else if(Number == 5){
            Dot1();
            Dot2();
            Dot4();
            Dot6();
            Dot7();
        }
        else if(Number == 6){
            Dot1();
            Dot2();
            Dot3();
            Dot5();
            Dot6();
            Dot7();
        }
        
    }
    /*Private helper methods
    A Helper method is not called by the object directly
    it is called by another public method
    */
    
    private void Dot1(){
        Pen.setColor(Color.black);
        Pen.fillOval(30,30,25,25);
        
    }
    private void Dot2(){
        Pen.setColor(Color.black);
        Pen.fillOval(90,30,25,25);
        
    }
    private void Dot3(){
        Pen.setColor(Color.black);
        Pen.fillOval(30,60,25,25);
        
    }
    private void Dot4(){
        Pen.setColor(Color.black);
        Pen.fillOval(60,60,25,25);
        
    }
    private void Dot5(){
        Pen.setColor(Color.black);
        Pen.fillOval(90,60,25,25);
        
    }
    private void Dot6(){
        Pen.setColor(Color.black);
        Pen.fillOval(30,90,25,25); 
    }
    private void Dot7(){
        Pen.setColor(Color.black);
        Pen.fillOval(90,90,25,25);
    }
}

