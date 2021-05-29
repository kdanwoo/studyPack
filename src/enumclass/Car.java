package enumclass;

import jdk.nashorn.internal.objects.annotations.Getter;

public enum Car {
    SORENTO(10000,"RV"),
    SANTAFE(11000,"RV"),
    AVANTE(6000,"SEDAN"),
    CORANDO(8000,"RV");
    private int value;
    private String type;

    private Car(int value, String type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
