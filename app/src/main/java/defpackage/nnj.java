package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nnj implements Comparable {
    private final int[] a;

    public nnj(String str) {
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        if (length < 2) {
            throw new IllegalArgumentException("Unrecognized version name is found: ".concat(String.valueOf(str)));
        }
        this.a = new int[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.a[i] = Integer.parseInt(strArrSplit[i]);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException("Unrecognized version name is found: ".concat(String.valueOf(str)));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        r8 = r9.a;
        r9 = r8.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r3 >= r9) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r3 >= r8.length) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
    
        r9 = r8[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        if (r9 <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
    
        if (r9 >= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r9 >= r2.length) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0031, code lost:
    
        r8 = r2[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r8 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        if (r8 >= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0038, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
    
        return 0;
     */
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(defpackage.nnj r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L2:
            int[] r2 = r8.a
            int r3 = r2.length
            r4 = -1
            r5 = 1
            if (r1 >= r3) goto L1b
            int[] r6 = r9.a
            int r7 = r6.length
            if (r1 >= r7) goto L1b
            r2 = r2[r1]
            r3 = r6[r1]
            if (r2 <= r3) goto L15
            return r5
        L15:
            if (r2 >= r3) goto L18
            return r4
        L18:
            int r1 = r1 + 1
            goto L2
        L1b:
            int[] r8 = r9.a
            int r9 = r8.length
            if (r3 >= r9) goto L2e
        L20:
            int r9 = r8.length
            if (r3 >= r9) goto L3c
            r9 = r8[r3]
            if (r9 <= 0) goto L28
            return r5
        L28:
            if (r9 >= 0) goto L2b
            return r4
        L2b:
            int r3 = r3 + 1
            goto L20
        L2e:
            int r8 = r2.length
            if (r9 >= r8) goto L3c
            r8 = r2[r9]
            if (r8 <= 0) goto L36
            return r5
        L36:
            if (r8 >= 0) goto L39
            return r4
        L39:
            int r9 = r9 + 1
            goto L2e
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnj.compareTo(nnj):int");
    }
}
