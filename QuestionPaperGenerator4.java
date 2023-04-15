import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class QuestionPaperGenerator4
{
    public void midfunc()
        {
            System.out.println("Select the Term? (1.mid term,2.end term)");
        }
    
    public static void main(String[] args) 
    {
        QuestionPaperGenerator4 obj=new QuestionPaperGenerator4();
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.println("Select the Branch? (1.CSE, 2.ECE, 3.EEE,4.Agriculture)");  
        int branch= sc.nextInt();
       switch(branch)
       {
        case 1:        //for CSE
        System.out.println("Select the subject? (1.JAVA,2.Arifial Intelligence,3.Operating Systems)");
        int subject1= sc.nextInt();
        switch(subject1)
        {
            case 1:
                obj.midfunc();
                int term11= sc.nextInt();
                if(term11==1)
                {
                    System.out.println("          Mid term questions for JAVA");
                    System.out.println("1.What is the difference between JDK, JRE, and JVM?"+
                    "\n2.What are the differences between C++ and Java?"+
                    "\n3.List the features of the Java Programming language?"+
                    "\n4.What do you get in the Java download file?"+
                    "\n5.What is a ClassLoader?"+
                    "\n6.What are the Memory Allocations available in JavaJava?"+
                    "\n7.What are the differences between Heap and Stack Memory in Java?");
                }
                else if(term11==2)
                {
                    System.out.println("          End term questions for JAVA");
                    System.out.println("1.Write a program to reverse an integer in Java"+
                    "\n2.Write a program in Java to check whether an integer is Armstrong number or not."+
                    "\n3.List the features of the Java Programming language?"+
                    "\n4.What do you get in the Java download file?"+
                    "\n5.Write a program in Java to print the Fibonacci series using iteration."+
                    "\n6.Write a program in Java to find greatest among three integers"+
                    "\n7.Write a program in Java to swap two numbers without using third variable");
                }
                else 
                {
                    System.out.println("enter valid option");
                }
            break;
            case 2:
            obj.midfunc();
            int term12= sc.nextInt();
            if(term12==1)
            {
                System.out.println("          Mid term questions for Arifial Intelligence");
               // System.out.println("mid term question for JAVA");
                System.out.println("1.What are the Common Uses and Applications of AI?"+
                "\n2.What are Intelligent Agents, and How are They Used in AI? "+
                "\n3.What is Tensorflow, and What is It Used For?"+
                "\n4.What is Machine Learning, and How Does It Relate to AI?"+
                "\n5.What are Neural Networks, and How Do They Relate to AI?"+
                "\n6.What is Deep Learning, and How Does It Relate to AI?"+
                "\n7.Why is Image Recognition a Key Function of AI?");
            }
            else if(term12==2)
            {
                System.out.println("           End term questions for Arifial Intelligence");
                System.out.println("1.Write a program to reverse an integer in Java"+
                "\n2.Write a program in Java to check whether an integer is Armstrong number or not."+
                "\n3.List the features of the Java Programming language?"+
                "\n4.What do you get in the Java download file?"+
                "\n5.Write a program in Java to print the Fibonacci series using iteration."+
                "\n6.Write a program in Java to find greatest among three integers"+
                "\n7.Write a program in Java to swap two numbers without using third variable");
            }
            else 
            {
                System.out.println("enter valid option");
            }
            break;
            case 3:
            obj.midfunc();
            int term13= sc.nextInt();
            if(term13==1)
            {
                System.out.println("           Mid term questions for Operating Systems");
                //System.out.println("mid term question for JAVA");
                System.out.println("1.Why is the operating system important?"+
                "\n2.What's the main purpose of an OS? "+
                "\n3.What are the benefits of a multiprocessor system?"+
                "\n4.What is RAID structure in OS?"+
                "\n5.What is GUI?"+
                "\n6.What is a Pipe and when it is used?"+
                "\n7.What are the different kinds of operations that are possible on semaphore?"+
                "\n8.What is SMP?"+
                "\n9.What is a thread?"+
                "\n10.What is RAID? What are the different RAID levels?");
            }
            else if(term13==2)
            {
                System.out.println("          End term questions for Operating Systems");
                System.out.println("1.What is a socket?"+
                "\n2.What is a real-time system?"+
                "\n3.What is the difference between micro kernel and macro kernel?"+
                "\n4.What is the concept of reentrancy?"+
                "\n5.What is the difference between process and program?"+
                "\n6.What is the concept of demand paging?"+
                "\n7.What is the advantage of a multiprocessor system?"+
                "\n8.What is virtual memory?"+
                "\n9.What is thrashing?"+
                "\n10.What are the four necessary and sufficient conditions behind the deadlock?");
            }
            else 
            {
                System.out.println("enter valid option");
            }
            break;
        }
        break;
        case 2:        //for ECE
        System.out.println("Select the subject? (1.Digital Electronics,2. industrial automation,3.Electronic Devices)");
        int subject2= sc.nextInt();
        switch(subject2)
        {
            case 1:
                obj.midfunc();
                int term21= sc.nextInt();
                if(term21==1)
                {
                    System.out.println("          Mid term questions for Digital Electronics");
                    System.out.println("1 What is the difference between Latch And Flip-flop?"+
                    "\n2 What is the binary number system? "+
                    "\n3.State the De Morgan's Theorem?"+
                    "\n4.Define Digital System? "+
                    "\n5.What is meant by a bit?"+
                    "\n6.What is the best Example of Digital system?"+
                    "\n7.How many types of number system are there?"+
                    "\n8.What is a Logic gate?"+
                    "\n9.What are the basic Logic gates?"+
                    "\n10.Which gates are called as Universal gate and what are its advantages?");
                }
                else if(term21==2)
                {
                    System.out.println("          End term questions for Digital Elecronics");
                    System.out.println("1.What are the applications of the octal number system?"+
                    "\n2.What are the applications of the octal number system?"+
                    "\n3.What are the fundamental properties of Boolean algebra?"+
                    "\n4.What are Boolean algebra and Boolean expression?"+
                    "\n5.What is meant by K-Map or Karnaugh Map?"+
                    "\n6.Name the two forms of Boolean expression?"+
                    "\n7.What are Minterm and Maxterm?"+
                    "\n8.Write down the Characteristics of Digital ICs?"+
                    "\n9.What are the limitations of the Karnaugh Map?"+
                    "\n10.What are the advantages and disadvantages of the K-Map Method?");
                }
                else 
                {
                    System.out.println("enter valid option");
                }
            break;
            case 2:
            obj.midfunc();
            int term22= sc.nextInt();
            if(term22==1)
            {
                System.out.println("         Mid term questionss for industrial automation");
                //System.out.println("mid term question for JAVA");
                System.out.println("1.What is Automation? "+
                "\n2.What are the different components used in automation?"+
                "\n3.What are the different control systems used in Automation?"+
                "\n4.Explain PID based control system. "+
                "\n5.Difference between PLC & Relay ?"+
                "\n6.Difference between PLC and DCS ?"+
                "\n7.What is PC based control system ?"+
                "\n8.Which are the leading PLC providers ?"+
                "\n9.What is Encoder ?"+
                "\n10.Which are the leading DCS providers ?");
            }
            else if(term22==2)
            {
                System.out.println("        End term questions for industrial automation");
                System.out.println("1.Which are the leading SCADA software providers ?"+
                "\n2.What types of sensors are used for measuring different parameters?"+
                "\n3.What is transmitter?"+
                "\n4. Why 4-20 mA preferred over 0-10 V signal ?"+
                "\n5.Why 4-20 mA preferred over 0-20 mA signal ?"+
                "\n6.Difference between 2 wire, 3 wire and 4 wire transmitter."+
                "\n7.What is a “Smart” Transmitter ?"+
                "\n8.What is Field bus ?"+
                "\n9.What is Actuator ?"+
                "\n10.Explain Working of RTDs" );
            }
            else 
            {
                System.out.println("enter valid option");
            }
            break;
            case 3:
            obj.midfunc();
            int term23= sc.nextInt();
            if(term23==1)
            {
                System.out.println("         Mid term questions for Electronic Devices");
                //System.out.println("mid term question for JAVA");
                System.out.println("1.What do you understand from the word electronics?"+
                "\n2.What are passive and active electrical components?"+
                "\n3.What is a passband?"+
                "\n4.What is an ideal current source?"+
                "\n5.What is an ideal voltage source?"+
                "\n6.Can you explain what feedback means?"+
                "\n7.How and when do you use a resistor?"+
                "\n8.What are the two main types of communication?"+
                "\n9. Does the Norton theorem apply to linear circuitry?"+
                "\n10.What is an operational amplifier?");
            }
            else if(term23==2)
            {
                System.out.println("         End term questions for Electronic Devices");
                System.out.println("1.How is Ohm's law used to calculate the current of an electrical device?"+
                "\n2.What is an integrated circuit? Have you worked with them before?"+
                "\n3. When designing an electric switch, which diode are you likely to use and why?"+
                "\n4. Can you define extrinsic semiconductors and their types?"+
                "\n5. What is modulation and where is it used?"+
                "\n6.What is the heating principle used in a microwave oven?"+
                "\n7.What is demodulation?"+
                "\n8.What is latch up?"+
                "\n9.What is diode?"+
                "\n10.What is transistor?");
            }
            else 
            {
                System.out.println("enter valid option");
            }
            break;
        }
        break;
        case 3:        //for EEE
        System.out.println("Select the subject? (1.Power electronics,2.Electromechanics,3.Physical electronics)");
        int subject3= sc.nextInt();
        switch(subject3)
        {
            case 1:
                obj.midfunc();
                int term31= sc.nextInt();
                if(term31==1)
                {
                    System.out.println("        Mid term questions for Power electronics");
                    System.out.println("1.What is holding current in SCR?"+
                    "\n2.What is holding current in SCR?"+
                    "\n3.What are the different turn on methods of SCR?"+
                    "\n4.What is snubber circuit?"+
                    "\n5.What is hard switching of the thyristor?"+
                    "\n6.What is firing angle?"+
                    "\n7.What is meant by SOA?"+
                    "\n8.Name some of the current controlled (current driven) devices"+
                    "\n9.Name some of the voltage driven ( Voltage controlled) devices"+
                    "\n10.What is duty cycle?"
                    );
                }
                else if(term31==2)
                {
                    System.out.println("      End term questions for Power electronics");
                    System.out.println("1.Can fuses with an AC voltage rating be used in a DC applications?"+
                    "\n2.What are the characteristics of ideal Opamp?"+
                    "\n3.For High voltage applications will you prefer MOSFET or IGBT?"+
                    "\n4.For High frequency applications will you prefer MOSFET or IGBT?  Why?"+
                    "\n5.Draw the buck topology?"+
                    "\n6.What is effect of having more duty cycle and less duty cycle? "+
                    "\n7.How to select the inductor for the buck converter?"+
                    "\n8.What are the various parameters we have to consider, while selecting IGBT?"+
                    "\n9.For Selecting MOSFET, what are the major parameters we have to consider in the datasheet?"+
                    "\n10.What are the advantages of free wheeling diode in rectifier circuit?"
                    );
                }
                else 
                {
                    System.out.println("enter valid option");
                }
            break;
            case 2:
            obj.midfunc();
            int term32= sc.nextInt();
            if(term32==1)
            {
                System.out.println("         Mid term questions for Electromechanics");
               // System.out.println("mid term question for JAVA");
                System.out.println("1.What are some of the preventative maintenance procedures you perform on electromechanical equipment?"+
                "\n2.What kind of tools and equipment do you use to troubleshoot and repair electromechanical systems?"+
                "\n3.What are some common problems that can occur with electromechanical equipment?"+
                "\n4.How do you go about diagnosing problems with electromechanical systems?"+
                "\n5.What are some of the preventative maintenance procedures you perform on electromechanical equipment?"+
                "\n6.What are some of the safety concerns you have to keep in mind when working with electromechanical systems?"+
                "\n7.What would you do if you encountered a problem with an electromechanical system that you were unable to solve?"+
                "\n8.What are some of the safety concerns you have to keep in mind when working with electromechanical systems?"+
                "\n9.What are some of the safety concerns you have to keep in mind when working with electromechanical systems?"+
                "\n10.What are some of the safety concerns you have to keep in mind when working with electromechanical systems?");
            }
            else if(term32==2)
            {
                System.out.println("          End term questions for Electromechanics");
                System.out.println("1. Most electrical indicating instruments are electromechanical systems since? "+
                "\n2.Transfer function of force motor is?"+
                "\n3.Torque developed by a DC motor will be proportional to armature current?"+
                "\n4. What is the relation between eddy current damping coefficient and resistance in PMMC device"+
                "\n5.What is the analogous quantity of current in the fluidic system?"+
                "\n6.What is the advantage of the pneumatic system over the hydraulic system?"+
                "\n7.What is the equivalent pressure in Pascal for 1atm pressure?"+
                "\n8.Notch filter belongs to"+
                "\n9.Rejection frequency of notch filter can be expressed as "+
                "\n10.Why dynamic compensation is used?"
                );
            }
            else 
            {
                System.out.println("enter valid option");
            }
            break;
            case 3:
            obj.midfunc();
            int term33= sc.nextInt();
            if(term33==1)
            {
                System.out.println("          Mid term questions for Physical electronics");
                //System.out.println("mid term question for JAVA");
                System.out.println("1. For an an-channel JFET, having drain source voltage constant if the gate source voltage is increased (more negative) pinch-off would occur for"+
                "\n2. Conversion efficiency of a silicon solar cell is about how much?"+
                "\n3. A semiconductor photo-diode uses which effect?"+
                "\n4. LED gives off visible light from ?"+
                "\n5. In LED , when excited electrons revert from conduction band to valence band, the phenomenon utilized is ?"+
                "\n6. LEDs fabricated from Ga As P emit radiation in the ?"+
                "\n7.A transistor has a current gain of 0.99 in the CB mode. Its current gain in the CC mode is"+
                "\n8.The reverse bias breakdown of high speed silicon transistors is due to Zener breakdown mechanism at"+
                "\n9. Almost all resistors are made in a monolithic integrated circuit while ?"+
                "\n10. An SCR triggered by a current pulse through its gale can be turned off by");
            }
            else if(term33==2)
            {
                System.out.println("          End term questions for Physical electronics");
                System.out.println("1. An electronic circuit wire of conductivity 5.8 × 107 mho-m is subjected to an electric field of 40 mV/m. What will be its current density?"+
                "\n2.Define what do you mean by drift velocity? "+
                "\n3.Define what do you mean by mobility of a free electron? "+
                "\n4.Why silicon and germanium are the two widely used semi-conductor materials?"+
                "\n5.What are the salient features of classical free electron theory? Derive an expression for electrical conductivity in a metal?"+
                "\n6. Describe the electrical conductivity in a metal using quantum free electronic theory."+
                "\n7.Write brief note on Fermi Dirac distribution?"+
                "\n8. Classify the solids into conductor, semiconductor and insulators based on band theory?"+
                "\n9.) Define effective mass and derive the expression for effective mass of an electron in periodi potential field"+
                "\n10.What is the effect of temperature on Fermi Dirac distribution function? "
                );
            }    
            else 
            {
                System.out.println("enter valid option");
            }
            break;
        }
        break;
        case 4:        //for Agriculture
        System.out.println("Select the subject? (1.Horiculture,2.Agronomy,3.Forestry)");
        int subject4= sc.nextInt();
        switch(subject4)
        {
            case 1:
                obj.midfunc();
                int term41= sc.nextInt();
                if(term41==1)
                {
                    System.out.println("         Mid term questions for Horiculture");
                    System.out.println("1.Definition of Horticulture?"+
                    "\n2. Explain importance of horticulture in terms of economy, production, employment generation, environmental protection and human resource development?"+
                    "\n3.Explain scope for horticulture in India. Nutritive value of horticultural crops"+
                    "\n4.An irrigation method followed for horticulture crops with a neat sketch."+
                    "\n5.Cryopreservation is a technique used for?and how it helps?"+
                    "\n6.Which chemical is used for de-greening of fruit?,Why?"+
                    "\n7.Which test is used for testing the significance of mean differences?explain?"+
                    "\n8.Whta is mean polyploidy breeding ?"+
                    "\n9.how the “Pusa Nanha” is developed ?"+
                    "\n10. Multistorey cropping system is practised inwhich states and how it affects the soil?"
                    
                    
                    );
                }
                else if(term41==2)
                {
                    System.out.println("        End term questions for Horiculture");
                    System.out.println("1.Phytophthora species cause diseases on which and how?"+
                    "\n2.. Discuss major business opportunities in horticulture. "+
                    "\n3.What is a crop nursery? Give four reasons for raising seedlings first in a nursery.Name any four fruit plants which are raised first in the nursery through seeds"+
                    "\n4.Define urban and peri-urban horticulture. Commercially, which among the two is better and why?"+
                    "\n5.What is preservation? Discuss different methods of preservation of fruits and vegetables"+
                    "\n6.What is kitchen gardening? Name any four fruit plants suitable for a kitchen garden "+
                    "\n7.What is syrup? How much sugar should be added per litre of water to prepare 20, 30,40 and 50 percent syrup? What should be the ideal syrup temperature for bottling?"+
                    "\n8.What are weeds? Name any four harmful effects of weeds. Also write the names of four weeds"+
                    "\n9.Write the names of four leafy vegetables?"+
                    "\n10.Write the names of six varieties of rose?"
                    );
                }
                else 
                {
                    System.out.println("enter valid option");
                }
            break;
            case 2:
            obj.midfunc();
            int term42= sc.nextInt();
            if(term42==1)
            {
                System.out.println("       Mid term questions for Agronomy");
               // System.out.println("mid term question for JAVA");
                System.out.println("1.What is the difference between determinate and indeterminate growth in plants?"+
                "\n2.What is the difference between C3 and C4 photosynthesis?"+
                "\n3.What is the importance of crop rotation in agronomy?"+
                "\n4.What are the testing procedures used to assess seed quality?"+
                "\n5.What is the ideal pH range for most crops?"+
                "\n6.What is the difference between macronutrients and micronutrients in plant nutrition?"+
                "\n7.Some examples of organic and inorganic fertilizers?");
            }
            else if(term42==2)
            {
                System.out.println("       End term questions for Agronomy");
                System.out.println("1.How does the use of genetic engineering and biotechnology affect crop production and food security?"+
                "\n2.What are the key factors that affect crop growth and yield?"+
                "\n3.What is the role of nutrients in plant growth and development, and how do they affect crop yields?"+
                "\n4.List examples of abiotic soil organic matter mineralization processes?"+
                "\n5.Why the Indo-Gangetic Plains' soil is most fertile not only Indian point of view but also of the world?"+
                "\n6.Inquiry for a material on tropical agronomy?"+
                "\n7.Is there any confirmed linkage between evolution and dissemination of the potato virus X by Phytophthora infestans?");
            }
            else 
            {
                System.out.println("enter valid option");
            }
            break;
            case 3:
            obj.midfunc();
            int term43= sc.nextInt();
            if(term43==1)
            {
                System.out.println("       Mid term questions for Forestry");
                //System.out.println("mid term question for JAVA");
                System.out.println("1.What is the greenhouse effect and why does an increased greenhouse effect lead to climate change? "+
                "\n2.What is the carbon cycle and how does it influence the climate?"+
                "\n3.Why is planting trees helping to reduce climate change?"+
                "\n4.Why does the use of wood help the environment?"+
                "\n5.How can wood be recycled?"+
                "\n6.Are we destroying the World's forests and the climate  by using wood?"+
                "\n7.What is sustainable forestry?");
            }
            else if(term43==2)
            {
                System.out.println("       End term questions for Forestry");
                System.out.println("1. How much forest is there in the world?"+
                "\n2.How does forest protect the planet?"+
                "\n3.What can we do?to protect forest?"+
                "\n4.How to quantify forest ecosystem services such as aesthetic values, recreation, etc.?"+
                "\n5.What kind of allowable cut methods are currently being used in different countries for forest management plans?"+
                "\n6.What is the range of correlation values between tree-ring width and climate variables in the European beech?"+
                "\n7.What are 4 methods of forest management?");
            }
            else 
            {
                System.out.println("enter valid option");
            }
            break;
        }
        
       }
       System.out.println("        ALL THE BEST");
    }
}
    
   