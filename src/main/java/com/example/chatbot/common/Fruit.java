package com.example.chatbot.common;

public enum Fruit {

    APPLE("りんご", 1),
    ORANGE("オレンジ", 2),
    PEACH("もも", 3);

    private String label;
    private int id;


    private Fruit(String label, int id) {
        this.label = label;
        this.id = id;
    }


    public String getLabel() {
        return label;
    }

    public int getId() {
        return id;
    }

    public static String getVauleById(int id) {

        for( Fruit flt : Fruit.values() ) { //拡張for文による走査
            if( flt.getId() == id ) {
                return flt.label;                 //条件に一致するインスタンスを返す
            }
        }
        return null;
    }
}
