package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbs implements hyg {
    public final /* synthetic */ jby a;

    public jbs(jby jbyVar) {
        this.a = jbyVar;
    }

    @Override // defpackage.hyg
    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
        jby jbyVar = this.a;
        jth jthVar = jbyVar.aa;
        if (jthVar == null) {
            return;
        }
        boolean z5 = false;
        if (z4 && ((Boolean) jthVar.b().dL()).booleanValue()) {
            z5 = true;
        }
        if (z3 && z5) {
            jbyVar.c.execute(new jbh(this, 15));
            return;
        }
        if (z && !z4) {
            jbyVar.c.execute(new jbh(this, 16));
            return;
        }
        if (z && z5) {
            jbyVar.c.execute(new jbh(this, 17));
        } else {
            if (z || !z5) {
                return;
            }
            jbyVar.c.execute(new emz(this, z2, 8, (char[]) null));
        }
    }

    @Override // defpackage.hyg
    public final void c() {
        this.a.c.execute(new jbh(this, 14));
    }

    @Override // defpackage.hyg
    public final /* synthetic */ void b(boolean z) {
    }
}
