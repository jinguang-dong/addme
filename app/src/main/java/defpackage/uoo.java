package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class uoo extends uvt implements unt, uoh {
    public uov b;

    public abstract void a(Throwable th);

    public abstract boolean b();

    public final uov e() {
        uov uovVar = this.b;
        if (uovVar != null) {
            return uovVar;
        }
        ujp.c("job");
        return null;
    }

    @Override // defpackage.uoh
    public final upa fK() {
        return null;
    }

    @Override // defpackage.unt
    public final void fL() {
        Object objC;
        Object objF;
        uvt uvtVar;
        uvx uvxVar;
        uov uovVarE = e();
        do {
            objC = uovVarE.C();
            if (!(objC instanceof uoo)) {
                if (!(objC instanceof uoh) || ((uoh) objC).fK() == null) {
                    return;
                }
                do {
                    objF = f();
                    if (objF instanceof uvx) {
                        uvt uvtVar2 = ((uvx) objF).a;
                        return;
                    }
                    if (objF == this) {
                        return;
                    }
                    objF.getClass();
                    uvtVar = (uvt) objF;
                    umb umbVar = uvtVar.e;
                    uvxVar = (uvx) umbVar.a;
                    if (uvxVar == null) {
                        uvxVar = new uvx(uvtVar);
                        umbVar.b(uvxVar);
                    }
                } while (!this.c.d(objF, uvxVar));
                uvtVar.g();
                return;
            }
            if (objC != this) {
                return;
            }
        } while (!uovVarE.d.d(objC, uow.g));
    }

    @Override // defpackage.uoh
    public final boolean fM() {
        return true;
    }

    @Override // defpackage.uvt
    public final String toString() {
        return ung.a(this) + "@" + ung.b(this) + "[job@" + ung.b(e()) + "]";
    }
}
