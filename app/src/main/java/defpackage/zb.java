package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zb implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public zb() {
        this((byte[]) null);
    }

    public final int a(long j) {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != zc.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return aae.b(this.b, this.d, j);
    }

    public final int b() {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != zc.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return this.d;
    }

    public final long c(int i) {
        if (i < 0 || i >= this.d) {
            a.bl(a.bv(i, "Expected index to be within 0..size()-1, but was "));
        }
        if (this.a) {
            int i2 = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != zc.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.b[i];
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        zb zbVar = (zb) objClone;
        zbVar.b = (long[]) this.b.clone();
        zbVar.c = (Object[]) this.c.clone();
        return zbVar;
    }

    public final Object d(long j) {
        Object obj;
        int iB = aae.b(this.b, this.d, j);
        if (iB < 0 || (obj = this.c[iB]) == zc.a) {
            return null;
        }
        return obj;
    }

    public final Object e(int i) {
        if (i < 0 || i >= this.d) {
            a.bl(a.bv(i, "Expected index to be within 0..size()-1, but was "));
        }
        if (this.a) {
            int i2 = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != zc.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.c[i];
    }

    public final void f() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final void g(long j, Object obj) {
        int iB = aae.b(this.b, this.d, j);
        if (iB >= 0) {
            this.c[iB] = obj;
            return;
        }
        int i = ~iB;
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == zc.a) {
                this.b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = objArr2[i4];
                    if (obj2 != zc.a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj2;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.d = i3;
                i = ~aae.b(this.b, i3, j);
            }
        }
        int i5 = this.d;
        long[] jArr2 = this.b;
        if (i5 >= jArr2.length) {
            int iE = aae.e(i5 + 1);
            long[] jArrCopyOf = Arrays.copyOf(jArr2, iE);
            jArrCopyOf.getClass();
            this.b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, iE);
            objArrCopyOf.getClass();
            this.c = objArrCopyOf;
        }
        int i6 = this.d;
        if (i6 - i != 0) {
            long[] jArr3 = this.b;
            int i7 = i + 1;
            rnt.ax(jArr3, jArr3, i7, i, i6);
            Object[] objArr3 = this.c;
            rnt.ay(objArr3, objArr3, i7, i, this.d);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public final void h(long j) {
        int iB = aae.b(this.b, this.d, j);
        if (iB >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[iB];
            Object obj2 = zc.a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.a = true;
            }
        }
    }

    public final boolean i(long j) {
        return a(j) >= 0;
    }

    public final boolean j() {
        return b() == 0;
    }

    public final String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object objE = e(i2);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public zb(int i) {
        if (i == 0) {
            this.b = aae.b;
            this.c = aae.c;
        } else {
            int iE = aae.e(i);
            this.b = new long[iE];
            this.c = new Object[iE];
        }
    }

    public /* synthetic */ zb(byte[] bArr) {
        this(10);
    }
}
