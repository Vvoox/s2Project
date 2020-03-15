package com.example.testx.Models;

public class AvantangeNat {

    private String type_AvantgeN;
    private String specification_AvgN ;

    public String getType_AvantgeN() {
        return type_AvantgeN;

    }

    public void setType_AvantgeN(String type_AvantgeN) {
        this.type_AvantgeN = type_AvantgeN;
    }

    public String getSpecification_AvgN() {
        return specification_AvgN;
    }

    public void setSpecification_AvgN(String specification_AvgN) {
        this.specification_AvgN = specification_AvgN;
    }

    @Override
    public String toString() {
        return "AvantangeNat{" +
                "type_AvantgeN='" + type_AvantgeN + '\'' +
                ", specification_AvgN='" + specification_AvgN + '\'' +
                '}';
    }
}
