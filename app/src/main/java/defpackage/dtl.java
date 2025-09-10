package defpackage;

import android.app.Activity;
import android.os.Binder;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtl extends dtr {
    @Override // defpackage.dtr
    public final urk a() {
        return new iqe(ufw.a, 3);
    }

    @Override // defpackage.dtr
    public final void b(Binder binder, Activity activity, Executor executor, dtz dtzVar) {
        new IllegalStateException("There are no WindowAreas");
        dtzVar.em();
    }

    @Override // defpackage.dtr
    public final void c(Binder binder, Activity activity, Executor executor, dub dubVar) {
        new IllegalStateException("There are no WindowAreas");
        dubVar.em();
    }
}
