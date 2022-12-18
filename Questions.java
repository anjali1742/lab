package Mcq;
import java.util.*;


public class Questions 
{
	
		static Students1 student = new Students1();
		static Test1 t1 = new Test1();
		static Test2 t2 = new Test2();
		
		public static void GkQuestions() {
			
			Options op = new Options();
			Question q = new Question();
			System.out.println("MCQ's on Indian State capitals, All the best...");
			System.out.println();
			String s = new String(" What is the capital of Andhra Pradesh?");
			//setting string as key and answer(charecter) as value
			q.setQuestion(s);
			q.setAnswer('A');
			//putting options into hashmap
			op.options.put('A', "Vijayawada");
			op.options.put('B', "Srikakulam");
			op.options.put('C', "Nellore");
			op.options.put('D', "Tirupati");
			//putting (questions,answer) and options as keys and options as values
			t1.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" What is the capital of Arunachal Pradesh?");
			q.setQuestion(s);
			q.setAnswer('C');
			op.options.put('A', "Daporijo");
			op.options.put('B', "Siang");
			op.options.put('C', "Itanagar");
			op.options.put('D', "Tawang");
			t1.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" What is the capital of Assam?");
			q.setQuestion(s);
			q.setAnswer('C');
			op.options.put('A', "Sonitpur");
			op.options.put('B', "Silvasagar");
			op.options.put('C', "Dispur");
			op.options.put('D', "Lakhimpur");
			t1.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" What is the capital of Bihar?");
			q.setQuestion(s);
			q.setAnswer('A');
			op.options.put('A', "Patna");
			op.options.put('B', "Bhojpur");
			op.options.put('C', "Muzaffarpur");
			op.options.put('D', "Buxar");
			t1.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" What is the capital of Chattisgarh?");
			q.setQuestion(s);
			q.setAnswer('C');
			op.options.put('A', "Dantewada");
			op.options.put('B', "Bilaspur");
			op.options.put('C', "Raipur");
			op.options.put('D', "Durg");
			t1.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" What is the capital of Goa?");
			q.setQuestion(s);
			q.setAnswer('D');
			op.options.put('A', "Valpoi");
			op.options.put('B', "Ponda");
			op.options.put('C', "Margao");
			op.options.put('D', "Panaji");
			t1.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" What is the capital of Gujarat?");
			q.setQuestion(s);
			q.setAnswer('D');
			op.options.put('A', "Rajkot");
			op.options.put('B', "Ahmedabad");
			op.options.put('C', "Porbandar");
			op.options.put('D', "Gandhinagar");
			t1.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" What is the capital of Haryana?");
			q.setQuestion(s);
			q.setAnswer('A');
			op.options.put('A', "Chandigarh");
			op.options.put('B', "Hissar");
			op.options.put('C', "Fatehabad");
			op.options.put('D', "Gurgaon");
			t1.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" What is the capital of Kerala?");
			q.setQuestion(s);
			q.setAnswer('B');
			op.options.put('A', "Malappuram");
			op.options.put('B', "Thiruvananthapuram");
			op.options.put('C', "Kollam");
			op.options.put('D', "Ernakulam");
			t1.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" What is the capital of Mizoram?");
			q.setQuestion(s);
			q.setAnswer('D');
			op.options.put('A', "Mamit");
			op.options.put('B', "Saiha");
			op.options.put('C', "Kolasib");
			op.options.put('D', "Aizwal");
			t1.subject.put(q, op);
			int i=1, marks=0;
			for(Map.Entry<Question, Options> entry: t1.subject.entrySet()){  
				Scanner sc = new Scanner(System.in);
		        Question key=entry.getKey();  
		        Options b=entry.getValue();  
		        System.out.println(i+") "+key.getQuestion());
		        for(Map.Entry<Character, String> options : b.options.entrySet()) {
		        	System.out.println("\t"+options.getKey()+". "+options.getValue());
		        }
		        System.out.print("Enter your choice :");
		        char ch =sc.next().charAt(0);
		        key.setChosenAnswer(ch);
		        if(key.getChosenAnswer() == key.getAnswer()) {
		        	System.out.println("Correct Answer\n");
		        	key.setMarks(1);
		        	marks++;
		        }
		        else {
		        	System.out.println("Wrong Answer\n");
		        }
		        student.setGkMarks(marks);
		        i++;
		    }  
		}

		public static void mathsQuestions() {
			
			Options op = new Options();
			Question q = new Question();
			System.out.println("MCQ's on Mathematics, All the best...");
			System.out.println();
			String s = new String(" 1 acre is equal to ________square foot?");
			//setting string as key and answer(charecter) as value
			q.setQuestion(s);
			q.setAnswer('D');
			//putting options into hashmap
			op.options.put('A', "45434 square foot");
			op.options.put('B', "34343 square foot");
			op.options.put('C', "43572 square foot");
			op.options.put('D', "43560 square foot ");
			//putting (questions,answer) and options as keys and options as values
			t2.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" Who is the father of mathematics?");
			q.setQuestion(s);
			q.setAnswer('C');
			op.options.put('A', "Aryabhatta");
			op.options.put('B', "Brahmagupta");
			op.options.put('C', "Archimedes");
			op.options.put('D', "Srinivasa Ramanujan");
			t2.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" What is the Sum of First 70 even Numbers?");
			q.setQuestion(s);
			q.setAnswer('A');
			op.options.put('A', "4970");
			op.options.put('B', "4950");
			op.options.put('C', "4900");
			op.options.put('D', "4980");
			t2.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String("  What is the Sum of First 70 odd Numbers?");
			q.setQuestion(s);
			q.setAnswer('B');
			op.options.put('A', "4970");
			op.options.put('B', "4900");
			op.options.put('C', "4960");
			op.options.put('D', "4980");
			t2.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" Find the Missing Number in the series 1, 6, 13, 22, 33 ?");
			q.setQuestion(s);
			q.setAnswer('C');
			op.options.put('A', "36");
			op.options.put('B', "40");
			op.options.put('C', "46");
			op.options.put('D', "52");
			t2.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" One Gross is equal to___________?");
			q.setQuestion(s);
			q.setAnswer('C');
			op.options.put('A', "5 Dozen");
			op.options.put('B', "10 Dozen");
			op.options.put('C', "12 Dozen");
			op.options.put('D', "8 Dozen");
			t2.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" A Quadrillion has _________ zeros?");
			q.setQuestion(s);
			q.setAnswer('A');
			op.options.put('A', "15");
			op.options.put('B', "18");
			op.options.put('C', "21");
			op.options.put('D', "12");
			t2.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" Who is known as the Father of Geometry?");
			q.setQuestion(s);
			q.setAnswer('B');
			op.options.put('A', "Kepler");
			op.options.put('B', "Euclid");
			op.options.put('C', "Pythagoras");
			op.options.put('D', "Newton");
			t2.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" The length of a rectangular increased by 10% and it;s breadth is decreased by 10 %. Then the area of the new rectangle is_________");
			q.setQuestion(s);
			q.setAnswer('C');
			op.options.put('A', "Neither increased nor decreased");
			op.options.put('B', "Increased by 1%");
			op.options.put('C', "Decreased by 1%");
			op.options.put('D', "Decreased by 10%");
			t2.subject.put(q, op);
			
			op = new Options();
			q = new Question();
			s = new String(" If 12 members family spend Rs. 850 in 10 days. Then a family of 8 people will spend Rs. 340 in how many days?");
			q.setQuestion(s);
			q.setAnswer('C');
			op.options.put('A', "8");
			op.options.put('B', "7");
			op.options.put('C', "6");
			op.options.put('D', "5");
			t2.subject.put(q, op);
			int i=1, marks=0;
			for(Map.Entry<Question, Options> entry: t2.subject.entrySet()){  
				Scanner sc = new Scanner(System.in);
		        Question key=entry.getKey();  
		        Options b=entry.getValue();  
		        System.out.println(i+") "+key.getQuestion());
		        for(Map.Entry<Character, String> options : b.options.entrySet()) {
		        	System.out.println("\t"+options.getKey()+". "+options.getValue());
		        }
		        System.out.print("Enter your choice :");
		        char ch =sc.next().charAt(0);
		        key.setChosenAnswer(ch);
		        if(key.getChosenAnswer() == key.getAnswer()) {
		        	System.out.println("Correct Answer\n");
		        	key.setMarks(1);
		        	marks++;
		        }
		        else {
		        	System.out.println("Wrong Answer\n");
		        }
		        student.setMathsMarks(marks);
		        i++;
		    }  
		}
		
		public static void printKeyPaper() {
			int i=1;
			String str1, str2, str3;
			System.out.println("------------------ Capitals on India key paper ------------");
			for(Map.Entry<Question, Options> entry: t1.subject.entrySet()){  
		        Question key=entry.getKey();  
		        Options b=entry.getValue();  
		        str1 = String.format("%20s", i++ +") Correct Answer :");
		        str2 = String.format("%20s", "Chosen Answer :");
		        str3 = String.format("%20s", "Marks Awarded :");
		        System.out.println(str1 + key.getAnswer() + str2 + key.getChosenAnswer() +str3 + key.getMarks());
		    } 
			System.out.println("\n------------------ Mathematics key paper ------------------");
			i=1;
			for(Map.Entry<Question, Options> entry: t2.subject.entrySet()){  
		        Question key=entry.getKey();  
		        Options b=entry.getValue();  
		        str1 = String.format("%20s", i++ +") Correct Answer :");
		        str2 = String.format("%20s", "Chosen Answer :");
		        str3 = String.format("%20s", "Marks Awarded :");
		        System.out.println(str1 + key.getAnswer() + str2 + key.getChosenAnswer() + str3 + key.getMarks());
		    } 
		}
	}

