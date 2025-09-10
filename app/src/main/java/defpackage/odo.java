package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public class odo {
    public static final int c;
    public static final odo d;

    static {
        int i = oef.c;
        c = 252010000;
        d = new odo();
    }

    public final int e(Context context) {
        return f(context, c);
    }

    public final int f(Context context, int i) throws PackageManager.NameNotFoundException {
        int iA = oef.a(context, i);
        if (oef.c(context, iA)) {
            return 18;
        }
        return iA;
    }

    public final Intent g(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && oji.e(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(c);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(ojo.b(context).i(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent(IQwwK.VkEPXIDIQufZg);
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(ImageMetadata.LENS_APERTURE);
        return intent3;
    }

    public final PendingIntent h(Context context, int i, String str) {
        Intent intentG = g(context, i, str);
        if (intentG == null) {
            return null;
        }
        return PendingIntent.getActivity(context, 0, intentG, 201326592);
    }
}
