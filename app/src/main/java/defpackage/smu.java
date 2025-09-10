package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class smu implements Consumer {
    public Object a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
