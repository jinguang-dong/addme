package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwn implements pau {
    final /* synthetic */ gwv a;
    private boolean b = true;

    public gwn(gwv gwvVar) {
        this.a = gwvVar;
    }

    @Override // defpackage.pau
    public final /* bridge */ /* synthetic */ void a(Object obj) throws Resources.NotFoundException {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (this.b) {
            this.b = false;
            return;
        }
        if (zBooleanValue) {
            return;
        }
        gwv gwvVar = this.a;
        Object objDL = gwvVar.g.dL();
        objDL.getClass();
        gwv.D(gwvVar, ((Number) objDL).floatValue());
        gwvVar.x(((Number) gwvVar.g.dL()).floatValue());
    }
}
