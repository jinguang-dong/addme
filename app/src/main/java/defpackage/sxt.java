package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxt implements sxh {
    final /* synthetic */ Callable a;

    public sxt(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.sxh
    public final syu a() {
        return ske.M(this.a.call());
    }

    public final String toString() {
        return this.a.toString();
    }
}
