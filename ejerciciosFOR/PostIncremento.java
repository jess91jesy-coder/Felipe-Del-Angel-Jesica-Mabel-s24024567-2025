public class PostIncremento {
    public static void main(String [] args ){
        int variable = 100;
        System.out.println("Valor original de la variable=" + variable);
    	int postIncrement = variable ++; // postIncremento = 100, VARIABLE = 101
        	 System.out.println("postincremento=" + postIncrement);
		 System.out.println("variable =" + variable+ "\n");
        	 System.out.println("postIncrement++ = " + postIncrement++);
        	 System.out.println("postIncrement++ = " + postIncrement++);
        	 System.out.println("postIncrement++ = " + postIncrement++);
       		 System.out.println("\nposIncrement=" + postIncrement);

    }

}