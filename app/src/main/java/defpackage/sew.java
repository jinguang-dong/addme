package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sew extends sbc {
    static final sew a = new sew();
    final transient Object[] b;
    public final transient sew c;
    private final transient Object d;
    private final transient int e;
    private final transient int f;

    private sew() {
        this.d = null;
        this.b = new Object[0];
        this.e = 0;
        this.f = 0;
        this.c = this;
    }

    @Override // defpackage.sbc
    public final sbc a() {
        return this.c;
    }

    @Override // defpackage.sbv
    public final scn fC() {
        return new sez(this, this.b, this.e, this.f);
    }

    @Override // defpackage.sbv
    public final scn fD() {
        return new sfa(this, new sfb(this.b, this.e, this.f));
    }

    @Override // defpackage.sbv
    public final boolean fF() {
        return false;
    }

    @Override // defpackage.sbv, java.util.Map
    public final Object get(Object obj) {
        Object objK = sfc.k(this.d, this.b, this.f, this.e, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }

    @Override // defpackage.sbc, defpackage.sbv
    public Object writeReplace() {
        return super.writeReplace();
    }

    private sew(Object obj, Object[] objArr, int i, sew sewVar) {
        this.d = obj;
        this.b = objArr;
        this.e = 1;
        this.f = i;
        this.c = sewVar;
    }

    public sew(Object[] objArr, int i) {
        this.b = objArr;
        this.f = i;
        this.e = 0;
        int iB = i >= 2 ? scn.B(i) : 0;
        this.d = sfc.i(objArr, i, iB, 0);
        this.c = new sew(sfc.i(objArr, i, iB, 1), objArr, i, this);
    }
}
