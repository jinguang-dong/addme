package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.camera.jni.libyuv.LibyuvJni;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iob {
    public static final sgv a = sgv.g("iob");

    public final Bitmap a(Bitmap bitmap, int i) {
        int height;
        int width;
        if (bitmap == null || bitmap.isRecycled()) {
            ((sgt) a.c().M(2181)).s("Source bitmap is null or has been recycled");
            return null;
        }
        int i2 = ((i % 360) + 360) % 360;
        if (i2 == 0) {
            return bitmap;
        }
        if (i2 == 180) {
            height = bitmap.getWidth();
            width = bitmap.getHeight();
        } else {
            if (i2 != 90 && i2 != 270) {
                ((sgt) a.c().M(2183)).t("Cannot rotate bitmap by %d degrees", i);
                return null;
            }
            height = bitmap.getHeight();
            width = bitmap.getWidth();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(height, width, Bitmap.Config.ARGB_8888);
        int iNativeRotateBitmap = LibyuvJni.nativeRotateBitmap(bitmap, bitmapCreateBitmap, i2);
        if (iNativeRotateBitmap >= 0) {
            return bitmapCreateBitmap;
        }
        ((sgt) a.c().M(2182)).w(zflNUOOzDfM.NlTRxugKK, i, iNativeRotateBitmap);
        bitmapCreateBitmap.recycle();
        return null;
    }
}
