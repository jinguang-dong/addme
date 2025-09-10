package defpackage;

import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jam implements mcw {
    public final tzj a;
    private final tzj b;
    private final tzj c;
    private final tzj d;
    private final owq e;
    private final out f;
    private final pbn g;
    private final cxb h;

    public jam(cxb cxbVar, tzj tzjVar, tzj tzjVar2, tzj tzjVar3, tzj tzjVar4, owq owqVar, out outVar, pbn pbnVar) {
        this.h = cxbVar;
        this.b = tzjVar;
        this.c = tzjVar3;
        this.d = tzjVar4;
        this.a = tzjVar2;
        this.e = owqVar;
        this.f = outVar;
        this.g = pbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pbn pbnVar = this.g;
        pbnVar.f("EssentialUiInit#start");
        this.e.a(ltw.f);
        if (fdo.i(this.h.g())) {
            ((gnt) this.b.a()).f(pka.FRONT);
        }
        pbnVar.h(HHdu.HfpVaWvbHOHogB);
        this.d.a();
        this.c.a();
        pbnVar.g();
        this.f.execute(pbnVar.c("EssentialUiInit#wire", new ivi(this, 14)));
    }
}
