package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kvg {
    private static final sgv d = sgv.g("kvg");
    public final nms a;
    public final owf b;
    public final hbj c;

    public kvg(nms nmsVar, owf owfVar, hbj hbjVar) {
        this.a = nmsVar;
        this.b = owfVar;
        this.c = hbjVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    public static final void b(pfz pfzVar) {
        try {
            pfg pfgVarF = pfzVar.f();
            pfgVarF.e(CaptureRequest.CONTROL_AF_MODE, 4);
            pfgVarF.e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            pfzVar.g(pfgVarF.b()).close();
        } catch (pco e) {
            ((sgt) ((sgt) d.b().i(e)).M((char) 3487)).s("Failed to unlock lens.");
        }
    }

    public static final void d() {
        gzi gziVar = hac.a;
    }

    public final boolean a(hxu hxuVar) {
        if (hxuVar.m) {
            return true;
        }
        d();
        return false;
    }

    public final void c() {
        d();
    }
}
