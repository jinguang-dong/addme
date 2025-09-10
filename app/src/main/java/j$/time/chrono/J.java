package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class J implements m {
    public static final J BE;
    public static final J BEFORE_BE;
    public static final /* synthetic */ J[] a;

    static {
        J j = new J("BEFORE_BE", 0);
        BEFORE_BE = j;
        J j2 = new J("BE", 1);
        BE = j2;
        a = new J[]{j, j2};
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) a.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long D(j$.time.temporal.l lVar) {
        return j$.desugar.sun.nio.fs.g.m(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object N(j$.desugar.sun.nio.fs.n nVar) {
        return j$.desugar.sun.nio.fs.g.s(this, nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean c(j$.time.temporal.l lVar) {
        return j$.desugar.sun.nio.fs.g.o(this, lVar);
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int h(j$.time.temporal.l lVar) {
        return j$.desugar.sun.nio.fs.g.l(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal s(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.ERA);
    }
}
