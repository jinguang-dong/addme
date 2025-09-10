package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kud implements mcw, jhh, jgl {
    public final Context a;
    public final jgj b;
    public final fql c;
    public final out d;
    private final Executor e;
    private final pbn f;

    public kud(Context context, Executor executor, pbn pbnVar, jgj jgjVar, fql fqlVar, out outVar) {
        this.a = context;
        this.e = executor;
        this.f = pbnVar;
        this.b = jgjVar;
        this.c = fqlVar;
        this.d = outVar;
    }

    public final void a() {
        this.e.execute(this.f.c("PhenotypeHelper#commitFlags", new krc(this, 5)));
    }

    @Override // defpackage.jgl
    public final void b() {
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.execute(this.f.c("PhenotypeHelper#retrieveFlags", new iyz(this, 18)));
    }
}
