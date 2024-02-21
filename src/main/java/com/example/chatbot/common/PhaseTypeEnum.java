package com.example.chatbot.common;

public enum PhaseTypeEnum {

    PR("Pr", 1),
    PL("Pl", 2),
    D("D", 3),
    A("A", 4),
    C("C", 5);

    private String label;
    private int id;


    private PhaseTypeEnum(String label, int id) {
        this.label = label;
        this.id = id;
    }


    public String getLabel() {
        return label;
    }

    public int getId() {
        return id;
    }

    /**
     * 値を取得
     * @param id
     * @return
     */
    public static String getVauleById(int id) {

        for( PhaseTypeEnum e : PhaseTypeEnum.values() ) { //拡張for文による走査
            if( e.getId() == id ) {
                return e.label;
            }
        }
        return null;
    }

    /**
     * idを取得
     * @param id
     * @return
     */
    public static Integer getIdByLabel(String label) {

        for( PhaseTypeEnum e : PhaseTypeEnum.values() ) { //拡張for文による走査
            if( e.getLabel() == label ) {
                return e.id;
            }
        }
        return null;
    }
}
