package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxz implements kmz {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;
    private final Object d;
    private final Object e;

    public kxz(kmz kmzVar, cxb cxbVar, cxb cxbVar2, let letVar, int i) {
        this.a = i;
        this.c = cxbVar;
        this.b = kmzVar;
        this.d = cxbVar2;
        this.e = letVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kmz] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, owf] */
    @Override // defpackage.kmz
    public final owf a() {
        return this.a != 0 ? this.c : this.b.a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kmz, owf] */
    @Override // defpackage.kmz
    public final owf b() {
        int i = this.a;
        ?? r1 = this.b;
        return i != 0 ? r1 : r1.b();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, let] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kmz] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kmz] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, pbc] */
    @Override // defpackage.kmz
    public final void c(kmy kmyVar, gga ggaVar) {
        if (this.a != 0) {
            kmz kmzVar = (kmz) this.d.dL();
            this.e.b("Running command: ".concat(String.valueOf(kmzVar.toString())));
            kmzVar.c(kmyVar, ggaVar);
            return;
        }
        cxb cxbVar = (cxb) this.c;
        if (cxbVar.C()) {
            cxb cxbVar2 = (cxb) this.d;
            if (cxbVar2.C()) {
                kbn kbnVar = (kbn) cxbVar.B();
                ?? r3 = this.e;
                kbnVar.s(new kxy(r3, 0), ggaVar);
                ?? r2 = ggaVar.b;
                if (r2.m() == ltf.LONG_SHOT) {
                    ((kal) cxbVar2.B()).e(r2.l());
                } else {
                    ((kal) cxbVar2.B()).f(r2.l());
                }
                this.b.c(kmyVar, ggaVar);
                ((kbn) cxbVar.B()).q(new kxy(r3, 0), ggaVar);
                return;
            }
        }
        this.b.c(kmyVar, ggaVar);
    }

    public kxz(pbb pbbVar, owf owfVar, int i) {
        this.a = i;
        this.d = owfVar;
        this.e = pbbVar.a("ImgCptrSwitch");
        this.c = ovz.a(owl.h(owfVar, new iop(4)));
        this.b = ovz.a(owl.h(owfVar, new iop(5)));
    }

    public final String toString() {
        if (this.a != 0) {
            Object obj = this.d;
            rwb rwbVarW = rnt.W(this);
            rwbVarW.a(obj);
            return rwbVarW.toString();
        }
        Object obj2 = this.b;
        rwb rwbVarW2 = rnt.W(this);
        rwbVarW2.b(LmJPKwPBa.TRcSKu, obj2);
        return rwbVarW2.toString();
    }
}
