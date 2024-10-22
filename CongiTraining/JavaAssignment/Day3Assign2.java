package JavaAssignment;

class Day3Assign2 {

    public int add(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }

    public static void main( String[] args ) {
    	Day3Assign2 ex = new Day3Assign2();

        int sum2 = ex.add(2, 4);
        System.out.println("sum2 = " + sum2);

        int sum3 = ex.add(1, 3, 5);
        System.out.println("sum3 = " + sum3);

        int sum4 = ex.add(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4);
    }
}