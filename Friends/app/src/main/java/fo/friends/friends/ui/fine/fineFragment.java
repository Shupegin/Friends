package fo.friends.friends.ui.fine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import fo.friends.friends.R;

public class fineFragment extends Fragment {

    private fineViewModel homeViewModel;
    private RecyclerView recyclerViewfind;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(fineViewModel.class);
        View root = inflater.inflate(R.layout.fragment_fine, container, false);

        recyclerViewfind = root.findViewById(R.id.recycler_items_documents);
//        homeViewModel.getText().observe(this, new Observer <String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//
//            }
//        });
        return root;
    }
}