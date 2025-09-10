package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwt {
    public final Executor a;
    public final our b;
    public final owq c;
    public boolean d = false;

    static {
        new sfm("en");
    }

    public mwt(Executor executor, our ourVar, owq owqVar) {
        this.a = executor;
        this.b = ourVar;
        this.c = owqVar;
    }

    public final void a(mwv mwvVar) {
        if (Thread.currentThread().getName().equals("hotshot-imgCap")) {
            if (mwvVar.a == 0) {
                throw null;
            }
        } else {
            Executor executor = this.a;
            executor.getClass();
            executor.execute(new lsn(this, mwvVar, 20));
        }
    }
}
