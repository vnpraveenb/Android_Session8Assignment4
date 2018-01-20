package com.praveen.session8assignment4;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by Praveen on 20/01/2018.
 */

public class AndroidOSInfo {
    Integer androidOSImageId;
    String androidOSName;

    public AndroidOSInfo(Integer androidOSImageId, String androidOSName) {
        this.androidOSImageId = androidOSImageId;
        this.androidOSName = androidOSName;
    }

    public Integer getAndroidOSImageId() {
        return androidOSImageId;
    }

    public void setAndroidOSImageId(Integer androidOSImageId) {
        this.androidOSImageId = androidOSImageId;
    }

    public String getAndroidOSName() {
        return androidOSName;
    }

    public void setAndroidOSName(String androidOSName) {
        this.androidOSName = androidOSName;
    }


}
