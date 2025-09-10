package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class uon extends uov implements uol {
    private final boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uon(uol uolVar) {
        uov uovVarE;
        super(true);
        boolean z = true;
        I(uolVar);
        ump umpVarF = F();
        umq umqVar = umpVarF instanceof umq ? (umq) umpVarF : null;
        if (umqVar == null || (uovVarE = umqVar.e()) == null) {
            z = false;
            break;
        }
        while (!uovVarE.fH()) {
            ump umpVarF2 = uovVarE.F();
            umq umqVar2 = umpVarF2 instanceof umq ? (umq) umpVarF2 : null;
            if (umqVar2 == null || (uovVarE = umqVar2.e()) == null) {
                z = false;
                break;
            }
        }
        this.a = z;
    }

    @Override // defpackage.uov
    public final boolean fH() {
        return this.a;
    }

    @Override // defpackage.uov
    public final boolean fI() {
        return true;
    }
}
