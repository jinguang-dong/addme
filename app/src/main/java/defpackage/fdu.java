package defpackage;

import android.app.Activity;
import android.util.ArrayMap;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdu {
    private static final sbp f = sbp.o("android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO");
    private static final sbp g;
    public final Activity a;
    public final out b;
    public final Map c = new ArrayMap();
    public final sbp d;
    public final luj e;

    static {
        sbp.n("android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE");
        g = sbp.m("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }

    public final boolean a(String str) {
        return this.a.checkSelfPermission(str) == 0;
    }

    final boolean b() {
        sbp sbpVar = f;
        int i = ((sex) sbpVar).c;
        int i2 = 0;
        while (i2 < i) {
            String str = (String) sbpVar.get(i2);
            Map map = this.c;
            if (map.containsKey(str)) {
                Boolean bool = (Boolean) map.get(str);
                bool.getClass();
                i2++;
                if (!bool.booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean c() {
        sbp sbpVar = g;
        int i = ((sex) sbpVar).c;
        int i2 = 0;
        while (i2 < i) {
            String str = (String) sbpVar.get(i2);
            Map map = this.c;
            if (!map.containsKey(str)) {
                map.put(str, Boolean.valueOf(a(str)));
            }
            Boolean bool = (Boolean) map.get(str);
            bool.getClass();
            i2++;
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public fdu(Activity activity, luj lujVar, out outVar, hbc hbcVar) {
        this.a = activity;
        this.e = lujVar;
        this.b = outVar;
        int i = sbp.d;
        sbk sbkVar = new sbk();
        sbkVar.j(f);
        sbkVar.j(g);
        if (hbcVar != hbc.RELEASE) {
            sbkVar.h(mPfBwqXsnpXI.OrMq);
        }
        this.d = sbkVar.g();
    }
}
