package j$.util.concurrent;

/* loaded from: classes3.dex */
public abstract class a extends o {
    public final ConcurrentHashMap i;
    public k j;

    public a(k[] kVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i, 0, i2);
        this.i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void remove() {
        k kVar = this.j;
        if (kVar == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.i.g(kVar.b, null, null);
    }
}
