package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rse extends rru {
    public static final rse a = new rse(UUID.randomUUID());

    private rse(UUID uuid) {
        super("<skip trace>", uuid, rrq.fv(uuid), rsh.a, rsa.a());
    }

    @Override // defpackage.rso
    public final rsi i() {
        return rsh.a;
    }

    @Override // defpackage.rso
    public final rso k(String str, rsi rsiVar, rsn rsnVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // defpackage.rso
    public final void j() {
    }
}
