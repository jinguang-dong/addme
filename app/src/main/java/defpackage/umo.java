package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class umo extends uoo {
    public final uml a;

    public umo(uml umlVar) {
        this.a = umlVar;
    }

    @Override // defpackage.uoo
    public final void a(Throwable th) {
        uml umlVar = this.a;
        Throwable thN = umlVar.n(e());
        if (umlVar.B()) {
            umb umbVar = ((uvg) umlVar.a).f;
            while (true) {
                Object obj = umbVar.a;
                uwc uwcVar = uvh.b;
                if (a.ao(obj, uwcVar)) {
                    if (umbVar.d(uwcVar, thN)) {
                        return;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    if (umbVar.d(obj, null)) {
                        break;
                    }
                }
            }
        }
        umlVar.g(thN);
        umlVar.w();
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return true;
    }
}
