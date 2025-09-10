package defpackage;

import j$.util.function.BiFunction$CC;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ryu implements BinaryOperator {
    private final /* synthetic */ int a;

    public /* synthetic */ ryu(int i) {
        this.a = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            scl sclVar = (scl) obj;
            sclVar.k((scl) obj2);
            return sclVar;
        }
        if (i == 1) {
            sbk sbkVar = (sbk) obj;
            sbk sbkVar2 = (sbk) obj2;
            sbkVar.b(sbkVar2.a, sbkVar2.b);
            return sbkVar;
        }
        if (i == 2) {
            sbr sbrVar = (sbr) obj;
            sbrVar.h((sbr) obj2);
            return sbrVar;
        }
        sdy sdyVar = (sdy) obj;
        sdy sdyVar2 = (sdy) obj2;
        if (sdyVar.a == null) {
            return sdyVar2;
        }
        if (sdyVar2.a != null) {
            if (sdyVar.b.isEmpty()) {
                sdyVar.b = new ArrayList();
            }
            sdyVar.b.add(sdyVar2.a);
            sdyVar.b.addAll(sdyVar2.b);
            if (sdyVar.b.size() > 4) {
                ?? r2 = sdyVar.b;
                r2.subList(4, r2.size()).clear();
                throw sdyVar.a(true);
            }
        }
        return sdyVar;
    }
}
