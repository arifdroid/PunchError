package com.example.afinal.fingerPrint_Login.register.register_as_admin_setupProfile;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.afinal.fingerPrint_Login.PassResult;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;

public class Presenter_RegAdmin_asAdmin_Profile_Activity extends Observable {


    private static final int REQUEST_LOCATION_PERMISSION = 43;
    private Context mContext;
    private LocationListener mLocationLister;


    private Map<String, String> remapReturnLocation;
    private WifiInfo wifiInfo;
    private Map<String,String> returnMapWifi;
    private String wifiSSID;
    public static boolean gotWifi;
    private String wifiBSSID;

    private PassResult passResult;

    public void setPassResult(PassResult passResult){
        this.passResult = passResult;
    }

    public Presenter_RegAdmin_asAdmin_Profile_Activity(Context mContext) {
        gotWifi=false;
        remapReturnLocation = new HashMap<>();
        returnMapWifi = new HashMap<>();
        this.mContext = mContext;
    }




    @AfterPermissionGranted(REQUEST_LOCATION_PERMISSION)
    public void requestLocationPermission(LocationManager mLocationManager) {

        String[] perms = {Manifest.permission.ACCESS_FINE_LOCATION};

        if (EasyPermissions.hasPermissions(mContext, perms)) {
            //       Toast.makeText(this, "Permission already granted", Toast.LENGTH_SHORT).show();

            if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            mLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 50,
                    5, mLocationLister = new LocationListener() {
                        @Override
                        public void onLocationChanged(Location location) {

//                            Double lat = location.getLatitude();
//                            Double longitude = location.getLongitude();

                            Log.i("checkkLocation", "3");

                            setLocationReturn(location);


//                            Geocoder geocoder = new Geocoder(mContext, Locale.getDefault());

//                            try {
//
//                                Log.i("checkkLocation", "4");
//
//                               // streetName = geocoder.getFromLocation(lat, longitude, 1).get(0).getThoroughfare();
//
////                                Log.i("checkkLocation", "5 " + streetName);
////
////                                adminDetailsList.add(new AdminDetail(streetName, "drawable/ic_location_on_black_24dp"));
////                                recyclerView_Admin_Profile_Adapter.notifyDataSetChanged();
////                                recyclerView.setAdapter(recyclerView_Admin_Profile_Adapter);
////                                recyclerView_Admin_Profile_Adapter.setPassResult_checkBox_interface(new PassResult_CheckBox_Interface() {
////                                    @Override
////                                    public void passingArray(ArrayList<AdminDetail> adminDetails) {
////                                        //returned list.
////
////                                        returnAdminDetailList = adminDetails;
////                                    }
////                                });
////
////
////                                if(streetName!=null|| streetName!=""){
////
////                                    mLocationManager.removeUpdates(this);
////                                }
//
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }

                        }



                        @Override
                        public void onStatusChanged(String provider, int status, Bundle extras) {

                        }

                        @Override
                        public void onProviderEnabled(String provider) {

                        }

                        @Override
                        public void onProviderDisabled(String provider) {

                        }
                    });



        } else {

            Log.i("checkkLocation", "5");

            EasyPermissions.requestPermissions((AppCompatActivity) mContext, "Please grant the location permission", REQUEST_LOCATION_PERMISSION, perms);
        }

        return;

    }

    private void setLocationReturn(Location location) {

        if(location!=null) {

            String latitude = String.valueOf(location.getLatitude());
            String longitude = String.valueOf(location.getLongitude());

            remapReturnLocation.put("latitudeHere", latitude);
            remapReturnLocation.put("longitudeHere", longitude);

            setChanged();
            notifyObservers();

            Log.i("checkFlowData ", "9, location not null, latitud: "+latitude);

        }else {

            remapReturnLocation.put("latitudeHere", "");
            remapReturnLocation.put("longitudeHere", "");

            Log.i("checkFlowData ", "10, location null, ");
            setChanged();
            notifyObservers();

        }

        return;
    }

    public Map<String, String> getRemapReturnLocation() {

        Log.i("checkFlowData ", "11, location Map:"+remapReturnLocation);
        return remapReturnLocation;
    }

    public void getWifiNow() {

        WifiManager wifiManager = (WifiManager) mContext.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifiInfo = wifiManager.getConnectionInfo();

        if(wifiInfo!=null){

            Log.i("checkFlowData ", "12, wifiInfo not null");

           wifiSSID = wifiInfo.getSSID();
           wifiBSSID = wifiInfo.getBSSID();

            if(wifiSSID!=null) {
                returnMapWifi.put("SSID", wifiSSID);
                returnMapWifi.put("BSSID", wifiBSSID);
//
//                Log.i("checkFlowData ", "12.A, wifiInfo not null, ssid: " + wifiSSID);

                gotWifi=true;
                setChanged();
                notifyObservers();
            }

            if(wifiSSID==null){

                returnMapWifi.put("SSID", wifiSSID);
                returnMapWifi.put("BSSID", wifiBSSID);
//
                gotWifi=false;
                setChanged();
                notifyObservers();

            }


        }else {

//
//            returnMapWifi.put("SSID","");
//            returnMapWifi.put("BSSID","");
//
//            Log.i("checkFlowData ", "13, wifiInfo null");
//            setChanged();
//            notifyObservers();
        }

    }
//
//    public void stopWifiListening(WifiManager wifiManager){
//        wifiManager.
//    }

    public Map<String,String> getwifiResult(){
        if(returnMapWifi.size()>0) {
            return returnMapWifi;
        }
        return null;
    }

    public boolean getReturnMapWifi() {

        if(wifiSSID!=null) {
            Log.i("checkFlowData ", "14, wifiMap: " + returnMapWifi);


            return gotWifi;
        }

        return false;
    }


    public void stopListening(LocationManager mLocationManager) {

        mLocationManager.removeUpdates(mLocationLister);
        return;

    }
}
