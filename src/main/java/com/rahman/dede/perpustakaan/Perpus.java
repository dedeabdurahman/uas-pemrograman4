package com.rahman.dede.perpustakaan;

public class Perpus {
    private Integer kodeBuku;
    private String namaBuku;
    private Integer stok;
    
    public Integer getKodeBuku(){
        return kodeBuku;
    }
    
    public void setKodeBuku(Integer kodeBuku){
        this.kodeBuku = kodeBuku;
    }
    
    
    public String getNamaBuku(){
        return namaBuku;
    }
    
    public void setNamaBuku(String namaBuku){
        this.namaBuku = namaBuku;
    }
    
    
    public Integer getStok(){
        return stok;
    }
    
    public void setStok(Integer stok){
        this.stok = stok;
    }
}
