package defpackage;

import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsc extends rrq implements rrt {
    public static final rrr a = new rrs();
    private final Exception b;

    public rsc(UUID uuid, String str, Exception exc, rsn rsnVar) {
        super("<missing root>", uuid, str, rsnVar);
        this.b = exc;
    }

    @Override // defpackage.rrt
    public final Exception b() {
        return this.b;
    }

    @Override // defpackage.rrt
    public final rso g(String str, rsi rsiVar, boolean z, rsn rsnVar) {
        if (z) {
            WeakHashMap weakHashMap = rsa.a;
        }
        return new rsd(str, this, rsiVar, z, rsnVar);
    }

    @Override // defpackage.rso
    public final rsi h() {
        return rsh.a;
    }

    @Override // defpackage.rso
    public final rsi i() {
        throw null;
    }

    @Override // defpackage.rso
    public final rso k(String str, rsi rsiVar, rsn rsnVar) {
        WeakHashMap weakHashMap = rsa.a;
        return g(str, rsiVar, true, rsnVar);
    }

    @Override // defpackage.rso
    public final void j() {
    }
}
