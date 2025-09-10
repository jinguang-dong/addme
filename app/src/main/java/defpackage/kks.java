package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kks implements AutoCloseable {
    public final Set a;
    public final kkq c;
    public final List b = new ArrayList();
    private final List d = new ArrayList();

    public kks(Set set, kkq kkqVar) {
        this.a = set;
        this.c = kkqVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ske.W(ojl.ch(ske.I(this.b), ske.I(this.d), new kkr(this)), new fxw(this, 7), sxo.a);
    }
}
