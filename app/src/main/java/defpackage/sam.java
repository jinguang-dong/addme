package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sam implements Serializable {
    public final Comparator a;
    public final boolean b;
    public final Object c;
    public final boolean d;
    public final Object e;
    public final int f;
    public final int g;

    public sam(Comparator comparator, boolean z, Object obj, int i, boolean z2, Object obj2, int i2) {
        comparator.getClass();
        this.a = comparator;
        this.b = z;
        this.d = z2;
        this.c = obj;
        this.f = i;
        this.e = obj2;
        this.g = i2;
        if (z) {
            comparator.compare(obj, obj);
        }
        if (z2) {
            comparator.compare(obj2, obj2);
        }
        if (z && z2) {
            int iCompare = comparator.compare(obj, obj2);
            rnt.I(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (iCompare == 0) {
                a.I((i == 1 && i2 == 1) ? false : true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.sam a(defpackage.sam r10) {
        /*
            r9 = this;
            java.util.Comparator r1 = r9.a
            java.util.Comparator r0 = r10.a
            boolean r0 = r1.equals(r0)
            defpackage.a.I(r0)
            boolean r0 = r9.b
            r2 = 1
            if (r0 != 0) goto L17
            boolean r0 = r10.b
            java.lang.Object r3 = r10.c
            int r4 = r10.f
            goto L30
        L17:
            int r4 = r9.f
            java.lang.Object r3 = r9.c
            boolean r5 = r10.b
            if (r5 == 0) goto L30
            java.lang.Object r5 = r10.c
            int r6 = r1.compare(r3, r5)
            if (r6 < 0) goto L2d
            if (r6 != 0) goto L30
            int r6 = r10.f
            if (r6 != r2) goto L30
        L2d:
            int r4 = r10.f
            r3 = r5
        L30:
            boolean r5 = r9.d
            java.lang.Object r6 = r9.e
            int r9 = r9.g
            if (r5 != 0) goto L3f
            boolean r5 = r10.d
            java.lang.Object r6 = r10.e
            int r9 = r10.g
            goto L54
        L3f:
            boolean r7 = r10.d
            if (r7 == 0) goto L54
            java.lang.Object r7 = r10.e
            int r8 = r1.compare(r6, r7)
            if (r8 > 0) goto L51
            if (r8 != 0) goto L54
            int r8 = r10.g
            if (r8 != r2) goto L54
        L51:
            int r9 = r10.g
            r6 = r7
        L54:
            if (r0 == 0) goto L68
            if (r5 == 0) goto L68
            int r10 = r1.compare(r3, r6)
            r7 = 2
            if (r10 > 0) goto L65
            if (r10 != 0) goto L68
            if (r4 != r2) goto L68
            if (r9 != r2) goto L69
        L65:
            r4 = r2
            r3 = r6
            goto L69
        L68:
            r7 = r9
        L69:
            r2 = r0
            sam r0 = new sam
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sam.a(sam):sam");
    }

    final boolean b(Object obj) {
        return (d(obj) || c(obj)) ? false : true;
    }

    final boolean c(Object obj) {
        if (!this.d) {
            return false;
        }
        int iCompare = this.a.compare(obj, this.e);
        return ((iCompare == 0) & (this.g == 1)) | (iCompare > 0);
    }

    final boolean d(Object obj) {
        if (!this.b) {
            return false;
        }
        int iCompare = this.a.compare(obj, this.c);
        return ((iCompare == 0) & (this.f == 1)) | (iCompare < 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sam) {
            sam samVar = (sam) obj;
            if (this.a.equals(samVar.a) && this.b == samVar.b && this.d == samVar.d && this.f == samVar.f && this.g == samVar.g && a.K(this.c, samVar.c) && a.K(this.e, samVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, Integer.valueOf(this.f), this.e, Integer.valueOf(this.g)});
    }

    public final String toString() {
        String string = this.a.toString();
        String str = this.b ? this.c : "-∞";
        boolean z = this.d;
        String strValueOf = String.valueOf(str);
        String str2 = z ? this.e : "∞";
        char c = this.f == 2 ? '[' : '(';
        char c2 = this.g == 2 ? ']' : ')';
        return string + ":" + c + strValueOf + "," + String.valueOf(str2) + c2;
    }
}
