package ac.id.unikom.challenge;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private final Meter model = new Meter();

    public LiveData<String> getKilometer() {
        return model.getKilometer();
    }

    public LiveData<String> getCentimeter() {
        return model.getCentimeter();
    }

    public void calculateLength(String meterInput) {
        if (meterInput == null || meterInput.isEmpty()) {
            meterInput = "0";
        }

        double parsedMeter = Double.parseDouble(meterInput);
        model.setMeter(parsedMeter);
        model.toKilometer();
        model.toCentimeter();
    }
}
