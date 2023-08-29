// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Patterns {
    public static void main(String[] args) 
    {
    	//1st
        System.out.println("\n1\n");
        for(int i=0;i<=3;i++){
            for(int j=0;j<=4;j++)
            {
                if((j==0) || (i==0)  || i==3 || j==4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        
        //2nd
        System.out.println("\n2\n");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        //3rd
        System.out.println("\n3\n");
        for(int i=1;i<=5;i++){
        	for(int sp=1;sp<=5-i;sp++){
				System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                	System.out.print("*");
            }
            System.out.println();
        }
        
        //4th
        System.out.println("\n4\n");
        for(int i=1;i<=5;i++){
        		
            for(int j=1;j<=i;j++){
            	int s=5-i;
                String st=" ";
            	if(j==1)
                	System.out.print(st.repeat(s)+"* ");
                else 
                	System.out.print("* ");
            }
            System.out.println();
        }
        
        //5th
        System.out.println("\n5\n");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //6th
        System.out.println("\n6\n");
        for(int i=5;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print(i-j+" ");
            }
            System.out.println();
        }
        //7th
        System.out.println("\n7\n");
        int c=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c++ +" ");
            }
            System.out.println();
        }
        //8th brute force approach
        System.out.println("\n8\n");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0 && j==1)
                    System.out.print("1 ");
                if(i%2==0 && j==1)
                    System.out.print("0 ");
                if(j!=1){
                if(i%2==0 && j%2==0)
                    System.out.print("1 ");
                if(i%2==0 && j%2!=0)
                    System.out.print("0 ");
                if(i%2!=0 && j%2==0)
                    System.out.print("0 ");
                if(i%2!=0 && j%2!=0)
                    System.out.print("1 ");
                    }
            }
            System.out.println();
        }
        
        //8th optimum soln
        System.out.println("\n8\n");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }System.out.println();
        }
        //9th
        System.out.println("\n9\n");
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            int sp=10-i-j+1;
            String st=" ";
            System.out.print(st.repeat(sp));
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            int sp=10-i-j+1;
            String st=" ";
            System.out.print(st.repeat(sp));
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //10th
        System.out.println("\n10\n");
        for(i=1;i<=5;i++){
            int s=5-i;
            String sp=" ";
            System.out.print(sp.repeat(s));
            for(j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        //11th
        System.out.println("\n11\n");
        for(i=1;i<=5;i++){
            int s=5-i;
            String sp=" ";
            System.out.print(sp.repeat(s));
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        //12th
        System.out.println("\n12\n");
        for(i=1;i<=5;i++){
            int s=5-i;
            String sp=" ";
            System.out.print(sp.repeat(s));
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            for(j=2;j<=i;j++){
            System.out.print(j);
            }
            System.out.println();
        }
         
        //13th
        System.out.println("\n13\n");
        for(i=1;i<=5;i++){
            int s=5-i;
            String st=" ";
            System.out.print(st.repeat(s));
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
        for(i=5;i>=1;i--){
            int s=5-i;
            String st=" ";
            System.out.print(st.repeat(s));
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
        
    }
}
