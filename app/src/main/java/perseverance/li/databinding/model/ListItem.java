package perseverance.li.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import perseverance.li.databinding.BR;

/**
 * ---------------------------------------------------------------
 * Author: Perseverance.li
 * Create: 17-3-23 16:02
 * ---------------------------------------------------------------
 * Describe:
 * ---------------------------------------------------------------
 * Changes:
 * ---------------------------------------------------------------
 * 17-3-23 16 : Create by Perseverance.li
 * ---------------------------------------------------------------
 */

public class ListItem extends BaseObservable {

    private String shopName;
    private String shopAddr;
    private String shopLogoUrl;

    @Bindable
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
        notifyPropertyChanged(BR.shopName);
    }

    @Bindable
    public String getShopAddr() {
        return shopAddr;
    }

    public void setShopAddr(String shopAddr) {
        this.shopAddr = shopAddr;
        notifyPropertyChanged(BR.shopAddr);
    }

    @Bindable
    public String getShopLogoUrl() {
        return shopLogoUrl;
    }

    public void setShopLogoUrl(String shopLogoUrl) {
        this.shopLogoUrl = shopLogoUrl;
        notifyPropertyChanged(BR.shopLogoUrl);
    }
}
