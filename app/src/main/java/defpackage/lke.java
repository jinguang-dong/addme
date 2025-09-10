package defpackage;

import android.util.Range;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
class lke implements pau {
    private static final sgv b = sgv.g("lke");
    public final sbv a;
    private final AtomicBoolean c = new AtomicBoolean(true);
    private final owq d;
    private final owq e;
    private final sbv f;
    private final owf g;
    private final hbj h;

    public lke(owq owqVar, owq owqVar2, sbv sbvVar, sbv sbvVar2, owf owfVar, hbj hbjVar) {
        this.d = owqVar;
        this.e = owqVar2;
        this.f = sbvVar;
        this.a = sbvVar2;
        this.g = owfVar;
        this.h = hbjVar;
    }

    private static float b(Range range, Range range2, float f) {
        float fFloatValue = f - ((Float) range.getLower()).floatValue();
        float fFloatValue2 = ((Float) range2.getUpper()).floatValue() - ((Float) range2.getLower()).floatValue();
        return ((fFloatValue * fFloatValue2) / (((Float) range.getUpper()).floatValue() - ((Float) range.getLower()).floatValue())) + ((Float) range2.getLower()).floatValue();
    }

    @Override // defpackage.pau
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        lkk lkkVar;
        float fB;
        Boolean bool = (Boolean) obj;
        owq owqVar = this.d;
        lkk lkkVar2 = (lkk) owqVar.dL();
        owq owqVar2 = this.e;
        final float fFloatValue = ((Float) owqVar2.dL()).floatValue();
        if (this.c.compareAndSet(true, false)) {
            lkkVar = bool.booleanValue() ? lkk.WIDE : lkk.AUTO;
            fB = ((Float) owqVar2.dL()).floatValue();
        } else if (!bool.booleanValue()) {
            lkkVar = lkk.AUTO;
            if (lkkVar2 == lkkVar) {
                ((sgt) b.c().M(4181)).s("Unexpected lens selection transition, expected non-AUTO selection.");
                return;
            }
            Range range = (Range) this.f.get(lkkVar2);
            range.getClass();
            Range range2 = (Range) this.a.get(lkkVar2);
            range2.getClass();
            fB = b(range, range2, fFloatValue);
        } else {
            if (lkkVar2 != lkk.AUTO) {
                ((sgt) b.c().M(4182)).v("Unexpected lens selection transition, expected AUTO selection, got %s", lkkVar2);
                return;
            }
            lkk lkkVar3 = lkk.WIDE;
            lkkVar = (lkk) Stream.CC.of(lkk.TELE, lkkVar3, lkk.ULTRAWIDE).filter(new Predicate() { // from class: lkd
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo32negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    Range range3 = (Range) this.a.a.get((lkk) obj2);
                    range3.getClass();
                    return fFloatValue >= ((Float) range3.getLower()).floatValue();
                }
            }).findFirst().orElse(lkkVar3);
            Range range3 = (Range) this.a.get(lkkVar);
            range3.getClass();
            Range range4 = (Range) this.f.get(lkkVar);
            range4.getClass();
            fB = b(range3, range4, fFloatValue);
        }
        if (!this.h.p(hba.v)) {
            if (lkkVar != lkk.AUTO && Float.compare(fFloatValue, ((Float) this.g.dL()).floatValue()) == 0) {
                fB = 1.0f;
            }
            owqVar2.a(Float.valueOf(fB));
        }
        owqVar.a(lkkVar);
    }
}
