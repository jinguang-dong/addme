package defpackage;

import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyk {
    public static final gzi a;
    public static final gzi b;
    public static final gzi c;
    public static final gzi d;
    public static final gzi e;
    public static final gzi f;
    public static final gzi g;

    public static void a(hbj hbjVar) {
        hbjVar.d(a, 0);
        hbjVar.d(b, 2000);
        hbjVar.d(c, 1500);
        hbjVar.d(d, 2032);
        hbjVar.d(e, 1536);
        hbjVar.d(f, 2016);
        hbjVar.d(g, 1512);
    }

    static {
        gzh gzhVar = new gzh();
        gzhVar.b = "camera.binned_row_start";
        a = gzhVar.a();
        gzh gzhVar2 = new gzh();
        gzhVar2.b = "camera.uw_binned_raw_width";
        b = gzhVar2.a();
        gzh gzhVar3 = new gzh();
        gzhVar3.b = "camera.uw_binned_raw_height";
        c = gzhVar3.a();
        gzh gzhVar4 = new gzh();
        gzhVar4.b = "camera.wide_binned_raw_width";
        d = gzhVar4.a();
        gzh gzhVar5 = new gzh();
        gzhVar5.b = "camera.wide_binned_raw_height";
        e = gzhVar5.a();
        gzh gzhVar6 = new gzh();
        gzhVar6.b = "camera.tele_binned_raw_width";
        f = gzhVar6.a();
        gzh gzhVar7 = new gzh();
        gzhVar7.b = KsvNaXS.NXhxklxulVpA;
        g = gzhVar7.a();
    }
}
