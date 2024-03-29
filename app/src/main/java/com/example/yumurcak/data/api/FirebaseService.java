package com.example.yumurcak.data.api;

import androidx.annotation.NonNull;

import com.example.yumurcak.data.model.Blog;
import com.example.yumurcak.data.model.Event;
import com.example.yumurcak.data.model.Notification;
import com.example.yumurcak.utils.IResponseListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class FirebaseService {

    private final FirebaseFirestore db = FirebaseFirestore.getInstance();
    public final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    public void getEventList(IResponseListener<List<Event>> responseListener) {
        List<Event> events = new ArrayList<>();

        db.collection("event").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                for (DocumentSnapshot document : task.getResult()) {
                    Event event=document.toObject(Event.class);
                    events.add(event);
                }
                responseListener.OnResponse(events);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                responseListener.OnError(e.getMessage());
            }
        });
    }

    public void getBlogList(IResponseListener<List<Blog>> responseListener) {
        List<Blog> bloglist = new ArrayList<>();
        db.collection("blog").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                for (DocumentSnapshot document : task.getResult()) {
                    Blog blog=document.toObject(Blog.class);
                    bloglist.add(blog);
                }
                responseListener.OnResponse(bloglist);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                responseListener.OnError(e.getMessage());
            }
        });
    }

    public void getNotificationList(IResponseListener<List<Notification>> responseListener) {
        List<Notification> notificationList = new ArrayList<>();
        db.collection("event").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                for (DocumentSnapshot document : task.getResult()) {
                    notificationList.add(document.toObject(Notification.class));
                }

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                responseListener.OnError(e.getMessage());
            }
        });
    }
}
