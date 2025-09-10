package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mah {
    public static final /* synthetic */ int f = 0;
    public final mba a;
    public final Context b;
    public final hbw d;
    public final hbj e;
    private final luj h;
    private final luj i;
    public final Map c = new ArrayMap();
    private final Map g = new ArrayMap();

    static {
        scn.H(maz.a.getPackageName(), maz.b.getPackageName());
    }

    public mah(mba mbaVar, Context context, hbw hbwVar, hbj hbjVar, luj lujVar, luj lujVar2) {
        this.a = mbaVar;
        this.b = context;
        this.d = hbwVar;
        this.e = hbjVar;
        this.h = lujVar;
        this.i = lujVar2;
    }

    public static String b(String str) {
        return d(str) ? "image/*" : e(str) ? "video/*" : "*/*";
    }

    public static Predicate c(Function function) {
        return new krd(new ConcurrentHashMap(), function, 5);
    }

    public static boolean d(String str) {
        return str.startsWith("image/") || ppo.a(str).b();
    }

    public static boolean e(String str) {
        return str.startsWith("video/") || ppo.a(str).c();
    }

    public final ResolveInfo f(int i) {
        mag magVar = new mag(this, i);
        ((ResolveInfo) magVar).activityInfo = new ActivityInfo();
        ((ResolveInfo) magVar).activityInfo.packageName = this.b.getPackageName();
        ((ResolveInfo) magVar).activityInfo.name = "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity";
        return magVar;
    }

    public final int g(fqb fqbVar) {
        boolean z = false;
        if (this.e.p(gzo.aK)) {
            luj lujVar = this.h;
            if (!((Boolean) lujVar.b(luf.aj)).booleanValue() && !((Boolean) lujVar.b(luf.ak)).booleanValue()) {
                Map map = this.g;
                rwc rwcVarI = rwc.i((Boolean) map.get("image/*"));
                rwc rwcVarI2 = rwc.i((Boolean) map.get("video/*"));
                if (!rwcVarI.h()) {
                    rwcVarI = rwc.j(Boolean.valueOf(this.a.f()));
                    map.put("image/*", ((rwg) rwcVarI).a);
                }
                if (!rwcVarI2.h()) {
                    rwcVarI2 = rwc.j(Boolean.valueOf(this.a.f()));
                    map.put("video/*", ((rwg) rwcVarI2).a);
                }
                if (((Boolean) rwcVarI.c()).booleanValue() || ((Boolean) rwcVarI2.c()).booleanValue()) {
                    this.i.d(luf.ah, true);
                    z = true;
                } else {
                    this.i.d(luf.ah, false);
                }
            }
        }
        if (!((Boolean) this.h.b(luf.ah)).booleanValue() || fqbVar == null) {
            return 2;
        }
        if (!z) {
            String strB = b(a(fqbVar));
            Map map2 = this.c;
            Boolean boolValueOf = (Boolean) map2.get(strB);
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(this.a.d(strB));
                map2.put(strB, boolValueOf);
            }
            if (!boolValueOf.booleanValue()) {
                return 2;
            }
        }
        return 1;
    }

    public final void h() {
        this.a.e();
        throw null;
    }

    public static String a(fqb fqbVar) {
        String strNormalizeMimeType = Intent.normalizeMimeType(fqbVar.a().i());
        if (TextUtils.isEmpty(strNormalizeMimeType)) {
            int iOrdinal = fqbVar.b().ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 5) {
                        jls jlsVarC = fqbVar.c();
                        return (jlsVarC.i || jlsVarC.g || jlsVarC.f) ? "image/*" : pAAtrB.xHv;
                    }
                } else {
                    return "video/*";
                }
            }
            return "image/*";
        }
        return strNormalizeMimeType;
    }
}
