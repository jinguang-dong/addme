package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgq implements Iterable, ukd {
    public static final bgq a = new bgq(0, 0, 0, null);
    public final long b;
    public final long c;
    public final long d;
    public final long[] e;

    private bgq(long j, long j2, long j3, long[] jArr) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }

    public final bgq a(bgq bgqVar) {
        bgq bgqVarB = this;
        bgq bgqVar2 = a;
        if (bgqVar == bgqVar2) {
            return bgqVarB;
        }
        if (bgqVarB == bgqVar2) {
            return bgqVar2;
        }
        long j = bgqVar.d;
        long j2 = bgqVarB.d;
        if (j == j2) {
            long[] jArr = bgqVar.e;
            long[] jArr2 = bgqVarB.e;
            if (jArr == jArr2) {
                return new bgq((~bgqVar.b) & bgqVarB.b, bgqVarB.c & (~bgqVar.c), j2, jArr2);
            }
        }
        long[] jArr3 = bgqVar.e;
        if (jArr3 != null) {
            for (long j3 : jArr3) {
                bgqVarB = bgqVarB.b(j3);
            }
        }
        long j4 = bgqVar.c;
        if (j4 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j4) != 0) {
                    bgqVarB = bgqVarB.b(i + j);
                }
            }
        }
        long j5 = bgqVar.b;
        if (j5 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j5) != 0) {
                    bgqVarB = bgqVarB.b(i2 + j + 64);
                }
            }
        }
        return bgqVarB;
    }

    public final bgq b(long j) {
        long[] jArr;
        int iZ;
        long[] jArr2;
        long j2 = this.d;
        long j3 = j - j2;
        if (ujp.b(j3, 0L) >= 0 && ujp.b(j3, 64L) < 0) {
            long j4 = 1 << ((int) j3);
            long j5 = this.c;
            if ((j5 & j4) != 0) {
                return new bgq(this.b, j5 & (~j4), j2, this.e);
            }
        } else if (ujp.b(j3, 64L) >= 0 && ujp.b(j3, 128L) < 0) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.b;
            if ((j7 & j6) != 0) {
                return new bgq(j7 & (~j6), this.c, j2, this.e);
            }
        } else if (ujp.b(j3, 0L) < 0 && (jArr = this.e) != null && (iZ = bay.z(jArr, j)) >= 0) {
            long j8 = this.b;
            long j9 = this.c;
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iZ > 0) {
                    rnt.ax(jArr, jArr3, 0, 0, iZ);
                }
                if (iZ < i) {
                    rnt.ax(jArr, jArr3, iZ, iZ + 1, length);
                }
                jArr2 = jArr3;
            }
            return new bgq(j8, j9, j2, jArr2);
        }
        return this;
    }

    public final bgq c(bgq bgqVar) {
        bgq bgqVarD = this;
        bgq bgqVarD2 = bgqVar;
        bgq bgqVar2 = a;
        if (bgqVarD2 == bgqVar2) {
            return bgqVarD;
        }
        if (bgqVarD == bgqVar2) {
            return bgqVarD2;
        }
        long j = bgqVarD2.d;
        long j2 = bgqVarD.d;
        if (j == j2) {
            long[] jArr = bgqVarD2.e;
            long[] jArr2 = bgqVarD.e;
            if (jArr == jArr2) {
                return new bgq(bgqVarD2.b | bgqVarD.b, bgqVarD.c | bgqVarD2.c, j2, jArr2);
            }
        }
        int i = 0;
        if (bgqVarD.e == null) {
            long j3 = bgqVarD.c;
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        bgqVarD2 = bgqVarD2.d(i2 + j2);
                    }
                }
            }
            long j4 = bgqVarD.b;
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        bgqVarD2 = bgqVarD2.d(i + j2 + 64);
                    }
                    i++;
                }
            }
            return bgqVarD2;
        }
        long[] jArr3 = bgqVarD2.e;
        if (jArr3 != null) {
            for (long j5 : jArr3) {
                bgqVarD = bgqVarD.d(j5);
            }
        }
        long j6 = bgqVarD2.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    bgqVarD = bgqVarD.d(i3 + j);
                }
            }
        }
        long j7 = bgqVarD2.b;
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    bgqVarD = bgqVarD.d(i + j + 64);
                }
                i++;
            }
        }
        return bgqVarD;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bgq d(long r31) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgq.d(long):bgq");
    }

    public final boolean e(long j) {
        long[] jArr;
        long j2 = j - this.d;
        if (ujp.b(j2, 0L) < 0 || ujp.b(j2, 64L) >= 0) {
            if (ujp.b(j2, 64L) < 0 || ujp.b(j2, 128L) >= 0) {
                if (ujp.b(j2, 0L) <= 0 && (jArr = this.e) != null && bay.z(jArr, j) >= 0) {
                    return true;
                }
            } else if (((1 << (((int) j2) - 64)) & this.b) != 0) {
                return true;
            }
        } else if (((1 << ((int) j2)) & this.c) != 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ull(new bgp(this, null)).a();
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(ske.bq(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
