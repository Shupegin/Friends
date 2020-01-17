package fo.friends.friends.ui.fine;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class fineViewModel extends ViewModel {

    private MutableLiveData <String> mText;

    public fineViewModel() {
        mText = new MutableLiveData <>();
        mText.setValue("This is home fragment");
    }

    public LiveData <String> getText() {
        return mText;
    }
}