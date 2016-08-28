package com.andrios.welcomehome;

import java.util.ArrayList;

/**
 * Created by Corey on 8/27/2016.
 * This class builds all required datasets etc.
 */
public class AndriosData {

    private ArrayList<Location> schools;
    private ArrayList<Location> churches;
    private ArrayList<Location> parks;
    private ArrayList<Location> groceries;

    public AndriosData(){
        schools = makeSchools();
        churches = makeChurches();
        parks = makeParks();
        groceries = makeGrocerie();

    }

    //TODO: Get Data for Schools
    private ArrayList<Location> makeSchools() {

        ArrayList<Location> builder = new ArrayList<>();

        //String name, String address, String hours, String locationType, String phoneNumber, int imageIcon, int imagePoster

        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_icon, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Otay Ranch Academy of the Arts", "1615 Mater Dei Dr.", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "8774384451", R.drawable.otay_ranch_academy_arts_icon, R.drawable.otay_ranch_academy_arts_icon));
        builder.add(new Location ("Corky McMillin Elementary School", "1201 Santa Cora Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6193970103", R.drawable.corky_mcmillan_icon, R.drawable.corky_mcmillan_poster));
        builder.add(new Location ("High Tech High", "1945 Hunte Pkwy", "Chula Vista", "CA" , "91915",  "School Hours",
                "School", "6199512500", R.drawable.high_tech_high_icon, R.drawable.high_tech_high_poster));
        builder.add(new Location ("Mater Dei Catholic High School", "1615 Mater Dei Dr.", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6194232121", R.drawable.mater_dei_icon, R.drawable.mater_dei_poster));
        builder.add(new Location ("Olympian High School", "1925 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6196562400", R.drawable.olympian_icon, R.drawable.olympian_poster));
        return builder;
    }

    //TODO: Get data for Churches
    private ArrayList<Location> makeChurches() {

        ArrayList<Location> builder = new ArrayList<>();

        //String name, String address, String hours, String locationType, String phoneNumber, int imageIcon, int imagePoster

        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_icon, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Otay Ranch Academy of the Arts", "1615 Mater Dei Dr.", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.otay_ranch_academy_arts_icon, R.drawable.otay_ranch_academy_arts_icon));
        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));

        return builder;
    }

    //TODO: Get data for Parks
    private ArrayList<Location> makeParks() {

        ArrayList<Location> builder = new ArrayList<>();

        //String name, String address, String hours, String locationType, String phoneNumber, int imageIcon, int imagePoster

        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));

        return builder;
    }

    //TODO: Get data for Grocerie Stores
    private ArrayList<Location> makeGrocerie() {

        ArrayList<Location> builder = new ArrayList<>();

        //String name, String address, String hours, String locationType, String phoneNumber, int imageIcon, int imagePoster

        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_icon, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Otay Ranch Academy of the Arts", "1615 Mater Dei Dr.", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.otay_ranch_academy_arts_icon, R.drawable.otay_ranch_academy_arts_icon));
        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));
        builder.add(new Location ("Veterans Elementary School", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.veterans_elementary_poster, R.drawable.veterans_elementary_poster));
        return builder;
    }

    public ArrayList<Location> getSchools() {return schools;}

    public ArrayList<Location> getChurches() {
        return churches;
    }

    public ArrayList<Location> getParks() {
        return parks;
    }

    public ArrayList<Location> getGroceries() {
        return groceries;
    }
}
