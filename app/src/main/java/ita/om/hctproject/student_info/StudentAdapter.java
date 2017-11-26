package ita.om.hctproject.student_info;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ita.om.hctproject.R;

/**
 * Created by sasmob on 11/26/2017.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder>{
    ArrayList<Student_Info> student;
    Context context;

    public StudentAdapter(ArrayList<Student_Info> student, Context context) {
        this.student = student;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= (LayoutInflater) context.
      getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
                 Student_Info student_info= student.get(position);
        holder.name.setText(student_info.getName());
        holder.imagestudent.setImageResource(student_info.getStudent_image());
    }

    @Override
    public int getItemCount() {
        return student.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView imagestudent;

        public ViewHolder(View itemView) {
            super(itemView);
          name = (TextView) itemView.findViewById(R.id.name);
          imagestudent=(ImageView) itemView.findViewById(R.id.image);
        }
    }
}
