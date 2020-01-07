/*
 * *
 * Felipe.Rodrigues
 * Software Architect
 *
 */

package br.com.felipe.enums;


public enum PaymentStatus {

    PENDING(1, "Pendente"),

    CONFIRMED(2, "Confirmado"),

    CANCELLED(3, "Cancelado");

    private int code;
    private String descritpion;

    PaymentStatus(int code, String descritpion) {
        this.code = code;
        this.descritpion = descritpion;
    }


    private static PaymentStatus toEnum(Integer code) {
        if (code == null) {
            return null;
        }

        for (PaymentStatus x : PaymentStatus.values()) {
            if (code.equals(x.getCode())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Payment code invalid !");
    }

    public int getCode() {
        return code;
    }

    public String getDescritpion() {
        return descritpion;
    }
}
