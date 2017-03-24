package perseverance.li.databinding.utils;

import android.databinding.BindingConversion;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ---------------------------------------------------------------
 * Author: Perseverance.li
 * Create: 17-3-24 14:10
 * ---------------------------------------------------------------
 * Describe:
 * ---------------------------------------------------------------
 * Changes:
 * ---------------------------------------------------------------
 * 17-3-24 14 : Create by Perseverance.li
 * ---------------------------------------------------------------
 */

public class OtherUtil {

    @BindingConversion
    public static String dateConvert(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        return simpleDateFormat.format(date);
    }

}
