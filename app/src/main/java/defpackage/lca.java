package defpackage;

import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lca implements Consumer {
    public final /* synthetic */ owf a;
    public final /* synthetic */ owf b;
    public final /* synthetic */ owf c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ lca(our ourVar, pfu pfuVar, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, int i) {
        this.g = i;
        this.d = ourVar;
        this.f = pfuVar;
        this.e = owfVar;
        this.a = owfVar2;
        this.b = owfVar3;
        this.c = owfVar4;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, owf] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        if (this.g == 0) {
            owf owfVar = (owf) obj;
            owf owfVar2 = this.a;
            ?? r5 = this.e;
            Object obj2 = this.f;
            fcd fcdVar = new fcd(obj2, (Object) r5, owfVar2, 10, (byte[]) null);
            sxo sxoVar = sxo.a;
            paq paqVarDK = owfVar.dK(fcdVar, sxoVar);
            our ourVar = (our) this.d;
            ourVar.d(paqVarDK);
            pfu pfuVar = (pfu) obj2;
            ourVar.d(this.b.dK(new ksw(pfuVar, owfVar, (owf) r5, owfVar2, 3), sxoVar));
            ourVar.d(this.c.dK(new iyl(pfuVar, owfVar, (owf) r5, owfVar2, 4), sxoVar));
            return;
        }
        ?? r2 = this.f;
        Object obj3 = this.d;
        krj krjVar = (krj) obj;
        sgv sgvVar = ktb.a;
        AtomicReference atomicReference = new AtomicReference(ksa.UNKNOWN);
        our ourVar2 = krjVar.L;
        ksq ksqVar = new ksq(krjVar, 2);
        owf owfVar3 = this.a;
        sxo sxoVar2 = sxo.a;
        ourVar2.d(owfVar3.dK(ksqVar, sxoVar2));
        fuf fufVar = (fuf) obj3;
        ourVar2.d(this.b.dK(new ksw((owq) r2, fufVar, this.c, krjVar, 0), sxoVar2));
        Object obj4 = this.e;
        ktb.c(ourVar2, fufVar, r2, ((luj) obj4).a(luf.C), krjVar, krs.FRONT_PHOTO_FLASH);
        ourVar2.d(r2.dK(new fun(atomicReference, obj4, 16, null), sxoVar2));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.g != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ lca(owf owfVar, owf owfVar2, owq owqVar, fuf fufVar, owf owfVar3, luj lujVar, int i) {
        this.g = i;
        this.a = owfVar;
        this.b = owfVar2;
        this.f = owqVar;
        this.d = fufVar;
        this.c = owfVar3;
        this.e = lujVar;
    }
}
