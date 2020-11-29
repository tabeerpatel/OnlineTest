import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;  

public class OnlineTest 
//extends Applet implements ActionListener  
{
   
 String testQuestions, testOptions, answer, enter;
 char ch;
 int i, correct=0;
 OnlineTest[] test = new OnlineTest[50];
 public void initialise(){
        
 for(i=0; i<50; i++) {
 test[i] = new OnlineTest();

   }
 }

  /*  
 public void paint(Graphics g) {
      g.drawString("Which of these can be overloaded?",40,20);
       
public void init(){ 
	CheckboxGroup chkgrp = new CheckboxGroup();
        Checkbox java = new Checkbox("Methods", chkgrp, true);
	Checkbox java = new Checkbox("Constructors", chkgrp, true);
	Checkbox java = new Checkbox("All", chkgrp, true);
	Checkbox java = new Checkbox("None", chkgrp, true);
 add("Methods");  
 add("Constructors"); 
 add("All"); 
 add("None");
   }*/
public void testQuestions(){
        try{
            test[0].testQuestions="Which of these can be overloaded?";
            test[1].testQuestions="What is the range of byte data type in Java?";
            test[2].testQuestions="What is the numerical range of a char data type in Java?";
            test[3].testQuestions="Which of these values can a boolean variable contain?";
            test[4].testQuestions="Iteral can be of which of these data types?";
            test[5].testQuestions="Which of these can not be used for a variable name in Java?";
            test[6].testQuestions="Which of these access specifiers can be used for an interface?";
            test[7].testQuestions="Which of these is not a bitwise operator?";
            test[8].testQuestions="What is the output of relational operators?";
            test[9].testQuestions="Which of these operators can skip evaluating right hand operand?";
            test[10].testQuestions="Which of keyword is used by class to use interface defined previously?";
            test[11].testQuestions="Which of these have highest precedence?";
            test[12].testQuestions="Which of these selection statements test only for equality?";
            test[13].testQuestions="Which of these is selection statement in Java?";
            test[14].testQuestions="Which of the following package stores all the standard java classes?";
            test[15].testQuestions="Which of the following can be operands of arithmetic operators?";
            test[16].testQuestions="Modulus operator, %, can be applied to which of these?";
            test[17].testQuestions="Which of these keywords is used to make a class?";
            test[18].testQuestions="Which of following is valid declaration of object of class Box?";
            test[19].testQuestions="Decrement operator, decreases value of variable by what number?";
            test[20].testQuestions="Which of these keywords is used to make a class?";
            test[21].testQuestions="What is the return type of a method that does not returns any value?";
            test[22].testQuestions="Which of these operators is used to allocate memory for object?";
            test[23].testQuestions="Which of these keyword must be used to inherit a class?";
            test[24].testQuestions="Which method can be defined only once in a program?";
            test[25].testQuestions="Which of keyword is used to refer member of base class??";
            test[26].testQuestions="Which keyword is used by method to refer to the object that invoked it?";
            test[27].testQuestions="Which of these coding types is used for data type characters in Java?";
            test[28].testQuestions="Which of the values can boolean variable contain?";
            test[29].testQuestions="Which one is a valid declaration of a boolean?";
            test[30].testQuestions="Which of these can be overloaded?";
            test[31].testQuestions="Which of these can be returned by the operator & ?";
            test[32].testQuestions="Which of these access specifiers must be used for main() method?";
            test[33].testQuestions="Literals in java must be appended by which of these?";
            test[34].testQuestions="Literal can be of which of these data types?";
            test[35].testQuestions="Which of these can not be used for variable name in Java?";
            test[36].testQuestions="Which of these is not a bitwise operator?";
            test[37].testQuestions="Which right shift operator preserves the sign of the value?";
            test[38].testQuestions="What is the output of relational operators?";
            test[39].testQuestions="Which of these operators can skip evaluating right hand operand?";
            test[40].testQuestions="Which of these events will be notified if scroll bar is manipulated?";
            test[41].testQuestions="Which of these is superclass of ContainerEvent class?";
            test[42].testQuestions="Which of these have highest precedence?";
            test[43].testQuestions="Event class is defined in which of these libraries?";
            test[44].testQuestions="Which of these class is super class of all the events?";
            test[45].testQuestions="What does AWT stands for?";
            test[46].testQuestions="Which of these is used to perform all input & output operations in Java?";
            test[47].testQuestions="Which of these is a type of stream in Java?";
            test[48].testQuestions="String in Java is a?";
            test[49].testQuestions="Which one among these is not a valid component?";
        //    test[50].testQuestions="What is the full form of Java API?";
             }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Error Occur!\n"+e.getMessage());
            System.exit(0);
        }
    }

    public void testOptions(){
        try{
            test[0].testOptions=" A. Methods\n B. Constructors\n C. All\n D. None\n";
            test[1].testOptions=" A: -128 to 127\n B: -32768 to 32767\n C: -2147483648 to 2147483647\n D: None of the mentioned";
            test[2].testOptions=" A: -128 to 127\n B: 0 to 256\nC: 0 to 32767\nD: 0 to 65535";

            test[3].testOptions=" A: True & False \n B: 0 & 1 \n C: Any integer value \n D: true \n";

            test[4].testOptions=" A: integer\n B: float \n C: boolean\n D: all of the mentioned\n";

            

            test[5].testOptions=" A: identifier\n B: keyword \n C: identifier & keyword\n D: None of the mentioned\n";

            
            test[6].testOptions=" A: Public\n B: Private \n C: Protected\n D: None\n";

            
            test[7].testOptions=" A: &\n B: &= \n C: |=\n D: <=\n";

            
            test[8].testOptions=" A: Integer\n B: Boolean \n C: Characters\n D: Double\n";

            
            test[9].testOptions=" A: !\n B: | \n C: &\n D: &&\n";

            
            test[10].testOptions=" A: import\n B: Import \n C: implements\n D: Implements\n";

            
            test[11].testOptions=" A: ()\n B:  ++\n C: *\n D: >>\n";

            
            test[12].testOptions=" A: if\n B: switch \n C: if & switch\n D: None of the mentioned\n";

            
            test[13].testOptions=" A: if()\n B: for()\n C: continue\n D: break\n";

            
            test[14].testOptions=" A: lang\n B:  java\n C: util\n D: java.packages\n";

            
            test[15].testOptions=" A: Numeric\n B: Boolean\n C: characters\n D: Both a & b\n";

            
            test[16].testOptions=" A: Integers\n B: Floating–point numbers \n C: Both a & b\n D: None\n";

            
            test[17].testOptions=" A: class\n B: struct\n C: int\n D: None of the mentioned\n";

            
            test[18].testOptions=" A: Box obj = new Box();\n B: Box obj = new Box; \n C: obj = new Box();\n D: new Box obj;\n";

            
            test[19].testOptions=" A: 1\n B: 2 \n C: 3\n D: 4\n";

            
            test[20].testOptions=" A: class\n B: struct \n C: int\n D: None of above\n";

            
            test[21].testOptions=" A: int\n B: float \n C: void\n D: double\n";

            
            test[22].testOptions=" A: malloc\n B: alloc \n C: new\n D: give\n";

            
            test[23].testOptions=" A: super\n B: this \n C: extent\n D: extent\n";

            
            test[24].testOptions=" A: main method\n B: finalize method\n C: static method\n D: private method\n";

            
            test[25].testOptions=" A: upper\n B: super \n C: this\n D: None\n";

            
            test[26].testOptions=" A: import\n B: catch \n C: abstract\n D: this\n";

            
            test[27].testOptions=" A: ASCII\n B: ISO-LATIN-1 \n C: UNICODE\n D: None\n";

            
            test[28].testOptions=" A: True & False\n B: 0 & 1 \n C: Any integer value\n D: true\n";

            
            test[29].testOptions=" A: boolean b1=1\n B: boolean b2=‘false’ \n C: boolean b3= false\n D: boolean b4=‘true’\n";

            
            test[30].testOptions=" A: Methods\n B: Constructors \n C: All of the mentioned\n D: None\n";

            
            test[31].testOptions=" A: Integer\n B: Boolean \n C: Character\n D: Integer or Boolean\n";

            
            test[32].testOptions=" A: private\n B: public \n C: protected\n D: None of the mentioned\n";

            
            test[33].testOptions=" A: L\n B: I \n C: D\n D: L & I\n";

            
            test[34].testOptions=" A: integer\n B: float \n C: boolean\n D: All\n";

            
            test[35].testOptions=" A: identifier\n B: keyword \n C: identifier & keyword\n D: None\n";

            
            test[36].testOptions=" A: &\n B: &= \n C: |=\n D: <=\n";

            
            test[37].testOptions=" A: <<\n B: >> \n C: <<=\n D: >>=\n";

            
            test[38].testOptions=" A: Integer\n B: Boolean \n C: Characters\n D: Double\n";

            
            test[39].testOptions=" A: !\n B: | \n C: &\n D: &&\n";

            
            test[40].testOptions=" A: ActionEvent\n B: ComponentEvent \n C: AdjustmentEvent\n D: WindowEvent\n";

            
            test[41].testOptions=" A: WindowEvent\n B: ComponentEvent \n C: ItemEvent\n D: InputEvent\n";

            
            test[42].testOptions=" A: ()\n B: ++ \n C: *\n D: >>\n";

            
            test[43].testOptions=" A: java.io\n B: java.lang \n C: java.net\n D: java.util\n";

            
            test[44].testOptions=" A: EventObject\n B: EventClass \n C: ActionEvent\n D: ItemEvent\n";

            
            test[45].testOptions=" A: All Window Tools\n B: All Writing Tools \n C: Abstract Window Toolkit\n D: Abstract Writing Toolkit\n";

            
            test[46].testOptions=" A: streams\n B: Variables \n C: classes\n D: Methods\n";

            
            test[47].testOptions=" A: Integer stream\n B: Short stream \n C: Byte stream\n D: Long stream\n";

            
            test[48].testOptions=" A: class\n B: object \n C: variable\n D: character array\n";

            
            test[49].testOptions=" A: JButton\n B: JList \n C: JButtonGroup\n D: JTextArea\n";

            
            //test[50].testOptions=" A: \n B:  \n C: \n D: \n";

            
           }


        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Error Occur!\n"+e.getMessage());
            System.exit(0);
        }
    }

    public void testAnswers(){
        test[0].answer="C";
        test[1].answer="A";
        test[2].answer="D";
        test[3].answer="A";
        test[4].answer="D";
        test[5].answer="B";
        test[6].answer="C";
        test[7].answer="D";
        test[8].answer="B";
        test[9].answer="D";
        test[10].answer="D";
        test[11].answer="A";
        test[12].answer="D";
        test[13].answer="A";
        test[14].answer="B";
        test[15].answer="D";
        test[16].answer="C";
        test[17].answer="A";
        test[18].answer="A";
        test[19].answer="A";
        test[20].answer="A";
        test[21].answer="C";
        test[22].answer="C";
        test[23].answer="D";
        test[24].answer="A";
        test[25].answer="B";
        test[26].answer="D";
        test[27].answer="C";
        test[28].answer="A";
        test[29].answer="C";
        test[30].answer="C";
        test[31].answer="D";
        test[32].answer="B";
        test[33].answer="C";
        test[34].answer="D";
        test[35].answer="B";
        test[36].answer="D";
        test[37].answer="B";
        test[38].answer="B";
        test[39].answer="D";
        test[40].answer="C";
        test[41].answer="B";
        test[42].answer="A";
        test[43].answer="D";
        test[44].answer="A";
        test[45].answer="C";
        test[46].answer="A";
        test[47].answer="B";
        test[48].answer="A";
        test[49].answer="C";
       // test[50].answer="A";
            }

    public void play(){
        try{
            Scanner scan=new Scanner(System.in);
            String temp="";
            Collections.shuffle(Arrays.asList(test));
            Collections.shuffle(Arrays.asList(test));
            for(i=0; i<10; i++){
                System.out.println("Question "+(i+1)+": "+test[i].testQuestions+"\nOptions:-\n"+test[i].testOptions);
                System.out.printf("Your Answer (A/B/C/D): ");
                temp=scan.next();
                ch=temp.charAt(0);
                temp=Character.toString(ch);
                System.out.println("\n\n");
                if(temp.equalsIgnoreCase(test[i].answer)){
                    System.out.println("Correct!");
                    correct++;
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Answer: "+test[i].answer);
                System.out.println("\n\n");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Error Occur!\n"+e.getMessage());
            System.exit(0);
        }
        catch(InputMismatchException e){
            System.err.println("Error Occur!\n"+e.getMessage());
            System.exit(0);
        }
    }

    public void result(){
        System.out.println("Your Final Result:- ");
        System.out.println("You answered 10 questions out of which you answered "+correct+" correct and "+(10-correct)+" incorrect!");
        if(correct<=5)
            System.out.println("Better Luck Next Time!");
        else if(correct<=10 && correct>5)
            System.out.println("You played nice. But more affort is needed!");
     /*   else if(correct<=15 && correct>10)
            System.out.println("You did a great job!");
        else if(correct<=19 && correct>15)
            System.out.println("You were Amazing!");
        else if(correct==20)
            System.out.println("You did a Marvelous job!");*/
    }

    public static void main(String[] args){
        OnlineTest obj=new OnlineTest();
        obj.initialise();
        obj.testQuestions();
        obj.testOptions();
        obj.testAnswers();
        obj.play();
        obj.result();
    }
}