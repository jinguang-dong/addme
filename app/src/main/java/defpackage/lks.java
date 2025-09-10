package defpackage;

import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lks {
    public static final scn a = scn.L(100000L, 1000000L, 4000000L, 16666667L, 33333333L, 66666667L, 125000000L, 250000000L, 500000000L, 1000000000L, 4000000000L, 8000000000L, 16000000000L);
    private static final sbp b = sbp.s(100000L, 111111L, 125000L, 156250L, 200000L, 250000L, 312500L, 400000L, 500000L, 625000L, 800000L, 1000000L, 1250000L, 1562500L, 2000000L, 2500000L, 3125000L, 4000000L, 5000000L, 6250000L, 8000000L, 10000000L, 12500000L, 16666667L, 20000000L, 25000000L, 33333333L, 40000000L, 50000000L, 66666667L, 76923077L, 100000000L, 125000000L, 166666667L, 200000000L, 250000000L, 333333333L, 400000000L, 500000000L, 625000000L, 769230769L, 1000000000L, 2000000000L, 3000000000L, 4000000000L, 5000000000L, 6000000000L, 8000000000L, 12000000000L, 14000000000L, 16000000000L);

    public static lkw a(long j) {
        Stream streamFilter = Collection.EL.stream(b).filter(new hdx(Math.max(100000L, j), 4));
        int i = sbp.d;
        Collector collector = ryv.a;
        sbp sbpVar = (sbp) streamFilter.collect(collector);
        scn scnVar = (scn) new smy(ske.m(), Collection.EL.stream(sbpVar)).h(new lkr(0)).o().collect(ryv.b);
        int size = sbpVar.size();
        Stream stream = Collection.EL.stream(scnVar);
        sbpVar.getClass();
        return new lkw(new lkv(size, R.dimen.pro_slider_tick_spacing, scnVar, (sbp) stream.map(new idh(sbpVar, 18)).map(new kwj(14)).collect(collector)), obu.o(new smy(ske.m(), Collection.EL.stream(sbpVar)).g(new ljn(sbpVar.size(), 2))));
    }
}
