package perseverance.li.databinding.utils;

import android.databinding.BindingAdapter;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * ---------------------------------------------------------------
 * Author: Perseverance.li
 * Create: 17-3-21 20:36
 * ---------------------------------------------------------------
 * Describe:
 * ---------------------------------------------------------------
 * Changes:
 * ---------------------------------------------------------------
 * 17-3-21 20 : Create by Perseverance.li
 * ---------------------------------------------------------------
 */

public class ImageViewAttrAdapter {

    @BindingAdapter("android:src")
    public static void setImageViewSrc(ImageView view, Bitmap bitmap) {
        view.setImageBitmap(bitmap);
    }

    @BindingAdapter("android:src")
    public static void setImageViewSrc(ImageView view, int resId) {
        view.setImageResource(resId);
    }

    @BindingAdapter({"image"})
    public static void loadImageUrl(ImageView view, String url) {
        Glide.with(view.getContext())
                .load(url)
                .into(view);
    }
}
