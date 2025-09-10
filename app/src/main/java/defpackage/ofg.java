package defpackage;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofg extends ofk {
    protected final ofo a;

    public ofg(int i, ofo ofoVar) {
        super(i);
        this.a = ofoVar;
    }

    @Override // defpackage.ofk
    public final void d(Status status) {
        try {
            this.a.h(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.ofk
    public final void e(Exception exc) {
        try {
            this.a.h(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.ofk
    public final void f(oga ogaVar) throws DeadObjectException {
        try {
            this.a.g(ogaVar.b);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ofk
    public final void g(mwq mwqVar, boolean z) {
        ofo ofoVar = this.a;
        mwqVar.b.put(ofoVar, Boolean.valueOf(z));
        ofoVar.e(new ofv(mwqVar, ofoVar));
    }
}
