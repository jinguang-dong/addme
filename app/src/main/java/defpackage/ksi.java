package defpackage;

import j$.util.function.BiPredicate$CC;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksi extends kro {
    private final krs a;
    private final sbp b;
    private final int c;
    private final int d;
    private final owq e;
    private final sbp f;
    private final sbp g;
    private final sbp h;
    private final Predicate i;
    private final Predicate j;
    private final BiPredicate k;
    private final Consumer l;
    private final ksb m;
    private final BiConsumer n;
    private final rwc o;
    private final rbb p;
    private final ksd q;

    public ksi() {
        throw null;
    }

    public static ksh m() {
        ksh kshVar = new ksh(null);
        kshVar.c = new hsj(11);
        kshVar.o(kry.DEFAULT);
        kshVar.d = new BiPredicate() { // from class: ksg
            public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
                return BiPredicate$CC.$default$and(this, biPredicate);
            }

            public final /* synthetic */ BiPredicate negate() {
                return BiPredicate$CC.$default$negate(this);
            }

            public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
                return BiPredicate$CC.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return true;
            }
        };
        kshVar.e = new jgf(13);
        kshVar.k(new lla(1));
        kshVar.f = new ryt(1);
        return kshVar;
    }

    private final int q(ksa ksaVar, sbp sbpVar) {
        int iIndexOf = this.b.indexOf(ksaVar);
        if (iIndexOf < 0 || iIndexOf >= ((sex) sbpVar).c) {
            return 0;
        }
        return ((Integer) sbpVar.get(iIndexOf)).intValue();
    }

    @Override // defpackage.krz
    public final int a() {
        return this.d;
    }

    @Override // defpackage.kro
    protected final int b(ksa ksaVar) {
        return q(ksaVar, this.g);
    }

    @Override // defpackage.kro
    public final int d(ksa ksaVar) {
        return q(ksaVar, this.h);
    }

    @Override // defpackage.kro, defpackage.krz
    public final kry dZ() {
        return (kry) this.o.e(kry.DEFAULT);
    }

    @Override // defpackage.krz
    public final int e() {
        return this.c;
    }

    @Override // defpackage.kro, defpackage.krz
    public final void ed(kqy kqyVar, boolean z) {
        this.n.accept(kqyVar, Boolean.valueOf(z));
    }

    public final boolean equals(Object obj) {
        rbb rbbVar;
        ksd ksdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksi) {
            ksi ksiVar = (ksi) obj;
            if (this.a.equals(ksiVar.a) && ujp.aH(this.b, ksiVar.b) && this.c == ksiVar.c && this.d == ksiVar.d && this.e.equals(ksiVar.e) && ujp.aH(this.f, ksiVar.f) && ujp.aH(this.g, ksiVar.g) && ujp.aH(this.h, ksiVar.h) && this.i.equals(ksiVar.i) && this.j.equals(ksiVar.j) && this.k.equals(ksiVar.k) && this.l.equals(ksiVar.l) && this.m.equals(ksiVar.m) && this.n.equals(ksiVar.n) && this.o.equals(ksiVar.o) && ((rbbVar = this.p) != null ? rbbVar.equals(ksiVar.p) : ksiVar.p == null) && ((ksdVar = this.q) != null ? ksdVar.equals(ksiVar.q) : ksiVar.q == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kro
    protected final int f(ksa ksaVar) {
        return q(ksaVar, this.f);
    }

    @Override // defpackage.krz
    public final krs h() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode();
        rbb rbbVar = this.p;
        int iHashCode2 = ((iHashCode * 1000003) ^ (rbbVar == null ? 0 : rbbVar.hashCode())) * 1000003;
        ksd ksdVar = this.q;
        return iHashCode2 ^ (ksdVar != null ? ksdVar.hashCode() : 0);
    }

    @Override // defpackage.kro, defpackage.krz
    public final ksd i() {
        return this.q;
    }

    @Override // defpackage.krz
    public final owq j() {
        return this.e;
    }

    @Override // defpackage.kro, defpackage.krz
    public final rbb k() {
        return this.p;
    }

    @Override // defpackage.krz
    public final sbp l() {
        return this.b;
    }

    @Override // defpackage.krz
    public final void n(krj krjVar) {
        this.l.d(krjVar);
    }

    @Override // defpackage.kro, defpackage.krz
    public final boolean o(krj krjVar) {
        return this.j.test(krjVar);
    }

    @Override // defpackage.krz
    public final boolean p(krj krjVar) {
        return this.i.test(krjVar);
    }

    public final String toString() {
        ksd ksdVar = this.q;
        rbb rbbVar = this.p;
        rwc rwcVar = this.o;
        BiConsumer biConsumer = this.n;
        ksb ksbVar = this.m;
        Consumer consumer = this.l;
        BiPredicate biPredicate = this.k;
        Predicate predicate = this.j;
        Predicate predicate2 = this.i;
        sbp sbpVar = this.h;
        sbp sbpVar2 = this.g;
        sbp sbpVar3 = this.f;
        owq owqVar = this.e;
        sbp sbpVar4 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(sbpVar4) + ", " + this.c + ", " + this.d + ", " + String.valueOf(owqVar) + ", " + String.valueOf(sbpVar3) + ", " + String.valueOf(sbpVar2) + ", " + String.valueOf(sbpVar) + ", " + String.valueOf(predicate2) + ", " + String.valueOf(predicate) + ", " + String.valueOf(biPredicate) + ", " + String.valueOf(consumer) + ", " + String.valueOf(ksbVar) + ", " + String.valueOf(biConsumer) + ", " + String.valueOf(rwcVar) + ", " + String.valueOf(rbbVar) + ", " + String.valueOf(ksdVar) + "}";
    }

    @Override // defpackage.kro, defpackage.ksb
    public final boolean v(krs krsVar, ksa ksaVar, boolean z) {
        return this.m.v(krsVar, ksaVar, z);
    }

    @Override // defpackage.kro, defpackage.krz
    public final boolean w(kqy kqyVar, ksa ksaVar) {
        return this.k.test(kqyVar, ksaVar);
    }

    public ksi(krs krsVar, sbp sbpVar, int i, int i2, owq owqVar, sbp sbpVar2, sbp sbpVar3, sbp sbpVar4, Predicate predicate, Predicate predicate2, BiPredicate biPredicate, Consumer consumer, ksb ksbVar, BiConsumer biConsumer, rwc rwcVar, rbb rbbVar, ksd ksdVar) {
        this.a = krsVar;
        this.b = sbpVar;
        this.c = i;
        this.d = i2;
        this.e = owqVar;
        this.f = sbpVar2;
        this.g = sbpVar3;
        this.h = sbpVar4;
        this.i = predicate;
        this.j = predicate2;
        this.k = biPredicate;
        this.l = consumer;
        this.m = ksbVar;
        this.n = biConsumer;
        this.o = rwcVar;
        this.p = rbbVar;
        this.q = ksdVar;
    }
}
