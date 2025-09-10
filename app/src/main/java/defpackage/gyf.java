package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyf {
    public static final gzi a;
    public static final gzi b;
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
        gzhVar.b = "camera.layla_enabled";
        c = gzhVar.i();
        gzh gzhVar2 = new gzh();
        gzhVar2.b = "camera.layla_threshold";
        d = gzhVar2.h();
        gzh gzhVar3 = new gzh();
        gzhVar3.b = "camera.layla_force_enabled";
        gzhVar3.o();
        gzh gzhVar4 = new gzh();
        gzhVar4.b = "camera.layla_v2_enabled";
        gzhVar4.o();
        gzh gzhVar5 = new gzh();
        gzhVar5.b = "camera.layla.max_burst_size";
        a = gzhVar5.a();
        gzh gzhVar6 = new gzh();
        gzhVar6.b = "camera.skyla_enabled";
        e = gzhVar6.i();
        gzh gzhVar7 = new gzh();
        gzhVar7.b = "camera.skyla_force_enabled";
        gzhVar7.o();
        gzh gzhVar8 = new gzh();
        gzhVar8.b = "camera.skyla_threshold";
        f = gzhVar8.h();
        gzh gzhVar9 = new gzh();
        gzhVar9.b = "camera.skyla_hardware_limit";
        g = gzhVar9.h();
        gzh gzhVar10 = new gzh();
        gzhVar10.b = "camera.stella_enabled";
        gzhVar10.o();
        gzh gzhVar11 = new gzh();
        gzhVar11.b = "camera.stella_display_ui_enabled";
        gzhVar11.o();
        gzh gzhVar12 = new gzh();
        gzhVar12.b = "camera.stella_in_threshold";
        h = gzhVar12.h();
        gzh gzhVar13 = new gzh();
        gzhVar13.b = "camera.stella_out_threshold";
        i = gzhVar13.h();
        gzh gzhVar14 = new gzh();
        gzhVar14.b = "camera.stella_window_brightness";
        j = gzhVar14.h();
        gzh gzhVar15 = new gzh();
        gzhVar15.b = "camera.stella_flash_brightness";
        k = gzhVar15.h();
        gzh gzhVar16 = new gzh();
        gzhVar16.b = "camera.stella_force_hint";
        gzhVar16.o();
        gzh gzhVar17 = new gzh();
        gzhVar17.b = "camera.stella.max_burst_size";
        b = gzhVar17.a();
    }

    public static void a(hbj hbjVar) {
        hbjVar.l(c, false);
        gzg gzgVar = d;
        Float fValueOf = Float.valueOf(-1.5f);
        hbjVar.k(gzgVar, fValueOf);
        hbjVar.d(a, 10);
        hbjVar.l(e, false);
        hbjVar.k(f, fValueOf);
        hbjVar.k(g, Float.valueOf(1.0f));
        hbjVar.k(h, Float.valueOf(-3.5f));
        hbjVar.k(i, Float.valueOf(-3.0f));
        hbjVar.k(j, Float.valueOf(0.05f));
        hbjVar.k(k, Float.valueOf(0.2f));
        hbjVar.d(b, 10);
    }
}
