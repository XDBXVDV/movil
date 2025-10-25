package com.example.proyectgps.services;


import com.example.proyectgps.model.Ubicacion;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseService {
    private DatabaseReference dbRef;

    public FirebaseService() {
        dbRef = FirebaseDatabase.getInstance().getReference("ubicaciones");
    }

    public void guardarUbicacion(String usuarioId, Ubicacion ubicacion) {
        dbRef.child(usuarioId).setValue(ubicacion);
    }
}
