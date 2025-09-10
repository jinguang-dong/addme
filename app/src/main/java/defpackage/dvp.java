package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dvp {
    public final Activity a;
    public final cnh b;
    public duy c;
    private final Executor d;

    public dvp(Activity activity, Executor executor, cnh cnhVar) {
        this.a = activity;
        this.d = executor;
        this.b = cnhVar;
    }

    public final void a(duy duyVar) {
        this.c = duyVar;
        this.d.execute(new at(this, duyVar, 18));
    }
}
