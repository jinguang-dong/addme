package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyz {
    public static final gzi a;
    public static final gzg b;
    public static final gzg c;
    public static final gzg d;
    public static final gzg e;
    public static final gzg f;
    public static final gzg g;

    static {
        gzh gzhVar = new gzh();
        gzhVar.b = "camera.decepticon_enabled";
        b = gzhVar.i();
        gzh gzhVar2 = new gzh();
        gzhVar2.b = "camera.ceftazidime_enabled";
        gzhVar2.o();
        gzh gzhVar3 = new gzh();
        gzhVar3.b = "camera.decepticon_force_run";
        gzhVar3.o();
        gzh gzhVar4 = new gzh();
        gzhVar4.b = "camera.ceftazidime_force_run_num";
        a = gzhVar4.a();
        gzh gzhVar5 = new gzh();
        gzhVar5.b = "camera.decepticon.detector";
        c = gzhVar5.j();
        gzh gzhVar6 = new gzh();
        gzhVar6.b = "camera.decepticon.inpainter";
        d = gzhVar6.j();
        gzh gzhVar7 = new gzh();
        gzhVar7.b = "camera.decepticon.discriminator";
        e = gzhVar7.j();
        gzh gzhVar8 = new gzh();
        gzhVar8.b = "camera.decepticon.segmentation";
        f = gzhVar8.j();
        gzh gzhVar9 = new gzh();
        gzhVar9.b = "camera.decepticon.inpainter2";
        g = gzhVar9.j();
    }

    public static void a(hbj hbjVar) {
        hbjVar.l(b, false);
        hbjVar.m(c, null);
        hbjVar.m(d, null);
        hbjVar.m(e, null);
        hbjVar.m(f, null);
        hbjVar.m(g, null);
        hbjVar.d(a, 0);
    }
}
