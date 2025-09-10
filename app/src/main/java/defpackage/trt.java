package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class trt extends tru {
    public trt(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.tru
    public final byte a(long j) {
        return Memory.peekByte(j);
    }

    @Override // defpackage.tru
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // defpackage.tru
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // defpackage.tru
    public final void d(Object obj, long j, boolean z) {
        if (trv.f) {
            trv.m(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            trv.n(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.tru
    public final void e(Object obj, long j, byte b) {
        if (trv.f) {
            trv.m(obj, j, b);
        } else {
            trv.n(obj, j, b);
        }
    }

    @Override // defpackage.tru
    public final void f(Object obj, long j, double d) {
        m(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.tru
    public final void g(Object obj, long j, float f) {
        l(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.tru
    public final boolean h(Object obj, long j) {
        return trv.f ? trv.v(obj, j) : trv.w(obj, j);
    }

    @Override // defpackage.tru
    public final void i(long j, byte[] bArr, long j2) {
        Memory.peekByteArray(j, bArr, 0, (int) j2);
    }
}
