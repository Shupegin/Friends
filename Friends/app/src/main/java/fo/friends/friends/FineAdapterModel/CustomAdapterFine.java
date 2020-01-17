package fo.friends.friends.FineAdapterModel;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import fo.friends.friends.R;

public class CustomAdapterFine extends RecyclerView.Adapter <RecyclerView.ViewHolder> {

    private List <ModelDocuments> CustomAdapterList = new ArrayList <>();



    public  CustomAdapterFine (){



    }
    @Override
    public int getItemCount() {
        return CustomAdapterList.size();
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fine_fine, parent ,false);
        holder = new MyViewHolder(view);

        return holder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {


        final CustomAdapterFine.MyViewHolder vaultItemHolder = (CustomAdapterFine.MyViewHolder) holder;




    }



    class MyViewHolder extends RecyclerView.ViewHolder{


        TextView textRestorationName;





        public MyViewHolder (View itemView) {
            super(itemView);




        }

    }
}
