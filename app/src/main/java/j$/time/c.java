package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c implements TemporalAccessor, TemporalAdjuster {
    public static final c FRIDAY;
    public static final c MONDAY;
    public static final c SATURDAY;
    public static final c SUNDAY;
    public static final c THURSDAY;
    public static final c TUESDAY;
    public static final c WEDNESDAY;
    public static final c[] a;
    public static final /* synthetic */ c[] b;

    static {
        c cVar = new c("MONDAY", 0);
        MONDAY = cVar;
        c cVar2 = new c("TUESDAY", 1);
        TUESDAY = cVar2;
        c cVar3 = new c("WEDNESDAY", 2);
        WEDNESDAY = cVar3;
        c cVar4 = new c("THURSDAY", 3);
        THURSDAY = cVar4;
        c cVar5 = new c("FRIDAY", 4);
        FRIDAY = cVar5;
        c cVar6 = new c("SATURDAY", 5);
        SATURDAY = cVar6;
        c cVar7 = new c("SUNDAY", 6);
        SUNDAY = cVar7;
        b = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        a = values();
    }

    public static c O(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        throw new b("Invalid value for DayOfWeek: " + i);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (lVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(lVar)));
        }
        return lVar.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object N(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.m.c ? ChronoUnit.DAYS : j$.time.temporal.m.c(this, nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.DAY_OF_WEEK : lVar != null && lVar.h(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.m.a(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.DAY_OF_WEEK ? lVar.range() : j$.time.temporal.m.d(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal s(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
