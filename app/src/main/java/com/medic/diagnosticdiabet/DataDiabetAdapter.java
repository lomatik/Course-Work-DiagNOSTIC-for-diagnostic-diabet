package com.medic.diagnosticdiabet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataDiabetAdapter extends RecyclerView.Adapter<DataDiabetAdapter.MyHolder> {
    Context context;
    List<DatabaseDiabet> patients;
    public DataDiabetAdapter(Context context, List<DatabaseDiabet> patients) {
        this.patients = patients;
        this.context = context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.patient_item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        DatabaseDiabet temp = patients.get(position);
        holder.SurnamePatient_textview.setText(temp.SurnamePatient);
        holder.venoznakrovdoeat_textview.setText(String.valueOf(temp.venoznakrovdoeat));
        holder.id_textview.setText(String.valueOf(temp.id));
        holder.venoznakrovposleeat_textview.setText(String.valueOf(temp.venoznakrovposleeat));
        holder.venoznaplazmadoleeat_textview.setText(String.valueOf(temp.venoznaplazmadoleeat));
        holder.venoznaplazmaposleeat_textview.setText(String.valueOf(temp.venoznaplazmaposleeat));
        holder.kapilarnaplazmadoleeat_textview.setText(String.valueOf(temp.kapilarnaplazmadoleeat));
        holder.kapilarnaplazmaposleeat_textview.setText(String.valueOf(temp.kapilarnaplazmaposleeat));
        holder.diabetdetectedtype_textview.setText(String.valueOf(temp.diabetdetectedtype));
    }

    @Override
    public int getItemCount() {
        return patients.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{
        TextView SurnamePatient_textview;
        TextView venoznakrovdoeat_textview;
        TextView id_textview;
        TextView venoznakrovposleeat_textview;
        TextView venoznaplazmadoleeat_textview;
        TextView venoznaplazmaposleeat_textview;
        TextView kapilarnaplazmadoleeat_textview;
        TextView kapilarnaplazmaposleeat_textview;
        TextView diabetdetectedtype_textview;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            SurnamePatient_textview = itemView.findViewById(R.id.textViewshowsurname);
            venoznakrovdoeat_textview = itemView.findViewById(R.id.textViewshow1_1);
            id_textview = itemView.findViewById(R.id.textViewshowid);
            venoznakrovposleeat_textview = itemView.findViewById(R.id.textViewshow1_2);
            venoznaplazmadoleeat_textview = itemView.findViewById(R.id.textViewshow2_1);
            venoznaplazmaposleeat_textview = itemView.findViewById(R.id.textViewshow2_2);
            kapilarnaplazmadoleeat_textview = itemView.findViewById(R.id.textViewshow3_1);
            kapilarnaplazmaposleeat_textview = itemView.findViewById(R.id.textViewshow3_2);
            diabetdetectedtype_textview = itemView.findViewById(R.id.textViewshowresult);
        }
    }
}
