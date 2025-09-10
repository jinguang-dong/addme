package defpackage;

import android.util.Log;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twr {
    public static ArrayList a = null;
    public static final List b;
    private static final String c = "twr";

    private twr() {
    }

    static {
        Float fValueOf = Float.valueOf(441.74f);
        Float fValueOf2 = Float.valueOf(0.004f);
        Float fValueOf3 = Float.valueOf(537.57f);
        Float fValueOf4 = Float.valueOf(522.63f);
        Float fValueOf5 = Float.valueOf(0.0038f);
        b = Arrays.asList(new twq("Micromax", null, "4560MMX", null, 217.0f, 217.0f), new twq("HTC", "endeavoru", "HTC One X", null, 312.0f, 312.0f), new twq("samsung", null, "SM-G920P", null, 575.0f, 575.0f), new twq("samsung", null, "SM-G930", null, 581.0f, 580.0f), new twq("samsung", null, "SM-G9300", null, 581.0f, 580.0f), new twq("samsung", null, "SM-G930A", null, 581.0f, 580.0f), new twq("samsung", null, "SM-G930F", null, 581.0f, 580.0f), new twq("samsung", null, "SM-G930P", null, 581.0f, 580.0f), new twq("samsung", null, "SM-G930R4", null, 581.0f, 580.0f), new twq("samsung", null, "SM-G930T", null, 581.0f, 580.0f), new twq("samsung", null, "SM-G930V", null, 581.0f, 580.0f), new twq("samsung", null, "SM-G930W8", null, 581.0f, 580.0f), new twq("samsung", null, "SM-N915FY", null, 541.0f, 541.0f), new twq("samsung", null, "SM-N915A", null, 541.0f, 541.0f), new twq("samsung", null, "SM-N915T", null, 541.0f, 541.0f), new twq("samsung", null, "SM-N915K", null, 541.0f, 541.0f), new twq("samsung", null, "SM-N915T", null, 541.0f, 541.0f), new twq("samsung", null, "SM-N915G", null, 541.0f, 541.0f), new twq("samsung", null, "SM-N915D", null, 541.0f, 541.0f), new twq("BLU", "BLU", "Studio 5.0 HD LTE", "qcom", 294.0f, 294.0f), new twq(VnmwoBe.jFmZDStBK, "A0001", "A0001", "bacon", 401.0f, 401.0f), new twq("THL", "THL", "thl 5000", "mt6592", 441.0f, 441.0f), new twq("Google", "sailfish", "Pixel", "sailfish", fValueOf, fValueOf, fValueOf2), new twq("Google", "marlin", "Pixel XL", "marlin", fValueOf3, fValueOf3, fValueOf2), new twq("Google", oUZhwRhE.erSohhjTtV, null, "walleye", fValueOf, fValueOf, fValueOf2), new twq("Google", "taimen", null, "taimen", null, null, Float.valueOf(0.0046f)), new twq("Google", "21c8b5470a64adbb25bc84316cbc449361d86839", null, null, fValueOf4, fValueOf4, fValueOf5), new twq("Google", "6e2c7e24b7c7eae9fc94882c9f31befa00594872", null, null, null, null, fValueOf5), new twq("LGE", UvOvSgfD.GCUVuOfMh, null, "joan", null, null, fValueOf5), new twq("LGE", "e44046539bb5b584279553ca6eacca937c8e16cf", null, null, null, null, fValueOf5), new twq("Lenovo", "vega", null, "vega", 537.388f, 537.882f));
    }

    public static String a(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            int length = bArrDigest.length;
            StringBuilder sb = new StringBuilder(length + length);
            for (byte b2 : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
            return sb.toString();
        } catch (GeneralSecurityException unused) {
            Log.e(c, PNlJufQ.AWYpwEpzNBckEIx);
            return str;
        }
    }
}
