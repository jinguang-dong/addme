package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvt extends tiv {
    private volatile tiv a;
    private volatile tiv b;
    private volatile tiv c;
    private final tih d;

    public lvt(tih tihVar) {
        this.d = tihVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // defpackage.tiv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object a(defpackage.tml r13) throws java.io.IOException {
        /*
            r12 = this;
            int r0 = r13.t()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Ld
            r13.p()
            return r1
        Ld:
            r13.m()
            r0 = 0
            r3 = 0
            r6 = r0
            r10 = r6
            r9 = r1
        L16:
            r7 = r3
        L17:
            boolean r1 = r13.r()
            if (r1 == 0) goto Lcf
            java.lang.String r1 = r13.h()
            int r3 = r13.t()
            if (r3 != r2) goto L2b
            r13.p()
            goto L17
        L2b:
            int r3 = r1.hashCode()
            r4 = 3
            r5 = 2
            r11 = 1
            switch(r3) {
                case -1233480310: goto L54;
                case 991957804: goto L4a;
                case 1351050271: goto L40;
                case 1367160062: goto L36;
                default: goto L35;
            }
        L35:
            goto L5e
        L36:
            java.lang.String r3 = "apex_size"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5e
            r1 = r11
            goto L5f
        L40:
            java.lang.String r3 = "target_os_prefix"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5e
            r1 = r5
            goto L5f
        L4a:
            java.lang.String r3 = "hal_version"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5e
            r1 = r0
            goto L5f
        L54:
            java.lang.String r3 = "min_os_version"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L5e
            r1 = r4
            goto L5f
        L5e:
            r1 = -1
        L5f:
            if (r1 == 0) goto Lb5
            if (r1 == r11) goto L9b
            if (r1 == r5) goto L84
            if (r1 == r4) goto L6b
            r13.q()
            goto L17
        L6b:
            tiv r1 = r12.a
            if (r1 != 0) goto L79
            tih r1 = r12.d
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            tiv r1 = r1.b(r3)
            r12.a = r1
        L79:
            java.lang.Object r1 = r1.a(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r10 = r1.intValue()
            goto L17
        L84:
            tiv r1 = r12.c
            if (r1 != 0) goto L92
            tih r1 = r12.d
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            tiv r1 = r1.b(r3)
            r12.c = r1
        L92:
            java.lang.Object r1 = r1.a(r13)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            goto L17
        L9b:
            tiv r1 = r12.b
            if (r1 != 0) goto La9
            tih r1 = r12.d
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            tiv r1 = r1.b(r3)
            r12.b = r1
        La9:
            java.lang.Object r1 = r1.a(r13)
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            goto L16
        Lb5:
            tiv r1 = r12.a
            if (r1 != 0) goto Lc3
            tih r1 = r12.d
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            tiv r1 = r1.b(r3)
            r12.a = r1
        Lc3:
            java.lang.Object r1 = r1.a(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r6 = r1.intValue()
            goto L17
        Lcf:
            r13.o()
            lvs r5 = new lvs
            r5.<init>(r6, r7, r9, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvt.a(tml):java.lang.Object");
    }

    public final String toString() {
        return "TypeAdapter(SidelineApexMetadata)";
    }
}
