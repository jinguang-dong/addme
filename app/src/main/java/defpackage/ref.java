package defpackage;

import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ref {
    public final Context a;
    public final Executor b;
    public String c;
    public AmbientModeSupport.AmbientController e;
    private boolean f = false;
    public rww d = new kus(8);

    public ref(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public final reh a() {
        rnt.B(this.f, "Must specify either forKeys(...) or forAllKeys() before calling build().");
        return new reh(this);
    }

    public final void b() {
        this.f = true;
    }

    public final void c(reg regVar) {
        this.e = new AmbientModeSupport.AmbientController(regVar, null);
    }
}
