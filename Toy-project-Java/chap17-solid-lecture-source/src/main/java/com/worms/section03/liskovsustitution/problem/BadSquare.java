package com.worms.section03.liskovsustitution.problem;

public class BadSquare extends BadRectangle{
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);  // LSP
    }
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);  // LSP
    }
}
