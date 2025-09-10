package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jjk implements Consumer {
    public final /* synthetic */ jjn a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ jjk(jjn jjnVar, boolean z, int i) {
        this.c = i;
        this.a = jjnVar;
        this.b = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.c != 0) {
            jjn.B((jjv) obj, this.a.e.dL() != lkk.AUTO && this.b);
            return;
        }
        jjv jjvVar = (jjv) obj;
        if (this.a.e.dL() != lkk.AUTO) {
            jjn.B(jjvVar, !this.b);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.c != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
