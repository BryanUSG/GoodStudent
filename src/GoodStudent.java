import java.text.DecimalFormat;
public class GoodStudent
{
    //Instance variables
    private String firstName;
    private String lastName;
    private int ID;
    private double GPA;
    private boolean CSStudent;

    //Constructors
    public GoodStudent(String firstName, String lastName, int ID, double GPA, boolean CSStudent)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.GPA = GPA;
        this.CSStudent = CSStudent;
    } //end full constructor

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String myFirstName)
    {
        firstName = myFirstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String myLastName)
    {
        lastName = myLastName;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int myID)
    {
        ID = myID;
    }

    public double getGPA()
    {
        return GPA;
    }

    public void setGPA(double myGPA)
    {
        GPA = myGPA;
    }

    public boolean getCSStudent()
    {
        return CSStudent;
    }

    public void setCSStudent(boolean myCSStudent)
    {
        CSStudent = myCSStudent;
    }

    //Brain methods
    public String digitalID()
    {
        String firstLetter = firstName.substring(0,1);
        firstLetter = firstLetter.toLowerCase();
        String lowerCaseLastName = lastName.toLowerCase();
        int lastThreeofID = ID % 1000;

        return firstLetter + lowerCaseLastName + lastThreeofID;
    }

    public double CSGPA()
    {
        DecimalFormat fmt = new DecimalFormat("0.##");
        if(CSStudent == true)
        {
            return Double.parseDouble(fmt.format(GPA * 0.15 + GPA));
        }
        return GPA;
    }

    public String toString()
    {
        String output = firstName + " " +lastName +
                "\nID: " + ID +
                "\nGPA: " + GPA +
                "\nCS status: " + CSStudent;
        return output;
    }
}
