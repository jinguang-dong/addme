package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ryt implements BiConsumer {
    private final /* synthetic */ int a;

    public /* synthetic */ ryt(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        if (this.a == 0) {
            ((sbk) obj).h(obj2);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return this.a != 0 ? BiConsumer$CC.$default$andThen(this, biConsumer) : BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
