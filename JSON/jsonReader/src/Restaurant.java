import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaor
 */
public class Restaurant {
    public String name;
    public String addr;
    public String contact;
    public float rating;
    public String foto;
    public String price;
    public ArrayList<String> comments;
    public ArrayList<String> cousine;
    public int index;
    
    public Restaurant(String n, String ad, String ct, String rt, String ft, String p, ArrayList<String> cmt, ArrayList<String> cout, int id) {
        name = n;
        addr = ad;
        contact = ct;
        rating = Float.parseFloat(rt);
        foto = ft;
        price = p;
        comments = cmt;
        cousine = cout;
        index = id;
    }
}