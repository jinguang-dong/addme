package defpackage;

import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsd extends rru implements rrt {
    private final Exception a;
    private final boolean b;

    public rsd(String str, rrt rrtVar, rsi rsiVar, boolean z, rsn rsnVar) {
        super("<missing root>:".concat(String.valueOf(str)), rrtVar, rsi.a(rsiVar, rsh.b), rsnVar);
        this.a = rrtVar.b();
        this.b = z;
    }

    @Override // defpackage.rrt
    public final Exception b() {
        return this.a;
    }

    @Override // defpackage.rrt
    public final rso g(String str, rsi rsiVar, boolean z, rsn rsnVar) {
        if (z && !this.b) {
            WeakHashMap weakHashMap = rsa.a;
        }
        boolean z2 = true;
        if ((!z || this.b) && !this.b) {
            z2 = false;
        }
        return new rsd(str, this, rsiVar, z2, rsnVar);
    }

    @Override // defpackage.rso
    public final rsi i() {
        return rsh.a;
    }

    @Override // defpackage.rso
    public final rso k(String str, rsi rsiVar, rsn rsnVar) {
        WeakHashMap weakHashMap = rsa.a;
        return g(str, rsiVar, true, rsnVar);
    }

    public rsd(UUID uuid, String str, String str2, rsi rsiVar, Exception exc, boolean z, rsn rsnVar) {
        super("<missing root>:".concat(String.valueOf(str2)), uuid, str, rsi.a(rsiVar, rsh.b), rsnVar);
        this.a = exc;
        this.b = z;
    }

    @Override // defpackage.rso
    public final void j() {
    }
}
