package defpackage;

import j$.util.Optional;
import j$.util.function.IntPredicate$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tad {
    public final Comparator a;
    public final List b = new ArrayList();
    public int c;
    public final Random d;
    public taf e;
    private final int f;
    private int g;

    public tad(Random random, Comparator comparator) {
        double dSqrt = Math.sqrt(Math.log(100000.0d) / Math.log(2.0d)) * 1000.0d;
        rnt.J(true, "Too small or too large invEps was provided: %s was provided, but invEps needs to be at at least %s and at most %s.", 1000L, 1, 200000000);
        rnt.J(true, "Too small or too large invDelta was provided: %s was provided, but invDelta needs to be at least %s, and at most %s.", 100000L, 2, 2000000000);
        int iRound = (int) Math.round(Math.pow(2.0d, Math.round(Math.log(dSqrt) / Math.log(2.0d))));
        this.f = iRound;
        Integer numValueOf = Integer.valueOf(iRound);
        if (iRound < 3) {
            throw new IllegalArgumentException(rnt.z("Parameters led to invalid k (smaller than %s). k = %s: invEps = %s, invDelta = %s", 3, numValueOf, 1000L, 100000L));
        }
        this.a = comparator;
        this.d = random;
        e();
    }

    private final void g(int i) {
        List list = this.b;
        if (list.get(i) == null) {
            return;
        }
        if (i == list.size() - 1) {
            e();
        }
        int i2 = i + 1;
        if (list.get(i2) == null) {
            list.set(i2, new ArrayList((((List) list.get(i)).size() / 2) + 1));
        }
        List list2 = (List) list.get(i);
        rnt.B(list2 != null, "Method 'halve' expects a non-null compactor.");
        Collections.sort(list2, this.a);
        double size = list2.size();
        final boolean zNextBoolean = this.d.nextBoolean();
        double d = size / 2.0d;
        this.c -= (int) (zNextBoolean ? Math.floor(d) : Math.ceil(d));
        IntStream intStreamFilter = IntStream.CC.range(0, list2.size()).filter(new IntPredicate() { // from class: tac
            public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return IntPredicate$CC.$default$and(this, intPredicate);
            }

            public final /* synthetic */ IntPredicate negate() {
                return IntPredicate$CC.$default$negate(this);
            }

            public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return IntPredicate$CC.$default$or(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final boolean test(int i3) {
                return i3 % 2 == (!zNextBoolean ? 1 : 0);
            }
        });
        list2.getClass();
        Stream streamMapToObj = intStreamFilter.mapToObj(new tdt(list2, 1));
        List list3 = (List) list.get(i2);
        list3.getClass();
        streamMapToObj.forEach(new mdw(list3, 16));
        if (this.e == null || i >= a()) {
            ((List) list.get(i)).clear();
        } else {
            list.set(i, null);
        }
    }

    final int a() {
        taf tafVar = this.e;
        if (tafVar != null) {
            return tafVar.d;
        }
        return 0;
    }

    public final int b() {
        return this.c + (d().isPresent() ? 1 : 0);
    }

    final int c(int i) {
        int iCeil = (int) Math.ceil(Math.pow(0.6666666666666666d, (this.b.size() - i) - 1) * this.f);
        if (iCeil > 2) {
            return iCeil;
        }
        return 0;
    }

    public final Optional d() {
        taf tafVar = this.e;
        if (tafVar == null) {
            return Optional.empty();
        }
        Object obj = tafVar.a;
        return obj != null ? Optional.of(new tae(obj, tafVar.b)) : Optional.empty();
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.b.add(arrayList);
        this.c += arrayList.size();
        int iC = c(a());
        this.g += iC;
        if (iC == 0) {
            int iA = a();
            int iC2 = c(iA);
            taf tafVar = this.e;
            if (tafVar != null) {
                int i = tafVar.c;
                tafVar.c = i + i;
                tafVar.d++;
            } else {
                this.e = new taf(this);
            }
            g(iA);
            this.g -= iC2;
        }
    }

    public final void f() {
        while (this.c >= this.g) {
            int i = 0;
            while (true) {
                List list = this.b;
                if (i >= list.size()) {
                    break;
                }
                if (list.get(i) != null && ((List) list.get(i)).size() >= c(i)) {
                    g(i);
                    if (this.c >= this.g) {
                    }
                }
                i++;
            }
        }
    }
}
