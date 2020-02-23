package com.example.projectpi;

public class model {

    private int image;
    private String jenis;


    public model(int image, String jenis ) {
        this.image = image;
        this.jenis = jenis;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }


}
