package com.andrios.welcomehome;

import android.content.Context;

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
    private Context mContext;


    public AndriosData(Context context){
        mContext = context;
        schools = makeSchools();
        churches = makeChurches();
        parks = makeParks();
        groceries = makeGrocery();


    }

    //TODO: Get Data for Schools
    private ArrayList<Location> makeSchools() {

        ArrayList<Location> builder = new ArrayList<>();

        //String name, String address, String hours, String locationType, String phoneNumber, int imageIcon, int imagePoster


        builder.add(new Location (
                mContext.getString(R.string.school_name_veterans),
                mContext.getString(R.string.school_address_veterans),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca),
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_school_hours),
                mContext.getString(R.string.label_school),
                mContext.getString(R.string.school_phone_veterans),
                R.drawable.veterans_elementary_icon,
                R.drawable.veterans_elementary_poster));
        builder.add(new Location (
                mContext.getString(R.string.school_name_academy_of_art),
                mContext.getString(R.string.school_address_academy_of_arts),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca),
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_school_hours),
                mContext.getString(R.string.label_school),
                mContext.getString(R.string.school_phone_academy_of_arts),
                R.drawable.otay_ranch_academy_arts_icon,
                R.drawable.otay_ranch_academy_arts_icon));
        builder.add(new Location (
                mContext.getString(R.string.school_name_corky),
                mContext.getString(R.string.school_address_corky),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca),
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_school_hours),
                mContext.getString(R.string.label_school),
                mContext.getString(R.string.school_phone_corky),
                R.drawable.corky_mcmillan_icon,
                R.drawable.corky_mcmillan_poster));
        builder.add(new Location (
                mContext.getString(R.string.school_name_high_tech),
                mContext.getString(R.string.school_address_high_tech),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_school_hours),
                mContext.getString(R.string.label_school),
                mContext.getString(R.string.school_phone_high_tech),
                R.drawable.high_tech_high_icon,
                R.drawable.high_tech_high_poster));
        builder.add(new Location (
                mContext.getString(R.string.school_name_mater_dei),
                mContext.getString(R.string.school_address_mater_dei),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_school_hours),
                mContext.getString(R.string.label_school),
                mContext.getString(R.string.school_phone_mater_dei),
                R.drawable.mater_dei_icon, R.drawable.mater_dei_poster));
        builder.add(new Location (
                mContext.getString(R.string.school_name_olympian),
                mContext.getString(R.string.school_address_olympian),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_school_hours),
                mContext.getString(R.string.label_school),
                mContext.getString(R.string.school_phone_olympian),
                R.drawable.olympian_icon, R.drawable.olympian_poster));
        return builder;
    }

    //TODO: Get data for Churches
    private ArrayList<Location> makeChurches() {

        ArrayList<Location> builder = new ArrayList<>();

        //String name, String address, String hours, String locationType, String phoneNumber, int imageIcon, int imagePoster

        builder.add(new Location (
                mContext.getString(R.string.church_name_mater_dei),
                mContext.getString(R.string.church_address_mater_dei),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_church_hours),
                mContext.getString(R.string.label_church),
                mContext.getString(R.string.church_phone_mater_dei),
                R.drawable.church_mater_dei_icon,
                R.drawable.church_mater_dei_poster));
        builder.add(new Location (
                mContext.getString(R.string.church_name_calvary),
                mContext.getString(R.string.church_address_calvary),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_church_hours),
                mContext.getString(R.string.label_church),
                mContext.getString(R.string.church_phone_calvary),
                R.drawable.church_calvary_icon,
                R.drawable.church_calvary_poster));
        builder.add(new Location (
                mContext.getString(R.string.church_name_eastlake),
                mContext.getString(R.string.church_address_eastlake),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_church_hours),
                mContext.getString(R.string.label_church),
                mContext.getString(R.string.church_phone_eastlake),
                R.drawable.church_eastlake_icon,
                R.drawable.church_eastlake_poster));
        builder.add(new Location (
                mContext.getString(R.string.church_name_concordia),
                mContext.getString(R.string.church_address_concordia),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_church_hours),
                mContext.getString(R.string.label_church),
                mContext.getString(R.string.church_phone_concordia),
                R.drawable.church_concordia_icon,
                R.drawable.church_concordia_poster));
        builder.add(new Location (
                mContext.getString(R.string.church_name_shalom),
                mContext.getString(R.string.church_address_shalom),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_church_hours),
                mContext.getString(R.string.label_church),
                mContext.getString(R.string.church_phone_shalom),
                R.drawable.church_temple_beth_shalom_icon,
                R.drawable.church_temple_beth_shalom_poster));

        return builder;
    }

    //TODO: Get data for Parks
    private ArrayList<Location> makeParks() {

        ArrayList<Location> builder = new ArrayList<>();

        //String name, String address, String hours, String locationType, String phoneNumber, int imageIcon, int imagePoster

        builder.add(new Location (
                mContext.getString(R.string.park_name_venetia),
                mContext.getString(R.string.park_address_venetia),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_park_hours),
                mContext.getString(R.string.label_park),
                mContext.getString(R.string.park_phone_venetia),
                R.drawable.park_santa_venetia_poster));
        builder.add(new Location (
                mContext.getString(R.string.park_name_seasons),
                mContext.getString(R.string.park_address_seasons),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_park_hours),
                mContext.getString(R.string.label_park),
                mContext.getString(R.string.park_phone_seasons),
                R.drawable.park_all_seasons_poster));
        builder.add(new Location (
                mContext.getString(R.string.park_name_harvest),
                mContext.getString(R.string.park_address_harvest),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_park_hours),
                mContext.getString(R.string.label_park),
                mContext.getString(R.string.park_phone_harvest),
                R.drawable.park_harvest_poster));
        builder.add(new Location (
                mContext.getString(R.string.park_name_cottenwood),
                mContext.getString(R.string.park_address_cottenwood),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_park_hours),
                mContext.getString(R.string.label_park),
                mContext.getString(R.string.park_phone_cottenwood),
                R.drawable.park_cottonwood_poster));
        builder.add(new Location (
                mContext.getString(R.string.park_name_sunset),
                mContext.getString(R.string.park_address_sunset),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_park_hours),
                mContext.getString(R.string.label_park),
                mContext.getString(R.string.park_phone_sunset),
                R.drawable.park_sunset_view_poster));
        builder.add(new Location (
                mContext.getString(R.string.park_name_community),
                mContext.getString(R.string.park_address_community),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_park_hours),
                mContext.getString(R.string.label_park),
                mContext.getString(R.string.park_phone_community),
                R.drawable.park_chula_vista_community_poster));

        return builder;
    }

    //TODO: Get data for Grocerie Stores
    private ArrayList<Location> makeGrocery() {

        ArrayList<Location> builder = new ArrayList<>();

        //String name, String address, String hours, String locationType, String phoneNumber, int imageIcon, int imagePoster

        builder.add(new Location (
                mContext.getString(R.string.store_name_vons),
                mContext.getString(R.string.store_address_vons),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_store_hours),
                mContext.getString(R.string.label_store),
                mContext.getString(R.string.store_phone_vons),
                R.drawable.grocery_vons_icon,
                R.drawable.grocery_vons_poster));
        builder.add(new Location (
                mContext.getString(R.string.store_name_walmart),
                mContext.getString(R.string.store_address_walmart),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_store_hours),
                mContext.getString(R.string.label_store),
                mContext.getString(R.string.store_phone_walmart),
                R.drawable.grocery_walmart_icon,
                R.drawable.grocery_walmart_poster));
        builder.add(new Location (
                mContext.getString(R.string.store_name_pinoy),
                mContext.getString(R.string.pinoy),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_store_hours),
                mContext.getString(R.string.label_store),
                mContext.getString(R.string.store_phone_pinoy),
                R.drawable.grocery_jnc_icon,
                R.drawable.grocery_jnc_poster));
        builder.add(new Location (
                mContext.getString(R.string.store_name_safeway),
                mContext.getString(R.string.store_address_safeway),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_store_hours),
                mContext.getString(R.string.label_store),
                mContext.getString(R.string.store_phone_safeay),
                R.drawable.grocery_safeway_icon,
                R.drawable.grocery_safeway_poster));
        builder.add(new Location (
                mContext.getString(R.string.store_name_sprouts),
                mContext.getString(R.string.store_address_safeay),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_store_hours),
                mContext.getString(R.string.label_store),
                mContext.getString(R.string.store_phone_safeway),
                R.drawable.grocery_sprouts_icon,
                R.drawable.grocery_sprouts_poster));
        builder.add(new Location (
                mContext.getString(R.string.store_name_ralphs),
                mContext.getString(R.string.store_address_ralphs),
                mContext.getString(R.string.city_chula_vista),
                mContext.getString(R.string.state_ca) ,
                mContext.getString(R.string.zip_91913),
                mContext.getString(R.string.label_store_hours),
                mContext.getString(R.string.label_store),
                mContext.getString(R.string.store_phone_ralphs),
                R.drawable.grocery_ralphs_icon,
                R.drawable.grocery_ralphs_poster));
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
