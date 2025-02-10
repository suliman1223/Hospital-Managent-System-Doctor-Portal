
package hospitalgui;

import java.util.ArrayList;


public class Billing {
int pateintID;
ArrayList<Integer>medicineID;
String recommendations,Date;
int fee;

    public Billing() {
this.pateintID=0;
this.medicineID=new ArrayList<>();
this.recommendations="";
this.Date="";
this.fee=0;
    }

    public int getPateintID() {
        return pateintID;
    }

    public void setPateintID(int pateintID) {
        this.pateintID = pateintID;
    }

    public ArrayList<Integer> getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(int medicineID) {
        this.medicineID.add(medicineID);
    }


    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    

}
