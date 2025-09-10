package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iue {
    public final long a;
    public final iub b;

    public iue(long j, iub iubVar) {
        this.a = j;
        this.b = iubVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iue)) {
            return false;
        }
        iue iueVar = (iue) obj;
        long j = this.a;
        long j2 = iueVar.a;
        long j3 = uls.a;
        return a.q(j, j2) && a.ao(this.b, iueVar.b);
    }

    public final int hashCode() {
        long j = uls.a;
        iub iubVar = this.b;
        return (a.r(this.a) * 31) + (iubVar == null ? 0 : iubVar.hashCode());
    }

    public /* synthetic */ iue(long j) {
        this(j, null);
    }

    public final String toString() {
        int iH;
        boolean z;
        int i;
        String string;
        long j = uls.a;
        long jF = this.a;
        if (jF == 0) {
            string = "0s";
        } else if (jF == uls.a) {
            string = "Infinity";
        } else if (jF == uls.b) {
            string = "-Infinity";
        } else {
            boolean zJ = uls.j(jF);
            StringBuilder sb = new StringBuilder();
            if (zJ) {
                sb.append('-');
            }
            if (uls.j(jF)) {
                jF = uls.f(jF);
            }
            long jE = uls.e(jF, ulu.g);
            int i2 = 0;
            int iE = uls.i(jF) ? 0 : (int) (uls.e(jF, ulu.f) % 24);
            int iE2 = uls.i(jF) ? 0 : (int) (uls.e(jF, ulu.e) % 60);
            int iE3 = uls.i(jF) ? 0 : (int) (uls.e(jF, ulu.d) % 60);
            if (uls.i(jF)) {
                iH = 0;
            } else {
                boolean zH = uls.h(jF);
                long jC = uls.c(jF);
                iH = (int) (zH ? ujp.h(jC % 1000) : jC % 1000000000);
            }
            boolean z2 = jE != 0;
            boolean z3 = iE != 0;
            boolean z4 = iE2 != 0;
            if (iE3 != 0) {
                z = true;
            } else if (iH != 0) {
                z = true;
                iE3 = 0;
            } else {
                iH = 0;
                iE3 = 0;
                z = false;
            }
            if (z2) {
                sb.append(jE);
                sb.append('d');
                i = 1;
            } else {
                i = 0;
            }
            if (z3 || (z2 && (z4 || z))) {
                int i3 = i + 1;
                if (i > 0) {
                    sb.append(' ');
                }
                sb.append(iE);
                sb.append('h');
                i = i3;
            }
            if (z4 || (z && (z3 || z2))) {
                int i4 = i + 1;
                if (i > 0) {
                    sb.append(' ');
                }
                sb.append(iE2);
                sb.append('m');
                i = i4;
            }
            if (z) {
                int i5 = i + 1;
                if (i > 0) {
                    sb.append(' ');
                }
                if (iE3 == 0) {
                    if (!z2 && !z3 && !z4) {
                        if (iH >= 1000000) {
                            uls.k(sb, iH / 1000000, iH % 1000000, 6, "ms");
                        } else if (iH >= 1000) {
                            uls.k(sb, iH / 1000, iH % 1000, 3, PJGqOKsIpSdZ.yML);
                        } else {
                            sb.append(iH);
                            sb.append("ns");
                        }
                    }
                    i = i5;
                } else {
                    i2 = iE3;
                }
                uls.k(sb, i2, iH, 9, "s");
                i = i5;
            }
            if (zJ && i > 1) {
                sb.insert(1, '(').append(')');
            }
            string = sb.toString();
        }
        return "LapReportEntry(duration=" + string + ", trigger=" + this.b + ")";
    }
}
