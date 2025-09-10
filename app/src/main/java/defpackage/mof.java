package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mof {
    public static final sgv a = sgv.g("mof");
    public final Context b;
    public final Executor c;
    public final luj d;
    private final luj e;

    public mof(Context context, luj lujVar, luj lujVar2, Executor executor) {
        this.b = context;
        this.d = lujVar;
        this.e = lujVar2;
        this.c = executor;
    }

    public final void a() {
        this.e.d(luf.aX, "");
    }

    public final void b(Uri uri) {
        this.e.d(luf.aX, uri.toString());
    }
}
