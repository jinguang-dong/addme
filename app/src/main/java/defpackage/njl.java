package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njl implements nkm {
    private final pbn a;
    private final Set b;
    private boolean c;

    public njl(Set set, pbn pbnVar) {
        this.b = set;
        this.a = pbnVar;
    }

    @Override // defpackage.nkm
    public final void a() {
        out.a();
        if (this.c) {
            return;
        }
        for (nkm nkmVar : this.b) {
            pbn pbnVar = this.a;
            String strValueOf = String.valueOf(nkmVar.getClass().getSimpleName());
            nkmVar.getClass();
            pbnVar.e(strValueOf.concat("#wire"), new mvn(nkmVar, 7));
        }
        this.c = true;
    }
}
