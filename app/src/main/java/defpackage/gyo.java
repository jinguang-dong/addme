package defpackage;

import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyo {
    public static final gzi a;
    public static final gzi b;
    public static final gzi c;
    public static final gzi d;
    public static final gzi e;
    public static final gzg f;
    public static final gzg g;
    public static final gzg h;
    public static final gzg i;

    public static void a(hbj hbjVar) {
        hbjVar.d(a, 17);
        hbjVar.d(b, 0);
        hbjVar.d(c, 0);
        hbjVar.l(f, false);
        hbjVar.k(h, Float.valueOf(-0.62f));
        hbjVar.l(g, true);
        hbjVar.d(d, 5);
        hbjVar.d(e, 3);
        hbjVar.l(i, true);
    }

    static {
        gzh gzhVar = new gzh();
        gzhVar.c(new gyn(0));
        gzhVar.b = "camera.catcher_eephus_fps";
        a = gzhVar.a();
        gzh gzhVar2 = new gzh();
        gzhVar2.b = YyLACfm.yKSVzDuWq;
        gzhVar2.e();
        gzh gzhVar3 = new gzh();
        gzhVar3.b = "camera.catcher_square_trial_size";
        b = gzhVar3.a();
        gzh gzhVar4 = new gzh();
        gzhVar4.b = "camera.catcher_square_trial_stroke";
        c = gzhVar4.a();
        gzh gzhVar5 = new gzh();
        gzhVar5.b = "camera.catcher_enabled";
        f = gzhVar5.i();
        gzh gzhVar6 = new gzh();
        gzhVar6.b = "camera.catcher_logo_shot_enabled";
        gzhVar6.i();
        gzh gzhVar7 = new gzh();
        gzhVar7.b = "camera.catcher_sentry_mode";
        g = gzhVar7.i();
        gzh gzhVar8 = new gzh();
        gzhVar8.b = "camera.catcher_bottom_sheet_max_cnt";
        d = gzhVar8.a();
        gzh gzhVar9 = new gzh();
        gzhVar9.b = "camera.catcher_sentry_mode_bottom_sheet_max_cnt";
        e = gzhVar9.a();
        gzh gzhVar10 = new gzh();
        gzhVar10.b = "camera.catcher_detection_threshold";
        h = gzhVar10.h();
        gzh gzhVar11 = new gzh();
        gzhVar11.b = "catcher_skip_detection_when_no_face";
        gzhVar11.c(new gyn(2));
        i = gzhVar11.i();
    }
}
