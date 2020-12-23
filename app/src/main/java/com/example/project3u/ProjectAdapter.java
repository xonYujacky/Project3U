package com.example.project3u;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {

    private Project[] projects;

    public ProjectAdapter(Project[] projects) {
        this.projects = projects;
    }

    @Override
    public int getItemCount() {
        //return 0;
        //mengambil data sebanyak jumlah data array nya
        return projects.length;
    }
    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //layout akses
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);

        //return null;
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        //Akses project view holder
        //apapun posisi nya ambil dari array nya biisa diakses
        holder.bind(projects[position]);
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder{
        ImageView appImage;
        TextView appTitle;
        TextView appDesc;


        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_project_icon);
            appTitle = itemView.findViewById(R.id.text_view_title_app);
            appDesc = itemView.findViewById(R.id.text_view_desc_app);


        }

        public void bind(Project project) {
            //setting image dan tv
            appTitle.setText(project.name);
            appDesc.setText(project.description);
            appImage.setImageResource(project.image);
        }
    }
}
