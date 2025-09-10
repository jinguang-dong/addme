package defpackage;

import android.content.Context;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hed implements mcw {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hed(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            Trace.beginSection("ShotTracker#checkForLostShots");
            this.a.f();
            Trace.endSection();
        } else if (i == 1) {
            hbu hbuVar = (hbu) this.a.a();
            ins.g(hbuVar.b, hbuVar.d, hbuVar);
        } else {
            if (i == 2) {
                this.a.run();
                return;
            }
            if (i != 3) {
                this.a.run();
                return;
            }
            mwq mwqVar = (mwq) this.a;
            if (mwqVar.E()) {
                mwq.F((Context) mwqVar.a);
            }
        }
    }
}
