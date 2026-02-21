package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        // 1) Önce parçaları oluştur
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(250, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 4, 60, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 85);
        Wardrobe wardrobe = new Wardrobe(200, 220, 80.5);
        Carpet carpet = new Carpet(300, 200, PaintColor.GREEN);

        // 2) Bedroom oluştur
        Bedroom bedroom = new Bedroom(
                "Master Bedroom",
                wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet
        );

        // 3) Getter ile erişim (değerlere ulaşabiliyor musun?)
        System.out.println("Bedroom name: " + bedroom.getName());
        System.out.println("Wall1 direction: " + bedroom.getWall1().getDirection());
        System.out.println("Ceiling height: " + bedroom.getCeiling().getHeight());
        System.out.println("Carpet color: " + bedroom.getCarpet().getColor());
        System.out.println("Lamp style: " + bedroom.getLamp().getStyle());
        System.out.println("Lamp rating: " + bedroom.getLamp().getGlobalRating());

        // 4) Metod çağrıları
        bedroom.getWall1().create();
        bedroom.getWall2().create();
        bedroom.getWall3().create();
        bedroom.getWall4().create();
        bedroom.getCeiling().create();

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
    }
}