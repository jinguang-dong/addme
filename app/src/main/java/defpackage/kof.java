package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kof implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kof(Object obj, Object obj2, Enum r3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = r3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, owq] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        int i = this.d;
        if (i == 0) {
            peo peoVar = (peo) this.b.get(this.c);
            peoVar.getClass();
            String str = peoVar.d().a;
            ((sbr) this.a).f(str, (lcy) obj);
            return;
        }
        if (i != 1) {
            ((krj) obj).L.d(this.b.dK(new ktd(this.a, this.c, 4), sxo.a));
        } else {
            krj krjVar = (krj) obj;
            krjVar.L.d(this.a.dK(new gcf(this.b, krjVar, this.c, 10, null), sxo.a));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.d;
        return i != 0 ? i != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ kof(owq owqVar, luj lujVar, pez pezVar, int i) {
        this.d = i;
        this.b = owqVar;
        this.a = lujVar;
        this.c = pezVar;
    }
}
