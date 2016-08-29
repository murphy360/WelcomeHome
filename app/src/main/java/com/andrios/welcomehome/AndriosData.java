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
        groceries = makeGrocery();

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

        builder.add(new Location ("Mater Dei Parish", "1571 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "Church", "6196563735", R.drawable.church_mater_dei_icon, R.drawable.church_mater_dei_poster));
        builder.add(new Location ("Calvary Chapel", "1771 E Palomar St", "Chula Vista", "CA" , "91913",  "School Hours",
                "Church", "6194211100", R.drawable.church_calvary_icon, R.drawable.church_calvary_poster));
        builder.add(new Location ("Eastlake Church", "1550 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "Church", "6194214100", R.drawable.church_eastlake_icon, R.drawable.church_eastlake_poster));
        builder.add(new Location ("Concordia Church", "1695 Discovery Falls Dr.", "Chula Vista", "CA" , "91915",  "School Hours",
                "School", "6196568100", R.drawable.church_concordia_icon, R.drawable.church_concordia_poster));
        builder.add(new Location ("Temple Beth Shalom", "208 Madrona St.", "Chula Vista", "CA" , "91910",  "School Hours",
                "School", "6194206040", R.drawable.church_temple_beth_shalom_icon, R.drawable.church_temple_beth_shalom_poster));

        return builder;
    }

    //TODO: Get data for Parks
    private ArrayList<Location> makeParks() {

        ArrayList<Location> builder = new ArrayList<>();

        //String name, String address, String hours, String locationType, String phoneNumber, int imageIcon, int imagePoster

        builder.add(new Location ("Santa Venetia Park", "1500 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "Park", "None", R.drawable.park_santa_venetia_poster));
        builder.add(new Location ("All Seasons Park", "1825 Magdalena Ave", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.park_all_seasons_poster));
        builder.add(new Location ("Harvest Park", "1550 E Palomar St", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.park_harvest_poster));
        builder.add(new Location ("Cottonwood Park", "1778 E Palomar St", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.park_cottonwood_poster));
        builder.add(new Location ("Sunset View Park", " ", "Chula Vista", "CA" , "91913",  "School Hours",
                "School", "6192161226", R.drawable.park_sunset_view_poster));
        builder.add(new Location ("Chula Vista Community Park", "1060 Eastlake Pkwy", "Chula Vista", "CA" , "91915",  "School Hours",
                "School", "6192161226", R.drawable.park_chula_vista_community_poster));

        return builder;
    }

    //TODO: Get data for Grocerie Stores
    private ArrayList<Location> makeGrocery() {

        ArrayList<Location> builder = new ArrayList<>();

        //String name, String address, String hours, String locationType, String phoneNumber, int imageIcon, int imagePoster

        builder.add(new Location ("Vons", "1745 Eastlake Pkwy", "Chula Vista", "CA" , "91915",  "School Hours",
                "Grocery", "6193973467", R.drawable.grocery_vons_icon, R.drawable.grocery_vons_poster));
        builder.add(new Location ("Walmart Supercenter", "1360 Eastlake Pkwy", "Chula Vista", "CA" , "91915",  "School Hours",
                "Grocery", "6194213140", R.drawable.grocery_walmart_icon, R.drawable.grocery_walmart_poster));
        builder.add(new Location ("JNC Pinoy Foodmart", "943  Otay Lakes Rd.", "Chula Vista", "CA" , "91913",  "School Hours",
                "Grocery", "6194211090", R.drawable.grocery_jnc_icon, R.drawable.grocery_jnc_poster));
        builder.add(new Location ("Safeway", "1745 Eastlake Pkwy", "Chula Vista", "CA" , "91915",  "6AM-12AM",
                "Grocery", "6193973467", R.drawable.grocery_safeway_icon, R.drawable.grocery_safeway_poster));
        builder.add(new Location ("Sprouts Farmers Marker", "878 Eastlake Pkwy", "Chula Vista", "CA" , "91914",  "7AM-9PM",
                "Grocery", "6194212099", R.drawable.grocery_sprouts_icon, R.drawable.grocery_sprouts_poster));
        builder.add(new Location ("Ralphs Grocery", "780 Otay Lakes Rd", "Chula Vista", "CA" , "91910",  "6AM-12AM",
                "Grocery", "6194214822", R.drawable.grocery_ralphs_icon, R.drawable.grocery_ralphs_poster));
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
