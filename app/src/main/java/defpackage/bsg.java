package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsg implements bss {
    final /* synthetic */ bsn a;
    final /* synthetic */ int b;
    final /* synthetic */ bss c;
    private final /* synthetic */ bss d;

    public bsg(bss bssVar, bsn bsnVar, int i, bss bssVar2) {
        this.a = bsnVar;
        this.b = i;
        this.c = bssVar2;
        this.d = bssVar;
    }

    @Override // defpackage.bss
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.bss
    public final int b() {
        return this.d.b();
    }

    @Override // defpackage.bss
    public final Map e() {
        return this.d.e();
    }

    @Override // defpackage.bss
    public final void f() {
        int i;
        bsn bsnVar = this.a;
        bsnVar.e = this.b;
        this.c.f();
        zu zuVar = bsnVar.o;
        long[] jArr = zuVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = zuVar.b[i5];
                        btr btrVar = (btr) zuVar.c[i5];
                        int iA = bsnVar.h.a(obj);
                        if (iA < 0 || iA >= bsnVar.e) {
                            btrVar.b();
                            zuVar.h(i5);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.bss
    public final void g() {
        this.d.g();
    }
}
