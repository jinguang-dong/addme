package j$.time;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k implements TemporalAccessor, TemporalAdjuster {
    public static final k APRIL;
    public static final k AUGUST;
    public static final k DECEMBER;
    public static final k FEBRUARY;
    public static final k JANUARY;
    public static final k JULY;
    public static final k JUNE;
    public static final k MARCH;
    public static final k MAY;
    public static final k NOVEMBER;
    public static final k OCTOBER;
    public static final k SEPTEMBER;
    public static final k[] a;
    public static final /* synthetic */ k[] b;

    static {
        k kVar = new k("JANUARY", 0);
        JANUARY = kVar;
        k kVar2 = new k("FEBRUARY", 1);
        FEBRUARY = kVar2;
        k kVar3 = new k("MARCH", 2);
        MARCH = kVar3;
        k kVar4 = new k("APRIL", 3);
        APRIL = kVar4;
        k kVar5 = new k("MAY", 4);
        MAY = kVar5;
        k kVar6 = new k("JUNE", 5);
        JUNE = kVar6;
        k kVar7 = new k("JULY", 6);
        JULY = kVar7;
        k kVar8 = new k("AUGUST", 7);
        AUGUST = kVar8;
        k kVar9 = new k("SEPTEMBER", 8);
        SEPTEMBER = kVar9;
        k kVar10 = new k("OCTOBER", 9);
        OCTOBER = kVar10;
        k kVar11 = new k("NOVEMBER", 10);
        NOVEMBER = kVar11;
        k kVar12 = new k("DECEMBER", 11);
        DECEMBER = kVar12;
        b = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12};
        a = values();
    }

    public static k R(int i) {
        if (i >= 1 && i <= 12) {
            return a[i - 1];
        }
        throw new b("Invalid value for MonthOfYear: " + i);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (lVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
        }
        return lVar.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object N(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.m.b ? j$.time.chrono.s.c : nVar == j$.time.temporal.m.c ? ChronoUnit.MONTHS : j$.time.temporal.m.c(this, nVar);
    }

    public final int O(boolean z) {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 60;
            case 3:
                return (z ? 1 : 0) + 91;
            case 4:
                return (z ? 1 : 0) + ScriptIntrinsicBLAS.UPPER;
            case 5:
                return (z ? 1 : 0) + 152;
            case 6:
                return (z ? 1 : 0) + 182;
            case 7:
                return (z ? 1 : 0) + 213;
            case 8:
                return (z ? 1 : 0) + 244;
            case 9:
                return (z ? 1 : 0) + 274;
            case 10:
                return (z ? 1 : 0) + 305;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public final int P(boolean z) {
        int iOrdinal = ordinal();
        return iOrdinal != 1 ? (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31 : z ? 29 : 28;
    }

    public final int Q() {
        int iOrdinal = ordinal();
        if (iOrdinal != 1) {
            return (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31;
        }
        return 29;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.MONTH_OF_YEAR : lVar != null && lVar.h(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.MONTH_OF_YEAR ? getValue() : j$.time.temporal.m.a(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.MONTH_OF_YEAR ? lVar.range() : j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal s(Temporal temporal) {
        if (!j$.desugar.sun.nio.fs.g.D(temporal).equals(j$.time.chrono.s.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return temporal.a(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
