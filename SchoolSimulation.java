import java.util.Random;
import java.lang.Thread;

public class SchoolSimulation{

    public static void main(String[] args) {
        Random random = new Random();

        //create new objects of different classes
        School sch = new School();
        sch.setName("Lyceum of Modern Languages and Management");
        sch.setSurface(5120);
        sch.setAnnualFunds(70000);
        sch.setReputation(65);
        School.Location loc = new School.Location();
        loc.setCity("Chisinau");
        loc.setAddress("Petru Rares 39");
    
        Teacher t = new Teacher();
        t.setID(23);
        t.setName("Maria Ghita");
        t.setSubject("Physical Education");
        t.setSalary(1200);

        Parent p = new Parent();
        p.setName("Giana Dudnic");

        Parent p1 = new Parent();
        p1.setName("Ioana Chitic");
        
        Student s = new Student();
        s.setID(97);
        s.setName("Cristina Dudnic");
        s.setGrade(11);
        s.setPresence("present");
        s.setEminence(60);

        Student s1 = new Student();
        s1.setID(56);
        s1.setName("Dan Chitic");
        s1.setGrade(10);
        s1.setPresence("present");
        s1.setEminence(95);

        Adjunct a = new Adjunct();
        a.setID(44);
        a.setName("Lucia Rabei");
        a.setTask("Organize parent-teacher meeting ");
        a.setSalary(2100);
    
        AuxiliaryWorker auxw1 = new AuxiliaryWorker();
        auxw1.setID(55);
        auxw1.setJob("Nurse");
        auxw1.setName("Irina Arnadie");
        auxw1.setSalary(1000);

        AuxiliaryWorker aw = new AuxiliaryWorker();
        aw.setID(76);
        aw.setJob("Cook");
        aw.setName("Arcadie Manolie");
        aw.setSalary(950);
       
        Curriculum c = new Curriculum("");

        int j = 1, dd = 1;
        float scene1;
        while (j ==1) {
            int no_incidents = 0;
            
            System.out.println("Day "+ dd);
            System.out.println();

            //sleeping during class has a 60% chance of happenng for student s
            scene1 = random.nextFloat();
            if (scene1 <= 0.4) {
                        s.attendsClass();
                        t.teaches();
                        s.listensToTeacher();
                        s.leavesClass();
                        System.out.println();
            }
            else {
                        s.attendsClass();
                        t.teaches();
                        s.sleepsDuringClass();
                        t.givesObservation();
                        float idk = random.nextFloat();
                        if (idk <= 0.5) { 
                            s.getsObservationBad(); 
                            s.modifyEminence(-20);   
                            no_incidents +=1; 
                        }
                        else if (idk > 0.5 && idk <= 0.75) { 
                            s.getsObservationGood();
                            s.modifyEminence(5);
                        }
                        else { s.getsObservationNeutral();}
                        s.leavesClass();
                        System.out.println();             
            }

             //sleeping during class has a 15% chance of happenng for student s1
             scene1 = random.nextFloat();
             if (scene1 <= 0.85) {
                         s1.attendsClass();
                         t.teaches();
                         s1.listensToTeacher();
                         s1.leavesClass();
                         System.out.println();
             }
             else {
                         s1.attendsClass();
                         t.teaches();
                         s1.sleepsDuringClass();
                         t.givesObservation();
                         float idk = random.nextFloat();
                         if (idk <= 0.5) { 
                             s1.getsObservationBad(); 
                             s1.modifyEminence(-15);  
                             no_incidents +=1;  
                         }
                         else if (idk > 0.5 && idk <= 0.75) { 
                             s1.getsObservationGood();
                             s1.modifyEminence(10);
                         }
                         else { s.getsObservationNeutral();}
                         s1.leavesClass();
                
                         System.out.println();                  
             }
             
            // the bathroom fight scenario has 30% chance of happening
            //then depending on their eminence they decide their punishments.
            float scene2 = random.nextFloat();
            if (scene2 <= 0.3) {
                        System.out.println();
                        s.attendsClass();
                        t.teaches();
                        s.listensToTeacher();
                        t.endsClass();
                        s.eats();
                        s.bathroom();
                        s.smokesInBathroom();
                        s1.smokeObservation();
                        s.getsIntoFight();
                        s1.getsIntoFight1();
                        t.stopsFight();
                        a.organizeMeeting();
                        p.entersMeetingRoom();
                        if (s.getEminence()< 15) {
                            a.exmatriculation1();
                        }
                        else {
                            a.punishment1();
                        }
                        if (s1.getEminence()<20) {
                            a.exmatriculation2();
                        }
                        else if (s1.getEminence()>=20 && s1.getEminence()<=70){
                            a.punishment2();
                        }
                        else {
                            a.noPunishment();
                        }
                        no_incidents +=1;
                        System.out.println();
            }

            //if the eminence of sudent s is less than 30 a meeting is organized to decide what to do
            if (s.getEminence() < 30) {
                       System.out.println();
                       a.organizeMeeting();
                       p.entersMeetingRoom();
                       t.entersMeetingRoom();
                       t.parentMeeting();
                       float option = random.nextFloat();
                         if (option >= 0.7) {
                             System.out.println(p.getName()+ ": I see, I didnt't know about that...I will make sure to talk to him/her at home. Thank you for letting me know. ");
                             p.leaveMeeting();
                             s.modifyEminence(15);
                            }
                         else if (option < 0.7 && option >= 0.4) {
                            System.out.println(p.getName()+ ": Ah, they're children.. It is no nothing serious! ");
                            p.leaveMeeting();
                         }
                         else {
                            System.out.println(p.getName()+ ": What did you just say about my children?! I want to to talk to your superior about this! *Karen noises*");
                            float opt = random.nextFloat();
                              if (opt <=0.3) {
                                 t.argueParent();
                                 a.salaryCut();
                                 t.modifySalary(-500);
                                 a.exmatriculation2();
                                 no_incidents +=1;
                             }
                             else {
                              t.calmParent();
                              p.leaveMeeting();
                              t.modifySalary(200);
                     }
                        }

            }

              //if the eminence of sudent s1 is less than 30 a meeting is organized to decide what to do
              if (s.getEminence() < 30) {
                System.out.println();
                a.organizeMeeting();
                p1.entersMeetingRoom();
                t.entersMeetingRoom();
                t.parentMeeting();
                float option = random.nextFloat();
                  if (option >= 0.7) {
                      System.out.println(p1.getName()+ ": I see, I didnt't know about that...I will make sure to talk to him/her at home. Thank you for letting me know. ");
                      p1.leaveMeeting();
                      s1.modifyEminence(15);
                     }
                  else if (option < 0.7 && option >= 0.4) {
                     System.out.println(p1.getName()+ ": Ah, they're children.. It is no nothing serious! ");
                     p1.leaveMeeting();
                  }
                  else {
                     System.out.println(p1.getName()+ ": What did you just say about my children?! I want to to talk to your superior about this! *Karen noises*");
                     float opt = random.nextFloat();
                     if (opt <=0.3) {
                     t.argueParent();
                     a.salaryCut();
                     t.modifySalary(-200);
                     a.exmatriculation2();
                     no_incidents +=1;
                     }
                     else {
                        t.calmParent();
                        p1.leaveMeeting();
                        t.modifySalary(200);
                     }
                     
                 }

     }
            //the nurse sceen has a 50% chance that a studnet will come to her
            float scene3 = random.nextFloat();
            if (scene3 <= 0.65) {
                System.out.println();
                a.hireStaff();
                auxw1.enterSchool();
                s1.attendsClass();
                s1.eats();
                s1.listensToTeacher();
                s1.leavesClass();
                s1.getsSick();
                
                float opt3 = random.nextFloat();
                if (opt3 <=0.15 ) {
                   auxw1.treat();
                   auxw1.callAmbulance();
                   t.callParent();
                   auxw1.modifySalary(150); //add to salary
                }
                else if (opt3 > 0.15 && opt3 <=0.5) {
                   auxw1.treat();
                   auxw1.sendHome();
                   auxw1.modifySalary(100); //add to salary
                }
                else if (opt3 > 0.5 && opt3 <= 0.65) {
                   auxw1.treat();
                   auxw1.sendToClass();
                }
                else {auxw1.ignoreStudent();
                   s1.fileReport();
                   a.organizeMeeting();
                   int opt4 = random.nextInt(1,3);
                   if (opt4 == 1) {
                       a.fireStaff();
                       auxw1.modifySalary(-150);
                   }
                   else { a.salaryCut();
                        auxw1.modifySalary(-200);}
                        no_incidents +=1;
               }
               System.out.println();
              
            }

            float scene4 = random.nextFloat();
            if (scene4 <= 0.15) {
                            System.out.println();
                            aw.enterSchool();
                            aw.cook();
                            int opt5 = random.nextInt(1,4);
                            if (opt5 ==1){
                                aw.serveFood();
                                s.eats();
                                s.satisfied();
                                aw.modifySalary(100);
                                
                            }
                            else if (opt5 == 2) {
                                aw.runOutOfIngredients();
                                aw.makeSmallerPortions();
                                aw.serveFood();
                                s.eats();
                                int opt6 = random.nextInt(1,3);
                                if (opt6 == 1){
                                    s.satisfied();
                                    aw.modifySalary(100);
                                }
                                else {
                                    s.complain();
                                    aw.sad();
                                  
                                }
                                no_incidents +=1;
                            }
                            else if (opt5 == 3){
                                aw.burnFood();
                                aw.noFoodAnnouncement();
                                s.complain();
                                aw.sad();
                                aw.modifySalary(-250);
                                no_incidents +=1;
                                
                            }
                           System.out.println();   
            }

            int curr_rep = sch.getReputation(); //current reputation of the school
            if (no_incidents == 0) {
                curr_rep = curr_rep + 2;;
            }
            else {
                curr_rep = curr_rep - no_incidents*2 + (s.getEminence()+s1.getEminence())/20; //formula for calculating reputation
            }

            System.out.println();
            System.out.println("DAY "+ dd + " STATS:");
            System.out.println(no_incidents + " incident(s) occured!");
            System.out.println(" Current eminence of student "+ s.getName() +": "+s.getEminence());
            System.out.println(" Current eminence of student "+ s1.getName() +": "+s1.getEminence());
            System.out.println(" Curent salary of teacher " + t.getName() + ": " + t.getSalary() + "$");
            System.out.println(" Curent salary of nurse " + auxw1.getName() + ": " + auxw1.getSalary() + "$");
            System.out.println(" Curent salary of cook " + aw.getName() + ": " + aw.getSalary() + "$");
            System.out.println(" Current reputation of " + sch.getName() + " : "+ curr_rep );

            wait(1500);
            dd+=1;
        }
    }
    
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
}
    }