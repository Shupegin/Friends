package fo.friends.friends.FineAdapterModel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import fo.friends.friends.R;

public class CustomAdapterDocuments extends RecyclerView.Adapter <RecyclerView.ViewHolder> {

        private List<ModelDocuments> CustomAdapterList = new ArrayList<>();



    public  CustomAdapterDocuments (){



    }
    @Override
    public int getItemCount() {
        return CustomAdapterList.size();
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.documents_fine, parent ,false);
        holder = new MyViewHolder(view);

        return holder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {


        final CustomAdapterDocuments.MyViewHolder vaultItemHolder = (CustomAdapterDocuments.MyViewHolder) holder;




    }



    class MyViewHolder extends RecyclerView.ViewHolder{


        TextView textRestorationName;





        public MyViewHolder (View itemView) {
            super(itemView);




        }

    }
}
