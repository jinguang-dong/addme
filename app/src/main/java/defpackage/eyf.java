package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyf extends exx implements est {
    public eyf(eyd eydVar) {
        super(eydVar);
    }

    @Override // defpackage.esw
    public final int a() {
        eyi eyiVar = ((eyd) this.a).a.a;
        epy epyVar = (epy) eyiVar.a;
        return epyVar.a.limit() + epyVar.c.length + (epyVar.d.length * 4) + eyiVar.g;
    }

    @Override // defpackage.esw
    public final Class b() {
        return eyd.class;
    }

    @Override // defpackage.exx, defpackage.est
    public final void d() {
        ((eyd) this.a).a().prepareToDraw();
    }

    @Override // defpackage.esw
    public final void e() {
        eyd eydVar = (eyd) this.a;
        eydVar.stop();
        eydVar.b = true;
        eyi eyiVar = eydVar.a.a;
        eyiVar.b.clear();
        eyiVar.c();
        eyiVar.e();
        ezx ezxVar = eyiVar.j;
        if (ezxVar != null) {
            eyiVar.c.e(ezxVar);
            eyiVar.j = null;
        }
        ezx ezxVar2 = eyiVar.k;
        if (ezxVar2 != null) {
            eyiVar.c.e(ezxVar2);
            eyiVar.k = null;
        }
        ezx ezxVar3 = eyiVar.l;
        if (ezxVar3 != null) {
            eyiVar.c.e(ezxVar3);
            eyiVar.l = null;
        }
        epy epyVar = (epy) eyiVar.a;
        epyVar.f = null;
        byte[] bArr = epyVar.c;
        if (bArr != null) {
            epyVar.j.p(bArr);
        }
        int[] iArr = epyVar.d;
        if (iArr != null) {
            ((etl) epyVar.j.a).c(iArr);
        }
        Bitmap bitmap = epyVar.g;
        if (bitmap != null) {
            epyVar.j.o(bitmap);
        }
        epyVar.g = null;
        epyVar.a = null;
        epyVar.h = null;
        byte[] bArr2 = epyVar.b;
        if (bArr2 != null) {
            epyVar.j.p(bArr2);
        }
        eyiVar.e = true;
    }
}
