package defpackage;

import j$.util.function.BiFunction$CC;
import java.util.AbstractMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class idg implements BiFunction {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ idg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.b;
        return i != 0 ? i != 1 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.function.BiFunction] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return iea.b(idz.values()[((Integer) obj).intValue()], ((idj) obj2).b, (sbv) this.a);
        }
        if (i != 1) {
            return new AbstractMap.SimpleImmutableEntry(obj, this.a.apply(obj, obj2));
        }
        int i2 = gwv.Y;
        return this.a.a(obj, obj2);
    }
}
