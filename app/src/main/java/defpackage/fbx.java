package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbx extends ojl {
    public final Set a;
    public final fbz b;
    private final Executor c;
    private boolean d;

    public fbx(our ourVar, hwt hwtVar, kgw kgwVar, Executor executor, pbc pbcVar) {
        super((short[]) null);
        this.d = false;
        fbz fbzVar = new fbz(kgwVar, hwtVar, pbcVar.a("gyro-scn-ch"), "scene-ch-".concat(String.valueOf(kgwVar.l().name())));
        this.b = fbzVar;
        this.a = new HashSet();
        this.c = executor;
        ourVar.d(fbzVar);
    }

    @Override // defpackage.ojl
    public final synchronized void a(poe poeVar) {
        if (this.d) {
            this.c.execute(new eao(this, poeVar, 17, (char[]) null));
        }
    }

    public final synchronized void b(Runnable runnable) {
        this.a.add(runnable);
    }

    public final synchronized void c(Runnable runnable) {
        this.a.remove(runnable);
    }

    public final synchronized void d() {
        this.d = true;
        this.b.b();
    }

    public final synchronized void e() {
        this.d = false;
        this.b.close();
    }
}
