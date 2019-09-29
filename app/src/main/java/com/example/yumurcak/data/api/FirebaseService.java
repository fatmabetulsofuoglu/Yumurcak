package com.example.yumurcak.data.api;

import android.support.annotation.NonNull;

import com.example.yumurcak.data.model.Event;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class FirebaseService {

    //private final FirebaseFirestore db = FirebaseFirestore.getInstance();
    private final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    List<Event> getEventList(){
       /* DocumentReference user = db.collection("PhoneBook").document("Contacts");
        user.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    StringBuilder fields = new StringBuilder("");
                    fields.append("Name: ").append(doc.get("Name"));
                    fields.append("\nEmail: ").append(doc.get("Email"));
                    fields.append("\nPhone: ").append(doc.get("Phone"));
                    textDisplay.setText(fields.toString());
                }
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });*/
        return null;
    }

}
