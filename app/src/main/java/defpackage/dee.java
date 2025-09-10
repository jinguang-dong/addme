package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dee extends uht implements uiu {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dee(abr abrVar, boolean z, aby abyVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = abrVar;
        this.b = z;
        this.d = abyVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((dee) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 1) {
            return ((dee) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((dee) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aby, java.lang.Object] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        int i = this.e;
        if (i == 0) {
            uhi uhiVar = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
                return obj;
            }
            rnt.aN(obj);
            dco dcoVar = (dco) this.c;
            deh dehVar = new deh(this.b, dcoVar, null, this.d);
            this.a = 1;
            Object objV = dcoVar.v(dehVar, this);
            return objV == uhiVar ? uhiVar : objV;
        }
        if (i == 1) {
            uhi uhiVar2 = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                Object obj2 = this.c;
                Float f = new Float(true != this.b ? 0.8f : 1.0f);
                ?? r5 = this.d;
                this.a = 1;
                if (abr.k((abr) obj2, f, r5, null, this, 12) == uhiVar2) {
                    return uhiVar2;
                }
            }
            return ufg.a;
        }
        uhi uhiVar3 = uhi.a;
        int i2 = this.a;
        rnt.aN(obj);
        if (i2 == 0) {
            Object obj3 = this.c;
            boolean z = this.b;
            this.a = 1;
            obj = fxa.i((fxa) obj3, z, 1, this);
            if (obj == uhiVar3) {
                return uhiVar3;
            }
        }
        gcd gcdVar = (gcd) obj;
        ((fxa) this.c).close();
        fxd fxdVar = (fxd) this.d;
        fxdVar.p = null;
        if (gcdVar.a) {
            for (fyt fytVar : fxdVar.l) {
                kbk kbkVar = gcdVar.b;
                if (kbkVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                fytVar.q(kbkVar);
            }
        }
        fxdVar.a(fyv.c);
        return ufg.a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, uiq] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.e;
        if (i == 0) {
            return new dee(uhbVar, (dco) this.c, this.b, (uiq) this.d, 0);
        }
        if (i != 1) {
            return new dee((fxa) this.c, this.b, (fxd) this.d, uhbVar, 2);
        }
        return new dee((abr) this.c, this.b, (aby) this.d, uhbVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dee(fxa fxaVar, boolean z, fxd fxdVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = fxaVar;
        this.b = z;
        this.d = fxdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dee(uhb uhbVar, dco dcoVar, boolean z, uiq uiqVar, int i) {
        super(2, uhbVar);
        this.e = i;
        this.c = dcoVar;
        this.b = z;
        this.d = uiqVar;
    }
}
