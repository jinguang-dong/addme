package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyr extends kyw {
    private final kyu a;
    private final pbn b;
    private final rwc c;

    public kyr(let letVar, kyu kyuVar, pbn pbnVar, kwr kwrVar, rwc rwcVar, Set set, kmz kmzVar) {
        super(letVar, kmzVar, set, pbnVar, kwrVar);
        this.a = kyuVar;
        this.b = pbnVar;
        this.c = rwcVar;
    }

    @Override // defpackage.kyw, defpackage.kmz
    public final void c(kmy kmyVar, gga ggaVar) {
        pbn pbnVar = this.b;
        pbnVar.f("pckHdrZsl#captureImage");
        super.c(kmyVar, ggaVar);
        pbnVar.g();
    }

    @Override // defpackage.kyw
    protected final boolean d(List list, kmy kmyVar, gga ggaVar) throws hgz, hhl {
        pbn pbnVar = this.b;
        pbnVar.f("pckHdrZsl#process");
        this.a.g(list, kmyVar, ggaVar, ((Integer) this.c.b(new hve(list, ggaVar, 8, null)).e(-1)).intValue());
        pbnVar.g();
        return true;
    }
}
