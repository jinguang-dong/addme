package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aa implements Cloneable {
    public static final int[] e;
    private static final int h;
    public String a;
    public ArrayList c;
    public boolean d;
    private boolean g;
    public ArrayList b = new ArrayList();
    public final int f = h;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    static {
        /*
            java.lang.String r0 = defpackage.c.a()
            int r1 = r0.hashCode()
            r2 = -413919155(0xffffffffe754184d, float:-1.00159E24)
            r3 = 1
            if (r1 == r2) goto L1e
            r2 = -99796978(0xfffffffffa0d380e, float:-1.833127E35)
            if (r1 == r2) goto L14
            goto L28
        L14:
            java.lang.String r1 = "DOUBLE_OPTIONAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            r0 = 0
            goto L29
        L1e:
            java.lang.String r1 = "DOUBLE_REQUIRED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            r0 = r3
            goto L29
        L28:
            r0 = -1
        L29:
            if (r0 == 0) goto L35
            if (r0 != r3) goto L2f
            r3 = 2
            goto L35
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L35:
            defpackage.aa.h = r3
            int[] r0 = defpackage.a.ad()
            defpackage.aa.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa.<clinit>():void");
    }

    public aa() {
    }

    private final int j(int i) {
        char cCharAt;
        while (i < this.a.length() && (((cCharAt = this.a.charAt(i)) >= '0' || "+-.".indexOf(cCharAt) >= 0) && (cCharAt <= '9' || cCharAt == 'e' || cCharAt == 'E' || cCharAt == 8734))) {
            i++;
        }
        return i;
    }

    private final int k(int i) {
        String str = this.a;
        byte[] bArr = f.a;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 255) {
                if (cCharAt >= 8206) {
                    if (cCharAt > 12336) {
                        if (cCharAt >= 64830 && cCharAt <= 65094 && (cCharAt <= 64831 || cCharAt >= 65093)) {
                            break;
                        }
                    } else if (((f.c[f.b[(cCharAt - 8192) >> 5]] >> (cCharAt & 31)) & 1) != 0) {
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                if (f.a[cCharAt] != 0) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    private final int l(int i) {
        String str = this.a;
        byte[] bArr = f.a;
        while (i < str.length() && f.a(str.charAt(i))) {
            i++;
        }
        return i;
    }

    private final String m() {
        return o(this.a, 0);
    }

    private final String n(int i) {
        return o(this.a, i);
    }

    private static String o(String str, int i) {
        StringBuilder sb = new StringBuilder(44);
        if (i == 0) {
            sb.append("\"");
        } else {
            sb.append("[at pattern index ");
            sb.append(i);
            sb.append("] \"");
        }
        if (str.length() - i <= 24) {
            if (i != 0) {
                str = str.substring(i);
            }
            sb.append(str);
        } else {
            int i2 = i + 20;
            int i3 = i + 19;
            if (true == Character.isHighSurrogate(str.charAt(i3))) {
                i2 = i3;
            }
            sb.append((CharSequence) str, i, i2);
            sb.append(" ...");
        }
        sb.append("\"");
        return sb.toString();
    }

    private final void p(double d, int i, int i2) {
        int size;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            this.c = new ArrayList();
            size = 0;
        } else {
            size = arrayList.size();
            if (size > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.c.add(Double.valueOf(d));
        v(14, i, i2, size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        p(java.lang.Double.parseDouble(r6.a.substring(r7, r8)), r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[LOOP:0: B:23:0x0059->B:35:0x0078, LOOP_START, PHI: r0 r1 r3
      0x0059: PHI (r0v6 char) = (r0v5 char), (r0v11 char) binds: [B:12:0x0031, B:35:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:12:0x0031, B:35:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:12:0x0031, B:35:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void q(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r0 = r6.a
            char r0 = r0.charAt(r7)
            int r1 = r7 + 1
            r2 = 45
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L1d
            if (r1 == r8) goto L43
            int r0 = r7 + 2
            java.lang.String r2 = r6.a
            char r1 = r2.charAt(r1)
            r2 = r1
            r1 = r0
            r0 = r2
            r2 = r4
            goto L2f
        L1d:
            r2 = 43
            if (r0 != r2) goto L2e
            if (r1 == r8) goto L43
            int r0 = r7 + 2
            java.lang.String r2 = r6.a
            char r1 = r2.charAt(r1)
            r2 = r1
            r1 = r0
            r0 = r2
        L2e:
            r2 = r3
        L2f:
            r5 = 8734(0x221e, float:1.2239E-41)
            if (r0 != r5) goto L59
            if (r9 == 0) goto L43
            if (r1 != r8) goto L43
            int r8 = r8 - r7
            if (r4 == r2) goto L3d
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L3f
        L3d:
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
        L3f:
            r6.p(r0, r7, r8)
            return
        L43:
            java.lang.NumberFormatException r9 = new java.lang.NumberFormatException
            java.lang.String r6 = r6.a
            java.lang.String r6 = r6.substring(r7, r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Bad syntax for numeric value: "
            java.lang.String r6 = r7.concat(r6)
            r9.<init>(r6)
            throw r9
        L59:
            int r9 = r8 - r7
            r4 = 48
            if (r0 < r4) goto L83
            r4 = 57
            if (r0 > r4) goto L83
            int r3 = r3 * 10
            int r0 = r0 + (-48)
            int r4 = r2 + 32767
            int r3 = r3 + r0
            if (r3 <= r4) goto L6d
            goto L83
        L6d:
            if (r1 != r8) goto L78
            if (r2 == 0) goto L72
            int r3 = -r3
        L72:
            r8 = 13
            r6.v(r8, r7, r9, r3)
            return
        L78:
            java.lang.String r9 = r6.a
            int r0 = r1 + 1
            char r9 = r9.charAt(r1)
            r1 = r0
            r0 = r9
            goto L59
        L83:
            java.lang.String r0 = r6.a
            java.lang.String r8 = r0.substring(r7, r8)
            double r0 = java.lang.Double.parseDouble(r8)
            r6.p(r0, r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa.q(int, int, boolean):void");
    }

    private final boolean r(int i) {
        return i > 0 || ((z) this.b.get(0)).e == 1;
    }

    private final boolean s(int i) {
        char cCharAt = this.a.charAt(i);
        if (cCharAt != 's' && cCharAt != 'S') {
            return false;
        }
        char cCharAt2 = this.a.charAt(i + 1);
        if (cCharAt2 != 'e' && cCharAt2 != 'E') {
            return false;
        }
        int i2 = i + 3;
        char cCharAt3 = this.a.charAt(i + 2);
        if (cCharAt3 != 'l' && cCharAt3 != 'L') {
            return false;
        }
        int i3 = i + 4;
        char cCharAt4 = this.a.charAt(i2);
        if (cCharAt4 != 'e' && cCharAt4 != 'E') {
            return false;
        }
        int i4 = i + 5;
        char cCharAt5 = this.a.charAt(i3);
        if (cCharAt5 != 'c' && cCharAt5 != 'C') {
            return false;
        }
        char cCharAt6 = this.a.charAt(i4);
        return cCharAt6 == 't' || cCharAt6 == 'T';
    }

    private final void u(int i, int i2, int i3, int i4, int i5) {
        ((z) this.b.get(i)).d = this.b.size();
        v(i2, i3, i4, i5);
    }

    private final void v(int i, int i2, int i3, int i4) {
        this.b.add(new z(i, i2, i3, i4));
    }

    public final double a(z zVar) {
        int i = zVar.e;
        if (i == 13) {
            return zVar.c;
        }
        if (i == 14) {
            return ((Double) this.c.get(zVar.c)).doubleValue();
        }
        return -1.23456789E8d;
    }

    public final int b() {
        return this.b.size();
    }

    public final int c(int i) {
        int i2 = ((z) this.b.get(i)).d;
        return i2 < i ? i : i2;
    }

    public final Object clone() {
        return e();
    }

    public final z d(int i) {
        return (z) this.b.get(i);
    }

    public final aa e() {
        try {
            aa aaVar = (aa) super.clone();
            aaVar.b = (ArrayList) this.b.clone();
            ArrayList arrayList = this.c;
            if (arrayList != null) {
                aaVar.c = (ArrayList) arrayList.clone();
            }
            aaVar.g = false;
            return aaVar;
        } catch (CloneNotSupportedException e2) {
            throw new ab(e2);
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aa aaVar = (aa) obj;
        int i = this.f;
        int i2 = aaVar.f;
        if (i != 0) {
            return i == i2 && ((str = this.a) != null ? str.equals(aaVar.a) : aaVar.a == null) && this.b.equals(aaVar.b);
        }
        throw null;
    }

    public final String f(z zVar) {
        int i = zVar.a;
        return this.a.substring(i, zVar.b + i);
    }

    public final boolean g(z zVar, String str) {
        return this.a.regionMatches(zVar.a, str, 0, zVar.b);
    }

    public final int h(int i) {
        return ((z) this.b.get(i)).e;
    }

    public final int hashCode() {
        int i = this.f;
        a.aF(i);
        String str = this.a;
        return (((i * 37) + (str != null ? str.hashCode() : 0)) * 37) + this.b.hashCode();
    }

    public final void i(String str) {
        this.a = str;
        this.d = false;
        this.b.clear();
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        t(0, 0, 0, 1);
    }

    public final String toString() {
        return this.a;
    }

    public aa(String str) {
        i(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:283:0x049a, code lost:
    
        throw new java.lang.IllegalArgumentException("Missing choice argument pattern in ".concat(m()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x05ed, code lost:
    
        throw new java.lang.IllegalArgumentException("No message fragment after " + defpackage.e.a(r4).toLowerCase(java.util.Locale.ENGLISH) + " selector: " + n(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x062c, code lost:
    
        if (r9 == r(r6)) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x062e, code lost:
    
        if (r3 == false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0668, code lost:
    
        throw new java.lang.IllegalArgumentException("Missing 'other' keyword in " + defpackage.e.a(r4).toLowerCase(java.util.Locale.ENGLISH) + " pattern in " + m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0692, code lost:
    
        throw new java.lang.IllegalArgumentException("Bad " + defpackage.e.a(r4).toLowerCase(java.util.Locale.ENGLISH) + " pattern syntax: " + n(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x06b0, code lost:
    
        throw new java.lang.IllegalArgumentException("Bad argument syntax: ".concat(n(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0147, code lost:
    
        throw new java.lang.IndexOutOfBoundsException("Argument number too large: ".concat(n(r3)));
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x030c A[PHI: r9
      0x030c: PHI (r9v24 int) = (r9v6 int), (r9v8 int), (r9v6 int) binds: [B:174:0x0292, B:206:0x030b, B:169:0x0285] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int t(int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 1890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa.t(int, int, int, int):int");
    }
}
