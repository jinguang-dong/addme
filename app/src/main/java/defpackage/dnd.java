package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnd implements dmy {
    final /* synthetic */ tdy a;
    private final int b;
    private final long c;
    private final dne d;
    private btr e;
    private boolean f;
    private boolean g;
    private boolean h;
    private dnc i;
    private boolean j;
    private long k;
    private long l;
    private long m = ulx.a();

    public dnd(tdy tdyVar, int i, long j, dne dneVar) {
        this.a = tdyVar;
        this.b = i;
        this.c = j;
        this.d = dneVar;
    }

    private final void d() {
        long jA = ulx.a();
        long jB = uls.b(ulw.a(jA, this.m));
        this.l = jB;
        this.k -= jB;
        this.m = jA;
    }

    private final boolean e() {
        return this.e != null;
    }

    private final boolean f(long j, long j2) {
        return (this.j && j > 0) || j2 < j;
    }

    @Override // defpackage.dmy
    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        btr btrVar = this.e;
        if (btrVar != null) {
            btrVar.b();
        }
        this.e = null;
    }

    @Override // defpackage.dmy
    public final void b() {
        this.j = true;
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.b + ", constraints = " + ((Object) cho.e(this.c)) + ", isComposed = " + e() + ", isMeasured = " + this.f + ", isCanceled = " + this.g + " }";
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x011e A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:41:0x00db, B:43:0x00e3, B:45:0x00eb, B:48:0x00f4, B:50:0x0100, B:52:0x010d, B:51:0x0103, B:53:0x010f, B:54:0x0116, B:56:0x011e, B:58:0x012c, B:62:0x0136), top: B:96:0x00db }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, uif] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.qhz r15) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnd.c(qhz):boolean");
    }
}
