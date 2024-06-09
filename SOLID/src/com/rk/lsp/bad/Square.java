package com.rk.lsp.bad;
public class Square extends Rectangle {
    @Override
    public void setLength(double width) {
        super.setLength(width);
        super.setHeight(width);
    }
    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setLength(height);
    }
}