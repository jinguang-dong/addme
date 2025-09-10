package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czb implements cyu {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public czb(java.lang.String r7, byte[] r8, int r9) {
        /*
            r6 = this;
            r6.<init>()
            int r0 = r7.hashCode()
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 1
            r5 = 0
            switch(r0) {
                case -1949883051: goto L38;
                case -269399509: goto L2e;
                case 1011693540: goto L24;
                case 1098277265: goto L1a;
                case 2002123038: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "auxiliary.tracks.map"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L42
            r0 = r1
            goto L43
        L1a:
            java.lang.String r0 = "auxiliary.tracks.offset"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L42
            r0 = r4
            goto L43
        L24:
            java.lang.String r0 = "auxiliary.tracks.length"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L42
            r0 = r2
            goto L43
        L2e:
            java.lang.String r0 = "auxiliary.tracks.interleaved"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L42
            r0 = r3
            goto L43
        L38:
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L42
            r0 = r5
            goto L43
        L42:
            r0 = -1
        L43:
            if (r0 == 0) goto L7a
            if (r0 == r4) goto L6b
            if (r0 == r2) goto L6b
            if (r0 == r1) goto L63
            if (r0 == r3) goto L4e
            goto L88
        L4e:
            r0 = 75
            if (r9 != r0) goto L5e
            int r9 = r8.length
            if (r9 != r4) goto L5d
            r9 = r8[r5]
            if (r9 == 0) goto L5b
            if (r9 != r4) goto L5d
        L5b:
            r9 = r0
            goto L5f
        L5d:
            r9 = r0
        L5e:
            r4 = r5
        L5f:
            defpackage.a.I(r4)
            goto L88
        L63:
            if (r9 != 0) goto L66
            goto L67
        L66:
            r4 = r5
        L67:
            defpackage.a.I(r4)
            goto L88
        L6b:
            r0 = 78
            if (r9 != r0) goto L75
            int r0 = r8.length
            r1 = 8
            if (r0 != r1) goto L75
            goto L76
        L75:
            r4 = r5
        L76:
            defpackage.a.I(r4)
            goto L88
        L7a:
            r0 = 23
            if (r9 != r0) goto L84
            int r9 = r8.length
            if (r9 != r3) goto L83
            r9 = r0
            goto L85
        L83:
            r9 = r0
        L84:
            r4 = r5
        L85:
            defpackage.a.I(r4)
        L88:
            r6.a = r7
            r6.b = r8
            r6.c = r5
            r6.d = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czb.<init>(java.lang.String, byte[], int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            czb czbVar = (czb) obj;
            if (this.a.equals(czbVar.a) && Arrays.equals(this.b, czbVar.b) && this.d == czbVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b)) * 961) + this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0138 A[LOOP:0: B:30:0x0135->B:32:0x0138, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czb.toString():java.lang.String");
    }
}
