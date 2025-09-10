package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnl extends cnk {
    private final Object a;

    public cnl(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.cnk, defpackage.cnj
    public final Object a() {
        Object objA;
        synchronized (this.a) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.cnk, defpackage.cnj
    public final boolean b(Object obj) {
        boolean zB;
        obj.getClass();
        synchronized (this.a) {
            zB = super.b(obj);
        }
        return zB;
    }
}
