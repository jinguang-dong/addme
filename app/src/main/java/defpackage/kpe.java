package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kpe {
    public static final sgv a = sgv.g("kpe");
    public final rwc b;
    public final pbn c;
    public final boolean d;
    public final fft e;
    private final lat f;
    private final rwc g;
    private final owq h;

    public kpe(rwc rwcVar, lat latVar, rwc rwcVar2, pbn pbnVar, hbj hbjVar, owq owqVar, fft fftVar) {
        this.b = rwcVar;
        this.f = latVar;
        this.g = rwcVar2;
        this.c = pbnVar;
        this.d = hbjVar.o(han.k);
        this.h = owqVar;
        this.e = fftVar;
    }

    public final void a(pfz pfzVar, pdv pdvVar, hxu hxuVar) {
        try {
            try {
                this.c.f("abortCaptures");
                pfzVar.d();
                hxuVar.c();
                pfg pfgVarA = pfg.a(pfzVar.f());
                pfgVarA.d();
                pfgVarA.c(pdvVar);
                pej pejVar = new pej(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                pfgVarA.a.put(pejVar.a, pejVar);
                pfzVar.g(pfgVarA.b()).close();
            } catch (pco e) {
                ((sgt) ((sgt) a.c().i(e)).M(3344)).s("Error aborting captures.");
            }
        } finally {
            this.c.g();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, jlt] */
    public final kpq b(pdk pdkVar) {
        if (pdkVar == null) {
            ((sgt) a.c().M(3350)).s("Ignoring null Frame.");
            return null;
        }
        try {
            pbn pbnVar = this.c;
            pbnVar.f("awaitComplete");
            ojl.by(pdkVar);
            pbnVar.h("getMetadata");
            pdo pdoVarB = pdkVar.b();
            long j = pdoVarB == null ? -1L : pdoVarB.c;
            poe poeVarD = pdkVar.d();
            this.h.a(rwc.i(poeVarD));
            if (poeVarD != null) {
                poeVarD.d();
            } else {
                poeVarD = null;
            }
            if (poeVarD != null && CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID != null) {
            }
            lau lauVarA = this.f.a(pdkVar);
            pjr pjrVarD = lauVarA.l().d();
            if (poeVarD == null) {
                pbnVar.g();
                pdkVar.close();
                return null;
            }
            pbnVar.h("getImage");
            poj pojVarP = lauVarA.p();
            if (pojVarP == null) {
                ((sgt) a.c().M(3349)).u("Frame contains an invalid image: %s", j);
            }
            poeVarD.g().keySet();
            rwc rwcVar = this.g;
            if (rwcVar.h()) {
                poeVarD = rwcVar.c().a(pjrVarD.a, poeVarD);
                String str = ((jlu) poeVarD).a;
                str.getClass();
                pjrVarD = pjr.b(str);
            }
            return new kpq(pjrVarD, poeVarD, pojVarP);
        } finally {
            this.c.g();
            pdkVar.close();
        }
    }
}
