package Exercise06_June2019;
/*-----------------------------------------------
|               June 2019 – CSC435              |
|                       Part B                  |
|                      Question 2               |
------------------------------------------------*/
public class Tourist {
    private String touristName;
    private int touristID;
    private String countryFrom;
    private String countryRegion;
    private boolean touristType; // true = in group, false = individual

    }
    // normal constructor
    // accessors: getName, getID, getCountryFrom, getCountryRegion, getTouristType
    //toString() and determineDiscount()
}

//(a) Write the definition of the following methods:
//i) Normal constructor (initialize all data members)
    public Tourist(String name, int id, String countryFrom, String countryRegion, boolean type) {
        this.touristName = name;
        this.touristID = id;
        this.countryFrom = countryFrom;
        this.countryRegion = countryRegion;
        this.touristType = type;
    }
//ii) Printer method using toString()
    public String toString() {
        String typeString = touristType ? "Group Tourist" : "Individual Tourist";
        return "Tourist Name: " + touristName + "\n" +
               "Tourist ID: " + touristID + "\n" +
               "Country From: " + countryFrom + "\n" +
               "Country Region: " + countryRegion + "\n" +
               "Tourist Type: " + typeString;
    }
//iii) Processor method determineDiscount() (return discount rate). If individual tourist, discount is 5%. If in group tourist, discount is 10%.
    public double determineDiscount() {
        if (touristType) {
            return 0.10; // Group tourist gets 10% discount
        } else {
            return 0.05; // Individual tourist gets 5% discount
        }
    }
//(b) Assume data saved in an array of objects named tourList
//(b)(i) Count and display number of individual tourists from China
    public static void displayIndividualTouristsFromChina(Tourist[] tourList) {
        int count = 0;

        for (int i = 0; i < tourList.length; i++) {
            if (tourList[i].getTouristType() == false &&
                tourList[i].getCountryFrom().equalsIgnoreCase("China")) {
                count++;
            }
        }

        System.out.println("Number of individual tourists from China: " + count);

    }
//(b)(ii) Display information of tourists in Europe region
for (int i = 0; i < tourList.length; i++) {
    if (tourList[i].getCountryRegion().equalsIgnoreCase("Europe")) {
        System.out.println(tourList[i].toString());
        System.out.println("--------------------");
    }
}
