package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qjm implements Callable {
    final /* synthetic */ qin a;
    final /* synthetic */ qhx b;
    final /* synthetic */ qfq c;

    public qjm(qin qinVar, qhx qhxVar, qfq qfqVar) {
        this.a = qinVar;
        this.b = qhxVar;
        this.c = qfqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return new qkj(this.a.f(), qkj.b(), 36197, this.b);
    }

    public final String toString() {
        return "createExternalTexture(" + this.c.toString() + ")";
    }
}
