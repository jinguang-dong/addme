package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxq implements dxo {
    private final dxo a;
    private final Object b = new Object();

    public dxq(dxo dxoVar) {
        this.a = dxoVar;
    }

    @Override // defpackage.dxo
    public final List a(String str) {
        List listA;
        str.getClass();
        synchronized (this.b) {
            listA = this.a.a(str);
        }
        return listA;
    }

    @Override // defpackage.dxo
    public final boolean b(ebm ebmVar) {
        boolean zB;
        synchronized (this.b) {
            zB = this.a.b(ebmVar);
        }
        return zB;
    }

    @Override // defpackage.dxo
    public final ejs c(ebm ebmVar) {
        ejs ejsVarC;
        synchronized (this.b) {
            ejsVarC = this.a.c(ebmVar);
        }
        return ejsVarC;
    }

    @Override // defpackage.dxo
    public final ejs d(ebm ebmVar) {
        ejs ejsVarD;
        synchronized (this.b) {
            ejsVarD = this.a.d(ebmVar);
        }
        return ejsVarD;
    }

    @Override // defpackage.dxo
    public final /* synthetic */ ejs e(ebx ebxVar) {
        return cpo.q(this, ebxVar);
    }
}
