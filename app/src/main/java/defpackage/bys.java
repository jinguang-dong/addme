package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bys implements Choreographer.FrameCallback {
    final /* synthetic */ umk a;
    final /* synthetic */ uiq b;

    public bys(umk umkVar, uiq uiqVar) {
        this.a = umkVar;
        this.b = uiqVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objAM;
        try {
            objAM = this.b.a(Long.valueOf(j));
        } catch (Throwable th) {
            objAM = rnt.aM(th);
        }
        this.a.fW(objAM);
    }
}
