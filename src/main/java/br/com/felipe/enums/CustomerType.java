package br.com.felipe.enums;

public enum CustomerType {
    PHYSICALPERSON(1, "Pessoa Fisica"),
    LEGALPERSON(2, "Pessoa Juridica");

    private int cod;
    private String description;

    CustomerType(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public static CustomerType toEnum(Integer code) {
        if (code == null) {
            return null;
        }
        for (CustomerType x : CustomerType.values()) {
            if (code.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("invalid id for type of person");
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }
}
