package defpackage;

import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljo {
    public static final scn a = scn.L(50, 100, 200, 400, 800, 1600, 3200);
    static final sbp b = sbp.s(50, 65, 80, 100, 125, 160, 200, 250, 320, 400, 500, 640, 800, 1000, 1250, 1600, 2000, 2500, 3200);

    public static lkw a(final int i) {
        Stream streamFilter = Collection.EL.stream(b).filter(new Predicate() { // from class: ljm
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
            public final boolean test(Object obj) {
                scn scnVar = ljo.a;
                return ((Integer) obj).intValue() >= i;
            }
        });
        int i2 = sbp.d;
        Collector collector = ryv.a;
        sbp sbpVar = (sbp) streamFilter.collect(collector);
        scn scnVar = (scn) new smy(ske.m(), Collection.EL.stream(sbpVar)).h(new lkr(1)).o().collect(ryv.b);
        int size = sbpVar.size();
        Stream stream = Collection.EL.stream(scnVar);
        sbpVar.getClass();
        return new lkw(new lkv(size, R.dimen.iso_slider_tick_spacing, scnVar, (sbp) stream.map(new idh(sbpVar, 16)).map(new kwj(11)).collect(collector)), obu.o(new smy(ske.m(), Collection.EL.stream(sbpVar)).g(new ljn(sbpVar.size(), 0))));
    }
}
