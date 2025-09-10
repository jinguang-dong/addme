package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdx {
    public static final jdw a;
    private static final sgv b = sgv.g("jdx");
    private static final Map c;

    static {
        HashMap map = new HashMap();
        c = map;
        c("LGE", "hammerhead", new jdw(-1.0f, true));
        c("LGE", "g3", new jdw(-1.0f, true));
        c("LGE", "b1", new jdw(-1.0f, true));
        c("LGE", "b1w", new jdw(-1.0f, true));
        c("HTC", "m7", new jdw(56.69f, false));
        c("HTC", "m7cdtu", new jdw(56.69f, false));
        c("HTC", "m7cdug", new jdw(56.69f, false));
        c("HTC", "m7cdwg", new jdw(56.69f, false));
        c("HTC", "m7wls", new jdw(56.69f, false));
        c("HTC", "m7wlv", new jdw(56.69f, false));
        c("motorola", "ghost", new jdw(53.0f, false));
        c("Default", "", new jdw(-1.0f, false));
        String str = (("Brand : '" + Build.BRAND + "' ") + "Manufacturer : '" + Build.MANUFACTURER + "' ") + "Device : '" + Build.DEVICE + "' ";
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Model : '");
        sb.append(str2);
        sb.append("' ");
        String str3 = Build.HARDWARE;
        map.containsKey(b());
        jdw jdwVar = (jdw) map.get(b());
        if (jdwVar == null) {
            jdwVar = (jdw) map.get("Default");
        }
        a = jdwVar;
    }

    public static float a(float f) {
        float f2 = a.a;
        if (f2 > 0.0f) {
            return f2;
        }
        if (f <= 160.0f) {
            return f;
        }
        ((sgt) b.c().M(2701)).v("Reported FOV is larger than the maximum allowed at : %g", Float.valueOf(f));
        return 55.0f;
    }

    private static String b() {
        return String.valueOf(Build.MANUFACTURER).concat(String.valueOf(Build.DEVICE));
    }

    private static void c(String str, String str2, jdw jdwVar) {
        c.put(str.concat(str2), jdwVar);
    }
}
