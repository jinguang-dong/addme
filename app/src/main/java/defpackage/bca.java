package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bca extends bdf {
    public static final bca a = new bca();

    private bca() {
        super(0, 4, 1);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        azq azqVar = (azq) bdiVar.c(2);
        azq azqVar2 = (azq) bdiVar.c(3);
        ayk aykVar = (ayk) bdiVar.c(1);
        ejs ejsVarS = (ejs) bdiVar.c(0);
        if (ejsVarS == null && (ejsVarS = aykVar.s(azqVar)) == null) {
            ayi.g("Could not resolve state for movable content");
            throw new uer();
        }
        if (bazVar.m > 0 || bazVar.j(bazVar.o + 1) != 1) {
            ayi.i("Check failed");
        }
        Object obj = ejsVarS.a;
        int i = bazVar.o;
        int i2 = bazVar.h;
        int i3 = bazVar.i;
        bazVar.x(1);
        bazVar.L();
        bazVar.y();
        baz bazVarC = ((baw) obj).c();
        try {
            List listAj = byi.aj(bazVarC, 2, bazVar, false, true, true);
            bazVarC.z(true);
            bazVar.A();
            bazVar.W();
            bazVar.o = i;
            bazVar.h = i2;
            bazVar.i = i3;
            bay.l(bazVar, listAj, azqVar2.g);
        } catch (Throwable th) {
            bazVarC.z(false);
            throw th;
        }
    }
}
