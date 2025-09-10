package defpackage;

import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jks implements Predicate {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jks(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.c;
        return i != 0 ? i != 1 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo32negate() {
        int i = this.c;
        return i != 0 ? i != 1 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.c;
        return i != 0 ? i != 1 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, pjp] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.c;
        if (i == 0) {
            jjt jjtVar = (jjt) obj;
            Optional optional = (Optional) jkx.r(jjtVar).apply(this.a);
            Optional optional2 = (Optional) jkx.r(jjtVar).apply(this.b);
            if (optional.isEmpty() && optional2.isPresent()) {
                return true;
            }
            return optional.isPresent() && optional2.isPresent() && !optional.get().equals(optional2.get());
        }
        if (i == 1) {
            jjt jjtVar2 = (jjt) obj;
            return ((Optional) jkx.r(jjtVar2).apply(this.a)).isPresent() != ((Optional) jkx.r(jjtVar2).apply(this.b)).isPresent();
        }
        krj krjVar = (krj) obj;
        String str = (String) this.a.dL();
        if (rnt.V(str)) {
            return krjVar.g;
        }
        ?? r4 = this.b;
        pjr pjrVarD = r4.d(str);
        if (pjrVarD == null) {
            return false;
        }
        return r4.a(pjrVarD).F();
    }
}
