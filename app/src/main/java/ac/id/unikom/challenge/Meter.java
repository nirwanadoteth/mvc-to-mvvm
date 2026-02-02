package ac.id.unikom.challenge;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class Meter {

    private double meter;

    private MutableLiveData<String> kilometer;
    private MutableLiveData<String> centimeter;

    public Meter() {
        this.meter = 0;
        this.kilometer = new MutableLiveData<>();
        this.centimeter = new MutableLiveData<>();
    }

    public LiveData<String> getKilometer() {
        return kilometer;
    }

    public LiveData<String> getCentimeter() {
        return centimeter;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public void toKilometer() {
        double kilometer =  meter / 1000;
        this.kilometer.postValue(kilometer + "");
    }

    public void toCentimeter() {
        double centimeter =  meter * 100;
        this.centimeter.postValue(centimeter + "");
    }
}
