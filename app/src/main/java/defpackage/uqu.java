package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uqu extends uqi {
    private final int g;
    private final int h;

    public uqu(int i, int i2, uiq uiqVar) {
        super(i, uiqVar);
        this.g = i;
        this.h = i2;
        if (i2 != 1) {
            if (i <= 0) {
                throw new IllegalArgumentException(a.bE(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            }
            return;
        }
        int i3 = ukb.a;
        throw new IllegalArgumentException("This implementation does not support suspension for senders, use " + new uji(uqi.class).c() + " instead");
    }

    private final Object E(Object obj) {
        uqr uqrVarP;
        int i;
        uqu uquVar;
        uwc uwcVar = uqk.d;
        uqr uqrVar = (uqr) this.d.a;
        while (true) {
            long jB = this.b.b();
            long j = jB & 1152921504606846975L;
            boolean zY = super.y(jB);
            long j2 = uqk.b;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (uqrVar.b != j3) {
                uqrVarP = super.p(j3, uqrVar);
                if (uqrVarP != null) {
                    uquVar = this;
                    i = i2;
                } else if (zY) {
                    return new uqo(this.n());
                }
            } else {
                uqrVarP = uqrVar;
                i = i2;
                uquVar = this;
            }
            Object obj2 = obj;
            int iA = super.a(uqrVarP, i, obj2, j, uwcVar, zY);
            uqu uquVar2 = uquVar;
            uqrVar = uqrVarP;
            if (iA == 0) {
                uqrVar.p();
                return ufg.a;
            }
            if (iA == 1) {
                return ufg.a;
            }
            if (iA == 2) {
                if (zY) {
                    uqrVar.s();
                    return new uqo(uquVar2.n());
                }
                uquVar2.q((uqrVar.b * j2) + i);
                return ufg.a;
            }
            if (iA == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iA == 4) {
                if (j < uquVar2.b()) {
                    uqrVar.p();
                }
                return new uqo(uquVar2.n());
            }
            uqrVar.p();
            this = uquVar2;
            obj = obj2;
        }
    }

    @Override // defpackage.uqi, defpackage.ura
    public final Object h(Object obj, uhb uhbVar) throws Throwable {
        uwi uwiVarL;
        Object objE = E(obj);
        if (!(objE instanceof uqo)) {
            return ufg.a;
        }
        uqq.b(objE);
        uiq uiqVar = this.a;
        if (uiqVar == null || (uwiVarL = ujk.l(uiqVar, obj, null)) == null) {
            throw n();
        }
        ujk.f(uwiVarL, n());
        throw uwiVarL;
    }

    @Override // defpackage.uqi, defpackage.ura
    public final Object j(Object obj) {
        return E(obj);
    }

    @Override // defpackage.uqi
    protected final boolean z() {
        return this.h == 2;
    }
}
