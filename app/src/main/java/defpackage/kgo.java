package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kgo implements syf {
    final /* synthetic */ fsc a;
    final /* synthetic */ jtg b;
    final /* synthetic */ our c;
    final /* synthetic */ kgp d;

    public kgo(kgp kgpVar, fsc fscVar, jtg jtgVar, our ourVar) {
        this.a = fscVar;
        this.b = jtgVar;
        this.c = ourVar;
        this.d = kgpVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [sgt, shi] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((sgt) ((sgt) kgp.a.c().i(th)).M((char) 3282)).s("OneCamera failed to open, closing lifetime.");
        }
        this.c.close();
        this.b.a(new pco("OneCamera failed to open"));
    }

    @Override // defpackage.syf
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        kfg kfgVar = (kfg) obj;
        kfgVar.getClass();
        kgp kgpVar = this.d;
        kgpVar.c = null;
        if (this.a.a()) {
            return;
        }
        this.b.b(new jth(kfgVar, this.c, kgpVar.d, kgpVar.e));
    }
}
