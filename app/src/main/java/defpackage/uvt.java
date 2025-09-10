package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class uvt {
    public final umb c;
    public final umb d;
    public final umb e;

    public uvt() {
        umc umcVar = umc.a;
        this.c = new umb(this, umcVar);
        this.d = new umb(this, umcVar);
        this.e = new umb(null, umcVar);
    }

    public final Object f() {
        return this.c.a;
    }

    public boolean fN() {
        return f() instanceof uvx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r4.c.d(r3, ((defpackage.uvx) r5).a) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.uvt g() {
        /*
            r8 = this;
        L0:
            umb r0 = r8.d
            java.lang.Object r1 = r0.a
            uvt r1 = (defpackage.uvt) r1
            r2 = 0
            r3 = r1
        L8:
            r4 = r2
        L9:
            umb r5 = r3.c
            java.lang.Object r5 = r5.a
            if (r5 != r8) goto L19
            if (r1 != r3) goto L12
            goto L18
        L12:
            boolean r0 = r0.d(r1, r3)
            if (r0 == 0) goto L0
        L18:
            return r3
        L19:
            boolean r6 = r8.fN()
            if (r6 == 0) goto L20
            return r2
        L20:
            boolean r6 = r5 instanceof defpackage.uvx
            if (r6 == 0) goto L3b
            if (r4 == 0) goto L34
            uvx r5 = (defpackage.uvx) r5
            uvt r5 = r5.a
            umb r6 = r4.c
            boolean r3 = r6.d(r3, r5)
            if (r3 == 0) goto L0
            r3 = r4
            goto L8
        L34:
            umb r3 = r3.d
            java.lang.Object r3 = r3.a
            uvt r3 = (defpackage.uvt) r3
            goto L9
        L3b:
            r5.getClass()
            r4 = r5
            uvt r4 = (defpackage.uvt) r4
            r7 = r4
            r4 = r3
            r3 = r7
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvt.g():uvt");
    }

    public final uvt h() {
        Object objF = f();
        uvx uvxVar = objF instanceof uvx ? (uvx) objF : null;
        if (uvxVar != null) {
            return uvxVar.a;
        }
        objF.getClass();
        return (uvt) objF;
    }

    public final uvt i() {
        uvt uvtVarG = g();
        if (uvtVarG != null) {
            return uvtVarG;
        }
        Object obj = this.d.a;
        while (true) {
            uvt uvtVar = (uvt) obj;
            if (!uvtVar.fN()) {
                return uvtVar;
            }
            obj = uvtVar.d.a;
        }
    }

    public final void j(int i) {
        l(new uvq(i), i);
    }

    public final void k(uvt uvtVar) {
        umb umbVar;
        uvt uvtVar2;
        do {
            umbVar = uvtVar.d;
            uvtVar2 = (uvt) umbVar.a;
            if (f() != uvtVar) {
                return;
            }
        } while (!umbVar.d(uvtVar2, this));
        if (fN()) {
            uvtVar.g();
        }
    }

    public final boolean l(uvt uvtVar, int i) {
        uvt uvtVarI;
        do {
            uvtVarI = i();
            if (uvtVarI instanceof uvq) {
                return (((uvq) uvtVarI).a & i) == 0 && uvtVarI.l(uvtVar, i);
            }
            uvtVar.d.b(uvtVarI);
            uvtVar.c.b(this);
        } while (!uvtVarI.c.d(this, uvtVar));
        uvtVar.k(this);
        return true;
    }

    public String toString() {
        return new uju(this) { // from class: uvs
            @Override // defpackage.uju
            public final Object b() {
                return ung.a(this.e);
            }
        } + "@" + ung.b(this);
    }
}
