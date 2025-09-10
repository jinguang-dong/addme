package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apk implements aou {
    public boolean a;
    final /* synthetic */ owd b;
    private final int c;
    private final apl d;
    private final uiq e;
    private cho f;
    private btr g;
    private boolean h;
    private boolean i;
    private Object j;
    private boolean k;
    private apj l;
    private boolean m;
    private long n;
    private long o;
    private long p;
    private final ann q;

    public apk(owd owdVar, int i, long j, apl aplVar, ann annVar, uiq uiqVar) {
        this(owdVar, i, aplVar, annVar, uiqVar);
        this.f = new cho(j);
    }

    private final void d() {
        btr btrVar = this.g;
        if (btrVar != null) {
            btrVar.b();
        }
        this.g = null;
        this.l = null;
    }

    private final void e() {
        long jA = ulx.a();
        long jB = uls.b(ulw.a(jA, this.p));
        this.o = jB;
        long j = this.n - jB;
        this.n = j;
        this.p = jA;
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j);
    }

    private final boolean f() {
        return this.i;
    }

    private final boolean g(long j, long j2) {
        ann annVar;
        if (this.m || ((annVar = this.q) != null && annVar.c)) {
            j2 = 0;
        }
        return j > j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x019e A[Catch: all -> 0x01d6, TryCatch #0 {all -> 0x01d6, blocks: (B:73:0x0152, B:75:0x015a, B:77:0x0162, B:80:0x016b, B:82:0x0177, B:84:0x018d, B:83:0x017a, B:85:0x018f, B:86:0x0196, B:88:0x019e, B:90:0x01a8, B:95:0x01b1, B:96:0x01b4, B:98:0x01be, B:103:0x01ca), top: B:170:0x0152 }] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, uif] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean h(defpackage.jal r19) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apk.h(jal):boolean");
    }

    @Override // defpackage.aou
    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        d();
    }

    @Override // defpackage.aou
    public final void b() {
        this.m = true;
    }

    public final boolean c(jal jalVar) {
        boolean zH;
        if (!this.b.a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zH = h(jalVar);
            } finally {
                Trace.endSection();
            }
        } else {
            zH = h(jalVar);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return zH;
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.c + ", constraints = " + this.f + ", isComposed = " + f() + ", isMeasured = " + this.h + ", isCanceled = " + this.a + " }";
    }

    public apk(owd owdVar, int i, apl aplVar, ann annVar, uiq uiqVar) {
        this.b = owdVar;
        this.c = i;
        this.d = aplVar;
        this.q = annVar;
        this.e = uiqVar;
        this.p = ulx.a();
    }
}
