package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czh {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final byte n;
    public final byte o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public czh(qev qevVar) {
        int iD;
        int iD2;
        boolean zG;
        ?? r8;
        byte bD;
        boolean zG2 = true;
        a.I(qevVar.a == 1);
        byte[] bArr = new byte[((ByteBuffer) qevVar.b).remaining()];
        ((ByteBuffer) qevVar.b).asReadOnlyBuffer().get(bArr);
        rig rigVar = new rig(bArr);
        this.c = rigVar.d(3);
        rigVar.e();
        boolean zG3 = rigVar.g();
        this.a = zG3;
        if (zG3) {
            iD2 = rigVar.d(5);
            this.b = false;
            this.f = false;
            r8 = 0;
            iD = 0;
        } else {
            if (rigVar.g()) {
                rigVar.f(64);
                if (rigVar.g()) {
                    int i = 0;
                    while (!rigVar.g()) {
                        i++;
                    }
                    if (i < 32) {
                        rigVar.f(i);
                    }
                }
                boolean zG4 = rigVar.g();
                this.b = zG4;
                if (zG4) {
                    rigVar.f(47);
                }
            } else {
                this.b = false;
            }
            this.f = rigVar.g();
            int iD3 = rigVar.d(5);
            int iD4 = 0;
            int i2 = 0;
            boolean z = false;
            iD = 0;
            while (i2 <= iD3) {
                rigVar.f(12);
                if (i2 == 0) {
                    iD4 = rigVar.d(5);
                    zG = z;
                    if (iD4 > 7) {
                        zG = rigVar.g();
                    }
                } else {
                    zG = z;
                    if (rigVar.d(5) > 7) {
                        rigVar.e();
                        zG = z;
                    }
                }
                if (this.b) {
                    rigVar.e();
                }
                if (this.f && rigVar.g()) {
                    if (i2 == 0) {
                        iD = rigVar.d(4);
                    } else {
                        rigVar.f(4);
                    }
                }
                i2++;
                z = zG;
            }
            iD2 = iD4;
            r8 = z;
        }
        int iD5 = rigVar.d(4);
        int iD6 = rigVar.d(4);
        rigVar.f(iD5 + 1);
        rigVar.f(iD6 + 1);
        if (!this.a && rigVar.g()) {
            rigVar.f(4);
            rigVar.f(3);
        }
        rigVar.f(3);
        if (!this.a) {
            rigVar.f(4);
            boolean zG5 = rigVar.g();
            if (zG5) {
                rigVar.f(2);
            }
            if ((rigVar.g() || rigVar.g()) && !rigVar.g()) {
                rigVar.g();
            }
            if (zG5) {
                rigVar.d(3);
            }
        }
        this.d = iD2;
        this.e = r8;
        this.g = iD;
        rigVar.f(3);
        boolean zG6 = rigVar.g();
        this.h = zG6;
        if (this.c == 2 && zG6) {
            this.i = rigVar.g();
        } else {
            this.i = false;
        }
        if (this.c != 1) {
            this.j = rigVar.g();
        } else {
            this.j = false;
        }
        if (rigVar.g()) {
            this.n = (byte) rigVar.d(8);
            this.o = (byte) rigVar.d(8);
            bD = (byte) rigVar.d(8);
        } else {
            this.n = (byte) 0;
            this.o = (byte) 0;
            bD = 0;
        }
        if (this.j) {
            rigVar.e();
            this.k = false;
            this.l = false;
            this.m = 0;
        } else if (this.n == 1 && this.o == 13 && bD == 0) {
            this.k = false;
            this.l = false;
            this.m = 0;
        } else {
            rigVar.e();
            int i3 = this.c;
            if (i3 == 0) {
                this.k = true;
                this.l = true;
            } else {
                if (i3 == 1) {
                    this.k = false;
                    this.l = false;
                } else {
                    if (this.i) {
                        boolean zG7 = rigVar.g();
                        this.k = zG7;
                        if (zG7) {
                            zG2 = rigVar.g();
                            this.l = zG2;
                        }
                    } else {
                        this.k = true;
                    }
                    this.l = false;
                }
                zG2 = false;
            }
            if (this.k && zG2) {
                this.m = rigVar.d(2);
            } else {
                this.m = 0;
            }
        }
        rigVar.e();
    }
}
