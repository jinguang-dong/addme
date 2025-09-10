package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jcd {
    public static final sgv a = sgv.g("jcd");
    public final WeakReference b;
    public final out c;
    public final rwc d;
    public final Executor e;
    public final iyu f;

    public jcd(WeakReference weakReference, out outVar, cxb cxbVar, iyu iyuVar, Executor executor) {
        this.b = weakReference;
        this.c = outVar;
        this.f = iyuVar;
        this.e = executor;
        this.d = fdo.d(cxbVar.g());
    }
}
