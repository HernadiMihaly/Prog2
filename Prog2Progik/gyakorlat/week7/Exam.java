enum Grades{
    FAIL, PASS, SATISFACTORY, GOOD, EXCELLENT;

    }

class Grading{
    java.util.Random rand= new java.util.Random();

    Grades giveGrade(){
        int prob= (rand.nextInt(100));

        if (prob<30){
            return Grades.FAIL;
        }
        else if (prob<50){
            return Grades.PASS;
        }
        else if (prob<80){
            return Grades.SATISFACTORY;
        }
        else if (prob<90){
            return Grades.GOOD;
        }
        else{
            return Grades.EXCELLENT;
        }

    }
}

class Exam{

        static void commit(Grades result){
            switch(result){
                case FAIL:
                    System.out.println("FAIL");
                
                case PASS:
                    System.out.println("PASS");
                
                case SATISFACTORY:
                    System.out.println("SATISFACT");
                
                case GOOD:
                    System.out.println("GOOD");
                
                case EXCELLENT:
                    System.out.println("Excellent!!");
                
            }
        }
                public static void main(String args[]){
                    Grading grade= new Grading();

                    commit(grade.giveGrade());
                } 
}

