package nyc.c4q.inclassexercisesretrofit;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.inclassexercisesretrofit.Model.Dog;

/**
 * Created by c4q on 12/17/17.
 */

class DogAdapter extends RecyclerView.Adapter<DogAdapter.DogViewHolder> {

    private List<String> dogList;
    private LayoutInflater layoutInflater;
    private Context context;

    public DogAdapter(List<String> dogList, Context context) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.dogList = dogList;
    }


    @Override
    public DogViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.card_view, parent, false);
        DogViewHolder viewHolder = new DogViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DogViewHolder holder, int position) {
        Picasso.with(context).load(dogList.get(position)).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return dogList.size();
    }

    public static class DogViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public DogViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.card_view_image);
        }
    }
}
