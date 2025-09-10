package defpackage;

import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tdt implements IntFunction {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tdt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        int i2 = this.b;
        ?? r1 = this.a;
        return i2 != 0 ? r1.get(i) : Float.valueOf(((float[]) r1)[i]);
    }
}
