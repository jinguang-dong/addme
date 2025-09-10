package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class en implements gl {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public en(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gl
    public final void a(gb gbVar, boolean z) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ((eo) this.a).x(gbVar);
                return;
            }
            if (gbVar instanceof gt) {
                gbVar.a().i(false);
            }
            gl glVar = ((fr) this.a).e;
            if (glVar != null) {
                glVar.a(gbVar, z);
                return;
            }
            return;
        }
        gb gbVarA = gbVar.a();
        gb gbVar2 = gbVarA != gbVar ? gbVarA : gbVar;
        eo eoVar = (eo) this.a;
        em emVarT = eoVar.t(gbVar2);
        if (emVarT != null) {
            if (gbVarA == gbVar) {
                eoVar.y(emVarT, z);
            } else {
                eoVar.w(emVarT.a, emVarT, gbVarA);
                eoVar.y(emVarT, true);
            }
        }
    }

    @Override // defpackage.gl
    public final boolean b(gb gbVar) {
        Window.Callback callbackU;
        int i = this.b;
        if (i == 0) {
            if (gbVar == gbVar.a()) {
                eo eoVar = (eo) this.a;
                if (eoVar.u && (callbackU = eoVar.u()) != null && !eoVar.B) {
                    callbackU.onMenuOpened(108, gbVar);
                }
            }
            return true;
        }
        if (i == 1) {
            Window.Callback callbackU2 = ((eo) this.a).u();
            if (callbackU2 != null) {
                callbackU2.onMenuOpened(108, gbVar);
            }
            return true;
        }
        Object obj = this.a;
        if (gbVar == ((hg) obj).c) {
            return false;
        }
        gd gdVar = ((gt) gbVar).l;
        gl glVar = ((fr) obj).e;
        if (glVar != null) {
            return glVar.b(gbVar);
        }
        return false;
    }
}
