package project1.assigntask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    ArrayList<String> names;
    ArrayList<String> tasks;
    Context context;

    public MyAdapter(Context ctx, ArrayList<String> s1, ArrayList<String> s2){
        context = ctx;
        names = s1;
        tasks = s2;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_layout, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.namesView.setText(names.get(position));
        holder.imageView.setImageResource(R.drawable.ic_baseline_arrow_back_24);
        holder.tasksView.setText(tasks.get(position));

    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView namesView, tasksView;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            namesView = itemView.findViewById(R.id.names_row);
            imageView = itemView.findViewById(R.id.imageView);

            tasksView = itemView.findViewById(R.id.taskRow);
        }
    }
}
