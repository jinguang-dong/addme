package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyg {
    public static final gzi a;
    public static final gzg b;
    public static final gzg c;
    public static final gzg d;
    public static final gzg e;
    public static final gzg f;
    public static final gzg g;
    public static final gzg h;
    public static final gzg i;
    public static final gzg j;
    public static final gzg k;

    static {
        gzh gzhVar = new gzh();
        gzhVar.b = "camera.advice";
        b = gzhVar.f();
        gzh gzhVar2 = new gzh();
        gzhVar2.b = "camera.advice.dirtylens";
        c = gzhVar2.i();
        gzh gzhVar3 = new gzh();
        gzhVar3.b = "camera.advice.dld_force";
        d = gzhVar3.i();
        gzh gzhVar4 = new gzh();
        gzhVar4.b = "camera.advice.distance";
        e = gzhVar4.f();
        gzh gzhVar5 = new gzh();
        gzhVar5.b = "advice_total_exposure_threshold_front";
        f = gzhVar5.h();
        gzh gzhVar6 = new gzh();
        gzhVar6.b = "advice_total_exposure_threshold_rear";
        g = gzhVar6.h();
        gzh gzhVar7 = new gzh();
        gzhVar7.b = "dirty_lens_detector_timeout";
        a = gzhVar7.a();
        gzh gzhVar8 = new gzh();
        gzhVar8.b = "camera.advice.dld_log";
        gzhVar8.o();
        gzh gzhVar9 = new gzh();
        gzhVar9.b = "camera.advice.dld_fast";
        h = gzhVar9.i();
        gzh gzhVar10 = new gzh();
        gzhVar10.b = "camera.advice.dld_v2";
        i = gzhVar10.i();
        gzh gzhVar11 = new gzh();
        gzhVar11.b = "camera.advice.dld_frame_meta";
        j = gzhVar11.i();
        gzh gzhVar12 = new gzh();
        gzhVar12.b = "camera.advice.dld_fg_run";
        k = gzhVar12.i();
    }

    public static void a(hbj hbjVar) {
        hbjVar.i(b);
        hbjVar.l(c, true);
        hbjVar.l(d, false);
        hbjVar.i(e);
        gzg gzgVar = f;
        Float fValueOf = Float.valueOf(Float.POSITIVE_INFINITY);
        hbjVar.k(gzgVar, fValueOf);
        hbjVar.k(g, fValueOf);
        hbjVar.d(a, 15000);
        hbjVar.l(h, false);
        hbjVar.l(i, false);
        hbjVar.l(j, false);
        hbjVar.l(k, true);
    }
}
