package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gys {
    public static final gzi a;
    public static final gzg b;
    public static final gzg c;
    public static final gzg d;

    static {
        gzh gzhVar = new gzh();
        gzhVar.b = "camera.radius";
        b = gzhVar.h();
        gzh gzhVar2 = new gzh();
        gzhVar2.b = "camera.indicator_radius";
        c = gzhVar2.h();
        gzh gzhVar3 = new gzh();
        gzhVar3.b = "camera.cutout_trial_size";
        a = gzhVar3.a();
        gzh gzhVar4 = new gzh();
        gzhVar4.b = "camera.front_lens_indicator";
        d = gzhVar4.i();
    }

    public static gyr a(hbj hbjVar) {
        gyr gyrVar = new gyr(((Float) hbjVar.e(b).get()).floatValue(), ((Float) hbjVar.e(c).get()).floatValue());
        int iIntValue = ((Integer) hbjVar.a(a).get()).intValue();
        if (iIntValue == 0) {
            return gyrVar;
        }
        float f = iIntValue + 40.0f;
        return new gyr(f, f);
    }

    public static void b(hbj hbjVar, pnq pnqVar) {
        hbjVar.d(a, 0);
        hbjVar.l(d, false);
        boolean z = pnqVar.m;
        Float fValueOf = Float.valueOf(50.0f);
        Float fValueOf2 = Float.valueOf(55.0f);
        if (z) {
            hbjVar.k(b, fValueOf2);
            hbjVar.k(c, fValueOf);
            return;
        }
        if (pnqVar.n) {
            hbjVar.k(b, Float.valueOf(70.0f));
            hbjVar.k(c, Float.valueOf(62.0f));
            return;
        }
        if (pnqVar.p) {
            hbjVar.k(b, Float.valueOf(65.0f));
            hbjVar.k(c, fValueOf);
            return;
        }
        if (pnqVar.s) {
            hbjVar.k(b, Float.valueOf(65.0f));
            hbjVar.k(c, Float.valueOf(49.0f));
            return;
        }
        if (pnqVar.r) {
            gzg gzgVar = b;
            Float fValueOf3 = Float.valueOf(Float.MAX_VALUE);
            hbjVar.k(gzgVar, fValueOf3);
            hbjVar.k(c, fValueOf3);
            return;
        }
        if (pnqVar.t) {
            hbjVar.k(b, Float.valueOf(65.0f));
            hbjVar.k(c, fValueOf);
            return;
        }
        if (pnqVar.u) {
            hbjVar.k(b, fValueOf);
            hbjVar.k(c, Float.valueOf(51.0f));
            return;
        }
        if (pnqVar.w) {
            hbjVar.k(b, fValueOf2);
            hbjVar.k(c, Float.valueOf(52.0f));
            return;
        }
        if (pnqVar.v) {
            hbjVar.k(b, Float.valueOf(65.0f));
            hbjVar.k(c, fValueOf2);
            return;
        }
        if (pnqVar.x) {
            hbjVar.k(b, Float.valueOf(65.0f));
            hbjVar.k(c, fValueOf);
            return;
        }
        if (pnqVar.B) {
            gzg gzgVar2 = b;
            Float fValueOf4 = Float.valueOf(65.0f);
            hbjVar.k(gzgVar2, fValueOf4);
            hbjVar.k(c, fValueOf4);
            return;
        }
        if (pnqVar.y) {
            hbjVar.k(b, Float.valueOf(65.0f));
            hbjVar.k(c, fValueOf2);
            return;
        }
        if (pnqVar.z) {
            hbjVar.k(b, Float.valueOf(65.0f));
            hbjVar.k(c, fValueOf2);
            return;
        }
        if (pnqVar.A) {
            hbjVar.k(b, Float.valueOf(65.0f));
            hbjVar.k(c, fValueOf2);
        } else {
            if (pnqVar.C) {
                gzg gzgVar3 = b;
                Float fValueOf5 = Float.valueOf(65.0f);
                hbjVar.k(gzgVar3, fValueOf5);
                hbjVar.k(c, fValueOf5);
                return;
            }
            gzg gzgVar4 = b;
            Float fValueOf6 = Float.valueOf(0.0f);
            hbjVar.k(gzgVar4, fValueOf6);
            hbjVar.k(c, fValueOf6);
        }
    }
}
