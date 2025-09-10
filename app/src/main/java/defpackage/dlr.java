package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlr {
    public final int a;
    public final bte b;
    public final long c;
    public int d;
    public final int e;
    public final int f;
    public final int g;
    public long h;
    public final cib i;
    public final uif j;
    public final Object k;
    public final Object l;
    public boolean m;
    public final dml n;
    public final int o;
    public final bic p;
    private int q;

    public dlr(int i, bte bteVar, long j, int i2, int i3, int i4, int i5, long j2, bic bicVar, cib cibVar, uif uifVar, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.b = bteVar;
        this.c = j;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = j2;
        this.p = bicVar;
        this.i = cibVar;
        this.j = uifVar;
        this.k = obj;
        this.l = obj2;
        this.m = z;
        this.n = (dml) uifVar.a();
        this.q = bteVar != null ? bteVar.b : 0;
        this.o = bteVar != null ? bteVar.b : 0;
    }

    public final int a() {
        return b() + this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b() {
        /*
            r6 = this;
            boolean r0 = r6.m
            if (r0 == 0) goto L3c
            bte r0 = r6.b
            if (r0 == 0) goto L39
            java.lang.Object r1 = r0.g()
            boolean r2 = r1 instanceof defpackage.dlv
            r3 = 0
            if (r2 == 0) goto L14
            dlv r1 = (defpackage.dlv) r1
            goto L15
        L14:
            r1 = r3
        L15:
            if (r1 == 0) goto L36
            uiu r1 = r1.a
            if (r1 == 0) goto L2f
            int r2 = r0.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r3 = r6.h
            dln r5 = new dln
            r5.<init>(r3)
            java.lang.Object r1 = r1.a(r2, r5)
            r3 = r1
            java.lang.Integer r3 = (java.lang.Integer) r3
        L2f:
            if (r3 == 0) goto L36
            int r0 = r3.intValue()
            goto L3a
        L36:
            int r0 = r0.b
            goto L3a
        L39:
            r0 = 0
        L3a:
            r6.q = r0
        L3c:
            int r6 = r6.q
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlr.b():int");
    }

    public final long c() {
        return (this.d & 4294967295L) | (this.f << 32);
    }

    public final Object d() {
        Object objG;
        bte bteVar = this.b;
        if (bteVar == null || (objG = bteVar.g()) == null) {
            return null;
        }
        return objG instanceof dlv ? ((dlv) objG).b : objG;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlr)) {
            return false;
        }
        dlr dlrVar = (dlr) obj;
        return this.a == dlrVar.a && a.ao(this.b, dlrVar.b) && a.q(this.c, dlrVar.c) && this.d == dlrVar.d && this.e == dlrVar.e && this.f == dlrVar.f && this.g == dlrVar.g && a.q(this.h, dlrVar.h) && a.ao(this.p, dlrVar.p) && this.i == dlrVar.i && a.ao(this.j, dlrVar.j) && a.ao(this.k, dlrVar.k) && a.ao(this.l, dlrVar.l) && this.m == dlrVar.m;
    }

    public final int hashCode() {
        bte bteVar = this.b;
        return (((((((((((((((((((((((((this.a * 31) + (bteVar == null ? 0 : bteVar.hashCode())) * 31) + a.r(this.c)) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + a.r(this.h)) * 31) + this.p.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + a.o(this.m);
    }

    public final String toString() {
        return "TransformingLazyColumnMeasuredItem(index=" + this.a + ", placeable=" + this.b + ", containerConstraints=" + ((Object) cho.e(this.c)) + ", offset=" + this.d + ", spacing=" + this.e + ", leftPadding=" + this.f + ", rightPadding=" + this.g + ", measureScrollProgress=" + ((Object) dln.a(this.h)) + ", horizontalAlignment=" + this.p + ", layoutDirection=" + this.i + ", animationProvider=" + this.j + ", key=" + this.k + ", contentType=" + this.l + ", isInMeasure=" + this.m + ')';
    }
}
