package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        // Walls
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        // Ceiling
        Ceiling ceiling = new Ceiling(12, PaintColor.WHITE);

        // Bed
        Bed bed = new Bed("Modern", 2, 3, 1, 1);

        // Lamp
        Lamp lamp = new Lamp(LampType.NEON, true, 75);

        // Wardrobe
        Wardrobe wardrobe = new Wardrobe(80, 190, 120.5);

        // Carpet
        Carpet carpet = new Carpet(200, 300, PaintColor.GREEN);

        // Bedroom (Composition)
        Bedroom bedroom = new Bedroom(
                "Seray's Bedroom",
                wall1, wall2, wall3, wall4,
                ceiling,
                bed,
                lamp,
                wardrobe,
                carpet
        );

        // --- Access values via getters ---
        System.out.println("Bedroom name: " + bedroom.getName());

        System.out.println("Wall1 direction: " + bedroom.getWall1().getDirection());
        System.out.println("Wall2 direction: " + bedroom.getWall2().getDirection());
        System.out.println("Wall3 direction: " + bedroom.getWall3().getDirection());
        System.out.println("Wall4 direction: " + bedroom.getWall4().getDirection());

        System.out.println("Ceiling height: " + bedroom.getCeiling().getHeight());
        System.out.println("Ceiling color: " + bedroom.getCeiling().getColor());

        System.out.println("Bed style: " + bedroom.getBed().getStyle());
        System.out.println("Bed pillows: " + bedroom.getBed().getPillows());
        System.out.println("Bed height: " + bedroom.getBed().getHeight());
        System.out.println("Bed sheets: " + bedroom.getBed().getSheets());
        System.out.println("Bed quilts: " + bedroom.getBed().getQuilts());

        System.out.println("Lamp style: " + bedroom.getLamp().getStyle());
        System.out.println("Lamp is battery: " + bedroom.getLamp().isBattery());
        System.out.println("Lamp glob rating: " + bedroom.getLamp().getGlobRating()); // ✅ test uyumlu

        System.out.println("Wardrobe width: " + bedroom.getWardrobe().getWidth());
        System.out.println("Wardrobe height: " + bedroom.getWardrobe().getHeight());
        System.out.println("Wardrobe weight: " + bedroom.getWardrobe().getWeight());

        System.out.println("Carpet width: " + bedroom.getCarpet().getWidth());
        System.out.println("Carpet height: " + bedroom.getCarpet().getHeight());
        System.out.println("Carpet color: " + bedroom.getCarpet().getColor());

        // --- Call methods ---
        wall1.create();
        wall2.create();
        wall3.create();
        wall4.create();

        ceiling.create();
        bed.make();
        lamp.turnOn();
        wardrobe.add();
        carpet.lying();
    }
}