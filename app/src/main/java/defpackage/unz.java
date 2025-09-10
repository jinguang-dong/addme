package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class unz implements Runnable, Comparable, unt, uwg {
    public volatile Object _heap;
    private int a = -1;
    public long b;

    public unz(long j) {
        this.b = j;
    }

    @Override // defpackage.uwg
    public final int b() {
        return this.a;
    }

    @Override // defpackage.uwg
    public final uwf c() {
        Object obj = this._heap;
        if (obj instanceof uwf) {
            return (uwf) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.b - ((unz) obj).b;
        if (j > 0) {
            return 1;
        }
        return j >= 0 ? 0 : -1;
    }

    @Override // defpackage.uwg
    public final void d(uwf uwfVar) {
        if (this._heap == uoc.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = uwfVar;
    }

    @Override // defpackage.uwg
    public final void e(int i) {
        this.a = i;
    }

    @Override // defpackage.unt
    public final void fL() {
        synchronized (this) {
            Object obj = this._heap;
            uwc uwcVar = uoc.a;
            if (obj == uwcVar) {
                return;
            }
            uoa uoaVar = obj instanceof uoa ? (uoa) obj : null;
            if (uoaVar != null) {
                synchronized (uoaVar) {
                    if (c() != null) {
                        int iB = b();
                        boolean z = unf.a;
                        uoaVar.d(iB);
                    }
                }
            }
            this._heap = uwcVar;
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.b + "]";
    }
}
