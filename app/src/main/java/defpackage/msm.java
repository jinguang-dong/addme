package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class msm implements Choreographer.FrameCallback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ msm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.b;
        if (i == 0) {
            ((mso) this.a).d();
        } else if (i != 1) {
            ((mso) this.a).c();
        } else {
            this.a.run();
        }
    }
}
