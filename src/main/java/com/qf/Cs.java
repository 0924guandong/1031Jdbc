package com.qf;

public class Cs {

    private Integer sno;
    private Integer cno;
    private Integer cj;

    @Override
    public String toString() {
        return "Cs{" +
                "sno=" + sno +
                ", cno=" + cno +
                ", cj=" + cj +
                '}';
    }

    public Cs() {
    }

    public Cs(Integer sno, Integer cno, Integer cj) {
        this.sno = sno;
        this.cno = cno;
        this.cj = cj;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public Integer getCj() {
        return cj;
    }

    public void setCj(Integer cj) {
        this.cj = cj;
    }
}
