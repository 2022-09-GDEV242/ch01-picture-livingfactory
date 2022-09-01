/**
 * The picture displays a man wearing a red chillba hat, and people 
 * are playing with a ball behind him. It seems that everyone is
 * enjoying the sunny day outdoors!
 * 
 * @author David Yager
 * @version 2022.09.01
 */
public class Picture
{
    private Square rightLense;
    private Square leftLense;
    private Triangle chillbaHat;
    private Circle head;
    private Square neck;
    private Circle sun;
    private Square background;
    private Square ground;
    private Person person1;
    private Person person2;
    private Circle ball;
    
    private boolean drawn;

    /**
     * Constructors for objects
     */
    public Picture()
    {
        rightLense = new Square();
        leftLense = new Square();
        chillbaHat = new Triangle();  
        head = new Circle();
        neck = new Square();
        sun = new Circle();
        background = new Square();
        ground = new Square();
        person1 = new Person();
        person2 = new Person();
        ball = new Circle();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            background.changeColor("skyblue");
            background.changeSize(999);
            background.moveVertical(-180);
            background.moveHorizontal(-320);
            background.makeVisible();
            
            ground.changeColor("green");
            ground.changeSize(999);
            ground.moveVertical(120);
            ground.moveHorizontal(-320);
            ground.makeVisible();
            
            
            sun.changeColor("yellow");
            sun.changeSize(90);
            sun.moveVertical(-80);
            sun.moveHorizontal(160);
            sun.makeVisible();
            
            ball.changeColor("black");
            ball.changeSize(10);
            ball.moveVertical(120);
            ball.moveHorizontal(150);
            ball.makeVisible();
            
            person1.moveVertical(40);
            person1.moveHorizontal(80);
            person1.makeVisible();
            
            person2.moveVertical(25);
            person2.moveHorizontal(140);
            person2.makeVisible();
            
            head.changeColor("lighttone");
            head.moveHorizontal(-80);
            head.moveVertical(20);
            head.changeSize(180);
            head.makeVisible();
    
            chillbaHat.changeColor("red");
            chillbaHat.changeSize(120, 240);
            chillbaHat.moveHorizontal(25);
            chillbaHat.moveVertical(-120);
            chillbaHat.makeVisible();
            
            neck.changeColor("lighttone");
            neck.moveHorizontal(-110);
            neck.moveVertical(160);
            neck.changeSize(80);
            neck.makeVisible();
            
            rightLense.changeColor("black");
            rightLense.moveHorizontal(-60);
            rightLense.moveVertical(40);
            rightLense.changeSize(40);
            rightLense.makeVisible();
            
            leftLense.changeColor("black");
            leftLense.moveHorizontal(-120);
            leftLense.moveVertical(40);
            leftLense.changeSize(40);
            leftLense.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        background.changeColor("white");
        sun.changeColor("black");
        ground.changeColor("white");
        person1.changeColor("black");
        person2.changeColor("black");
        ball.changeColor("black");
        head.changeColor("black");
        chillbaHat.changeColor("black");
        neck.changeColor("black");
        rightLense.changeColor("white");
        leftLense.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        background.changeColor("skyblue");
        sun.changeColor("yellow");
        ground.changeColor("green");
        person1.changeColor("black");
        person2.changeColor("black");
        ball.changeColor("black");
        head.changeColor("lighttone");
        chillbaHat.changeColor("red");
        neck.changeColor("lighttone");
        rightLense.changeColor("black");
        leftLense.changeColor("black");
    }
}
