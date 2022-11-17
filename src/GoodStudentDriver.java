class GoodStudentDriver
{
    public static void main(String[] args)
    {
        //Instantiation of Reference Class objects
        GoodStudent student1 = new GoodStudent("Alan", "Turing", 191254, 3.56, true);
        GoodStudent student2 = new GoodStudent("Florence", "Nightingale", 182010, 3.89, false);
        GoodStudent student3 = new GoodStudent("Grace", "Hopper", 190692, 3.99, true);

        student2.setID(95366);
        student2.setGPA(3.92);

        System.out.println("\n" + student1.toString());
        System.out.println("Florence's ID: " + student2.getID());
        System.out.println("Florence's GPA: " + student2.getGPA());
        System.out.println("Florence's CS status: "+ student2.getCSStudent());
        System.out.println("Grace's first name: " + student3.getFirstName());
        System.out.println("Grace's CS status: " + student3.getCSStudent());

        System.out.println("Alan's digital ID: " + student1.digitalID());
        System.out.println("Florence's digital ID: " + student2.digitalID());
        System.out.println("Grace's digital ID: " + student3.digitalID());

        System.out.println("\nAlan's new GPA: " + student1.CSGPA());
        System.out.println("Florence's GPA: " + student2.CSGPA());
        System.out.println("Grace's new GPA: " + student3.CSGPA());

    }
}