package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpq implements afy {
    private final afy a;
    private final int b;
    private final azr c = new azz(new bkf(0), bap.c);
    private final buo d = new bij();

    public dpq(afy afyVar, int i) {
        this.a = afyVar;
        this.b = i;
    }

    @Override // defpackage.afy
    public final long a(final long j, int i, final uiq uiqVar) {
        return this.a.a(j, i, new uiq() { // from class: dpo
            @Override // defpackage.uiq
            public final Object a(Object obj) {
                long j2 = ((bkf) uiqVar.a((bkf) obj)).a;
                long jAc = a.ac(j, j2);
                if (Float.intBitsToFloat((int) (4294967295L & jAc)) != 0.0f) {
                    dpq dpqVar = this;
                    dpqVar.g(a.E(dpqVar.f(), jAc));
                }
                return new bkf(j2);
            }
        });
    }

    public final float b() {
        int i = this.b;
        if (i != 0) {
            return Float.intBitsToFloat((int) (f() & 4294967295L)) / i;
        }
        return 0.0f;
    }

    @Override // defpackage.afy
    public final /* synthetic */ bik c() {
        return bik.c;
    }

    @Override // defpackage.afy
    public final buo d() {
        return this.d;
    }

    @Override // defpackage.afy
    public final Object e(long j, uiu uiuVar, uhb uhbVar) {
        Object objE = this.a.e(j, new dpp(uiuVar, this, null), uhbVar);
        return objE == uhi.a ? objE : ufg.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpq)) {
            return false;
        }
        dpq dpqVar = (dpq) obj;
        return a.ao(this.a, dpqVar.a) && this.b == dpqVar.b;
    }

    public final long f() {
        return ((bkf) this.c.a()).a;
    }

    public final void g(long j) {
        this.c.b(new bkf(j));
    }

    @Override // defpackage.afy
    public final boolean h() {
        return this.a.h();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
