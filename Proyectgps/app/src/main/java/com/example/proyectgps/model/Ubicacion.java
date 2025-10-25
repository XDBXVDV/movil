package com.example.proyectgps.model;

public class Ubicacion {
    private double latitud;
    private double longitud;
    private long timestamp;

    public Ubicacion() {}

    public Ubicacion(double latitud, double longitud, long timestamp) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.timestamp = timestamp;
    }

    public double getLatitud() { return latitud; }
    public double getLongitud() { return longitud; }
    public long getTimestamp() { return timestamp; }

    public void setLatitud(double latitud) { this.latitud = latitud; }
    public void setLongitud(double longitud) { this.longitud = longitud; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
}
