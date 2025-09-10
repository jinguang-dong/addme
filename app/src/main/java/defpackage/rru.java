package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class rru extends rrq {
    private final rsi a;

    public rru(String str, rso rsoVar, rsi rsiVar, rsn rsnVar) {
        super(str, rsoVar, rsnVar);
        a.I(rsiVar.d);
        this.a = rsiVar;
    }

    @Override // defpackage.rso
    public final rsi h() {
        return rsi.a(this.a, i());
    }

    public rru(String str, UUID uuid, String str2, rsi rsiVar, rsn rsnVar) {
        super(str, uuid, str2, rsnVar);
        a.I(rsiVar.d);
        this.a = rsiVar;
    }
}
