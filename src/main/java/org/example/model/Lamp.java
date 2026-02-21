package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {

    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    // ✅ TESTİN BEKLEDİĞİ (hata mesajında geçen)
    public int getGlobRating() {
        return globRating;
    }

    // ✅ README’de yanlış/alternatif yazım olma ihtimaline karşı ekstra
    public int getGlobalRating() {
        return globRating;
    }
}