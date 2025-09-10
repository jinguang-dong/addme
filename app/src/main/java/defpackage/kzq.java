package defpackage;

import android.content.res.Resources;
import android.hardware.camera2.CaptureResult;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kzq implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kzq(krz krzVar, Resources resources, int i) {
        this.c = i;
        this.b = krzVar;
        this.a = resources;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        return this.c != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, poe] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, krz] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.c == 0) {
            Integer num = (Integer) this.a.a((CaptureResult.Key) obj);
            return num != null ? num.toString() : this.b;
        }
        ksa ksaVar = (ksa) obj;
        Object obj2 = this.a;
        ?? r3 = this.b;
        Resources resources = (Resources) obj2;
        return new krr(ksaVar, r3.B(ksaVar, resources), r3.s(ksaVar, resources), r3.r(ksaVar, resources));
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.c != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ kzq(poe poeVar, String str, int i) {
        this.c = i;
        this.a = poeVar;
        this.b = str;
    }
}
