package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qlo extends qlp {
    private final AutoCloseable b;

    public qlo(qlr qlrVar, AutoCloseable autoCloseable) {
        super(qlrVar);
        this.b = autoCloseable;
    }

    @Override // defpackage.qlp, defpackage.qlr
    public final void d(int i) throws Exception {
        try {
            this.b.close();
        } catch (Exception e) {
            Log.w("CloseOnStopListener", "Exception while trying to close object.", e);
        }
        super.d(i);
    }
}
