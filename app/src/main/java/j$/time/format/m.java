package j$.time.format;

import j$.time.chrono.InterfaceC0018b;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class m extends j {
    public static final j$.time.h h = j$.time.h.Z(2000, 1, 1);
    public final InterfaceC0018b g;

    public m(j$.time.temporal.l lVar, int i, int i2, InterfaceC0018b interfaceC0018b, int i3) {
        super(lVar, i, i2, A.NOT_NEGATIVE, i3);
        this.g = interfaceC0018b;
    }

    @Override // j$.time.format.j
    public final long a(u uVar, long j) {
        long jAbs = Math.abs(j);
        InterfaceC0018b interfaceC0018b = this.g;
        long jH = interfaceC0018b != null ? j$.desugar.sun.nio.fs.g.D(uVar.a).C(interfaceC0018b).h(this.a) : 0;
        long[] jArr = j.f;
        if (j >= jH) {
            long j2 = jArr[this.b];
            if (j < jH + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // j$.time.format.j
    public final j b() {
        if (this.e == -1) {
            return this;
        }
        return new m(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j c(int i) {
        return new m(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j
    public final String toString() {
        return "ReducedValue(" + String.valueOf(this.a) + "," + this.b + "," + this.c + "," + String.valueOf(Objects.requireNonNullElse(this.g, 0)) + ")";
    }
}
