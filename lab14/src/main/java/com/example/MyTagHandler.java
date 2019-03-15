package com.example;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTagHandler extends SimpleTagSupport {


    String color;
    String size;
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        Date dNow= new Date();
        SimpleDateFormat ft= new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ssa zzz");
        if (color != null)
            out.write(String.format("<span style='color: %s; font-size: %s;'>%s</span>", color, size,ft.format(dNow)));

    }
    public void setColor(String Color) {
        this.color = Color;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
