package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpj extends ojl {
    public final hpa a;
    public final nms b;
    private final fee c;
    private final Executor d;
    private final Set e;
    private final pjo f;

    public hpj(hpa hpaVar, fee feeVar, nms nmsVar, Executor executor, pjo pjoVar) {
        super((short[]) null);
        this.e = new HashSet();
        this.a = hpaVar;
        this.c = feeVar;
        this.d = executor;
        this.b = nmsVar;
        this.f = pjoVar;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        if (this.e.isEmpty()) {
            return;
        }
        this.d.execute(new gts(this, poeVar, this.c.b(this.f), 3));
    }

    public final synchronized void i(String str) {
        this.e.add(str);
    }

    public final synchronized void j(String str) {
        this.e.remove(str);
    }
}
