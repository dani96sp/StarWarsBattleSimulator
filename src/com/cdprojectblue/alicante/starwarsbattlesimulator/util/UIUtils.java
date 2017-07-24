package com.cdprojectblue.alicante.starwarsbattlesimulator.util;

import com.cdprojectblue.alicante.starwarsbattlesimulator.modelo.enums.Faction;

public class UIUtils {

    public static void printEmpireHeader() {
        printHeader(Faction.EMPIRE.name());
    }

    public static void printRebelHeader() {
        printHeader(Faction.REBELS.name());
    }

    private static void printHeader(final String factionName) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*************************************").append("\n");
        stringBuilder.append("********** ").append(factionName.toUpperCase()).append(" *******************").append("\n");
        stringBuilder.append("*************************************").append("\n");
        System.out.println(stringBuilder.toString());
    }
}
