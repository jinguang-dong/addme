package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class D implements m {
    public static final D BEFORE_ROC;
    public static final D ROC;
    public static final /* synthetic */ D[] a;

    static {
        D d = new D("BEFORE_ROC", 0);
        BEFORE_ROC = d;
        D d2 = new D("ROC", 1);
        ROC = d2;
        a = new D[]{d, d2};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) a.clone();
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
