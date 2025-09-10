package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afa implements url {
    final /* synthetic */ ujy a;
    final /* synthetic */ ujy b;
    final /* synthetic */ ujy c;
    final /* synthetic */ afb d;

    public afa(ujy ujyVar, ujy ujyVar2, ujy ujyVar3, afb afbVar) {
        this.a = ujyVar;
        this.b = ujyVar2;
        this.c = ujyVar3;
        this.d = afbVar;
    }

    @Override // defpackage.url
    public final /* bridge */ /* synthetic */ Object a(Object obj, uhb uhbVar) {
        ujy ujyVar;
        int i;
        akb akbVar = (akb) obj;
        boolean z = true;
        if (akbVar instanceof akd) {
            this.a.a++;
        } else {
            if ((akbVar instanceof ake) || (akbVar instanceof akc)) {
                ujyVar = this.a;
            } else {
                if (akbVar instanceof ajz) {
                    ujyVar = this.b;
                } else if (akbVar instanceof aka) {
                    ujyVar = this.b;
                } else if (akbVar instanceof ajx) {
                    ujyVar = this.c;
                } else if (akbVar instanceof ajy) {
                    ujyVar = this.c;
                }
                i = ujyVar.a + 1;
                ujyVar.a = i;
            }
            i = ujyVar.a - 1;
            ujyVar.a = i;
        }
        boolean z2 = false;
        boolean z3 = this.a.a > 0;
        boolean z4 = this.b.a > 0;
        boolean z5 = this.c.a > 0;
        afb afbVar = this.d;
        if (afbVar.a != z3) {
            afbVar.a = z3;
            z2 = true;
        }
        if (afbVar.b != z4) {
            afbVar.b = z4;
        } else {
            z = z2;
        }
        if (afbVar.c == z5) {
            if (z) {
            }
            return ufg.a;
        }
        afbVar.c = z5;
        bko.x(afbVar);
        return ufg.a;
    }
}
