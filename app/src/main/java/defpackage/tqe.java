package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class tqe {
    protected volatile tqr a;
    public volatile toj b;
    private volatile boolean c;

    public final toj a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = toj.b;
            } else {
                this.b = this.a.f();
            }
            return this.b;
        }
    }

    public final tqr b(tqr tqrVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = tqrVar;
                        this.b = toj.b;
                    } catch (tpz unused) {
                        this.c = true;
                        this.a = tqrVar;
                        this.b = toj.b;
                    }
                }
            }
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqe)) {
            return false;
        }
        tqe tqeVar = (tqe) obj;
        tqr tqrVar = this.a;
        tqr tqrVar2 = tqeVar.a;
        return (tqrVar == null && tqrVar2 == null) ? a().equals(tqeVar.a()) : (tqrVar == null || tqrVar2 == null) ? tqrVar != null ? tqrVar.equals(tqeVar.b(tqrVar.n())) : b(tqrVar2.n()).equals(tqrVar2) : tqrVar.equals(tqrVar2);
    }

    public int hashCode() {
        return 1;
    }
}
