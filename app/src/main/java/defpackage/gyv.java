package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyv {
    public static final gzi a;
    public static final gzi b;
    public static final gzg c;
    public static final gzg d;
    public static final gzg e;

    static {
        gzh gzhVar = new gzh();
        gzhVar.b = "camera.dualev.singleKnob";
        c = gzhVar.i();
        gzh gzhVar2 = new gzh();
        gzhVar2.b = "camera.dualev.limitUltrawide";
        d = gzhVar2.i();
        gzh gzhVar3 = new gzh();
        gzhVar3.b = "camera.dualev.limitShadowBoost";
        e = gzhVar3.i();
        gzh gzhVar4 = new gzh();
        gzhVar4.b = "camera.enable_twilight";
        gzhVar4.m();
        gzh gzhVar5 = new gzh();
        gzhVar5.b = "camera.twilight_brightness_bias_min";
        a = gzhVar5.a();
        gzh gzhVar6 = new gzh();
        gzhVar6.b = "camera.twilight_brightness_bias_max";
        b = gzhVar6.a();
    }

    public static void a(hbj hbjVar) {
        hbjVar.l(c, false);
        hbjVar.l(d, false);
        hbjVar.l(e, true);
        hbjVar.d(a, -40);
        hbjVar.d(b, 40);
    }
}
