package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ouk implements paq {
    public final paq a;
    public int b;
    public final ovj c;
    public final Object d;
    public final Runnable e;
    public boolean f;

    public ouk(paq paqVar, Executor executor, ovj ovjVar) {
        this.f = false;
        this.a = paqVar;
        this.c = ovjVar;
        this.d = new Object();
        this.b = 0;
        this.e = new jhj(new mvn(this, 13, null), executor, 3);
    }

    public final paq a() {
        synchronized (this.d) {
            if (this.f) {
                return null;
            }
            this.b++;
            ovj ovjVar = this.c;
            if (ovjVar != null) {
                ovjVar.a();
            }
            return new ouj(this, 0);
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            this.f = true;
            ovj ovjVar = this.c;
            if (ovjVar != null) {
                ovjVar.a();
            }
            this.a.close();
        }
    }

    public ouk(paq paqVar) {
        this(paqVar, new sxp(), null);
    }
}
