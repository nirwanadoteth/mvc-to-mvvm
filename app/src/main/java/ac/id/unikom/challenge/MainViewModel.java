package ac.id.unikom.challenge;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<String> kilometer = new MutableLiveData<>();
    private final MutableLiveData<String> centimeter = new MutableLiveData<>();

    public LiveData<String> getKilometer() {
        return kilometer;
    }

    public LiveData<String> getCentimeter() {
        return centimeter;
    }

    public void calculateLength(String meterInput) {
        if (meterInput == null || meterInput.isEmpty()) {
            meterInput = "0";
        }

        double parsedMeter = Double.parseDouble(meterInput);
        
        double kilometerValue = parsedMeter / 1000;
        kilometer.setValue(String.valueOf(kilometerValue));
        
        double centimeterValue = parsedMeter * 100;
        centimeter.setValue(String.valueOf(centimeterValue));
    }
}
