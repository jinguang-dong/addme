package defpackage;

import android.hardware.HardwareBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pkz {
    private final int a;
    private final byte[] b;
    private long c;
    private long d;
    private int e;
    private long f;
    private long g;
    private int h;
    private final qpf i;
    private final mwq j;

    public pkz(qpf qpfVar) {
        this.i = qpfVar;
        int width = (((((HardwareBuffer) qpfVar.a).getWidth() * ((HardwareBuffer) qpfVar.a).getHeight()) * ((HardwareBuffer) qpfVar.a).getLayers()) / 104) * 104;
        this.a = width;
        this.b = new byte[width];
        this.j = new mwq(new pat() { // from class: pky
            @Override // defpackage.pat
            public final Object a() {
                return new pld();
            }
        }, width / 104);
    }

    private final synchronized void c() {
        qpf qpfVar = this.i;
        byte[] bArr = this.b;
        int i = this.a;
        qpfVar.f(bArr, 0, 0, i);
        this.c = 0L;
        this.d = 0L;
        this.e = 0;
        this.f = 0L;
        this.g = 0L;
        this.h = 0;
        for (int i2 = 0; i2 < i; i2 += 104) {
            long jAC = qpt.aC(bArr, i2);
            if (jAC > this.d) {
                this.d = jAC;
                this.e = i2;
            }
            if (jAC != 0) {
                long j = this.g;
                if (j == 0 || jAC < j) {
                    this.g = jAC;
                    this.h = i2;
                }
            }
        }
        if (this.d > 0) {
            this.c = qpt.aD(bArr, this.e);
        }
        if (this.g > 0) {
            this.f = qpt.aD(bArr, this.h);
        }
    }

    private final synchronized void d() {
        long jAC;
        if (this.d != 0 && this.g != 0) {
            e(this.e);
            byte[] bArr = this.b;
            long jAC2 = qpt.aC(bArr, this.e);
            long j = this.d;
            if (jAC2 != j) {
                c();
                return;
            }
            int i = this.e + 104;
            int i2 = this.a;
            long j2 = j + 1;
            int i3 = i % i2;
            while (true) {
                e(i3);
                jAC = qpt.aC(bArr, i3);
                if (jAC != j2) {
                    break;
                }
                this.e = i3;
                this.d = j2;
                this.c = qpt.aD(bArr, i3);
                j2++;
                i3 = (i3 + 104) % i2;
            }
            if (jAC == 0 || jAC <= this.g) {
                return;
            }
            this.h = i3;
            this.g = jAC;
            this.f = qpt.aD(bArr, i3);
            return;
        }
        c();
    }

    private final synchronized void e(int i) {
        this.i.f(this.b, i, i, 104);
    }

    public final synchronized void a(long j, long j2, List list) {
        list.clear();
        d();
        if (j <= this.c) {
            long jAD = this.f;
            if (j2 >= jAD) {
                long j3 = this.g;
                int i = this.h;
                while (true) {
                    if (jAD >= j && jAD <= j2) {
                        pld pldVar = (pld) this.j.N();
                        byte[] bArr = this.b;
                        pldVar.a = qpt.aB(bArr, i);
                        pldVar.b = qpt.aB(bArr, i + 4);
                        pldVar.c = qpt.aB(bArr, i + 8);
                        pldVar.d = qpt.aC(bArr, i);
                        pldVar.e = qpt.aD(bArr, i);
                        pldVar.f = qpt.aA(bArr, i + 24);
                        pldVar.g = qpt.aA(bArr, i + 28);
                        pldVar.h = qpt.aA(bArr, i + 32);
                        list.add(pldVar);
                    }
                    i += 104;
                    if (i >= this.a) {
                        i = 0;
                    }
                    byte[] bArr2 = this.b;
                    long jAC = qpt.aC(bArr2, i);
                    if (jAC != 0 && jAC >= j3) {
                        jAD = qpt.aD(bArr2, i);
                        if (jAD > j2) {
                            break;
                        } else {
                            j3 = jAC;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
    }

    final synchronized void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.j.O((pld) it.next());
        }
        list.clear();
    }
}
