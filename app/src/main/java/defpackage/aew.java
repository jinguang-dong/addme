package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aew extends aen {
    public aew(ocq ocqVar, afr afrVar, boolean z, boolean z2, String str, cbk cbkVar, uif uifVar) {
        super(ocqVar, afrVar, z, z2, str, cbkVar, uifVar);
    }

    @Override // defpackage.aen
    public final Object a(bqc bqcVar, uhb uhbVar) throws Throwable {
        aey aeyVar = new aey(this, (uhb) null, 1);
        sh shVar = new sh(this, 8);
        uiv uivVar = ajq.a;
        Object objI = ung.i(new ajm(bqcVar, aeyVar, shVar, new ail(bqcVar), null), uhbVar);
        uhi uhiVar = uhi.a;
        if (objI != uhiVar) {
            objI = ufg.a;
        }
        return objI == uhiVar ? objI : ufg.a;
    }

    @Override // defpackage.aen
    protected final void t(KeyEvent keyEvent) {
        ((aen) this).b.a();
    }

    @Override // defpackage.aen
    protected final void w(KeyEvent keyEvent) {
    }
}
