package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kym implements kmz {
    private static final sgv a = sgv.g("kym");
    private final owf b;
    private final let c;
    private final kyu d;
    private final pbn e;
    private final khl f;
    private final kwr g;
    private final lat h;
    private final our i;
    private final pfu j;
    private final cxb k;

    public kym(pfu pfuVar, owf owfVar, let letVar, pbn pbnVar, kyu kyuVar, khl khlVar, kwr kwrVar, lat latVar, our ourVar, cxb cxbVar) {
        this.j = pfuVar;
        this.b = owfVar;
        this.c = letVar;
        this.e = pbnVar;
        this.d = kyuVar;
        this.f = khlVar;
        this.g = kwrVar;
        this.h = latVar;
        this.i = ourVar;
        this.k = cxbVar;
    }

    private final boolean d(pdk pdkVar) throws InterruptedException {
        ojl.bz(pdkVar);
        pdo pdoVarB = pdkVar.b();
        long j = pdoVarB == null ? -1L : pdoVarB.b;
        poj pojVarP = this.h.a(pdkVar).p();
        if (pojVarP != null) {
            try {
                if (!this.k.G(j)) {
                    pojVarP.close();
                    return true;
                }
            } catch (Throwable th) {
                if (pojVarP != null) {
                    try {
                        pojVarP.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        pdkVar.close();
        if (pojVarP == null) {
            return false;
        }
        pojVarP.close();
        return false;
    }

    @Override // defpackage.kmz
    public final owf a() {
        return this.b;
    }

    @Override // defpackage.kmz
    public final owf b() {
        return new owi(qpt.cl());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kml] */
    @Override // defpackage.kmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.kmy r13, defpackage.gga r14) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kym.c(kmy, gga):void");
    }
}
