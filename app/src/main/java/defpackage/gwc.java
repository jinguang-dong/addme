package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwc implements uiv {
    final /* synthetic */ boolean a;
    final /* synthetic */ gwv b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ azr e;
    final /* synthetic */ azr f;
    final /* synthetic */ bbo g;

    public gwc(boolean z, gwv gwvVar, float f, float f2, azr azrVar, azr azrVar2, bbo bboVar) {
        this.a = z;
        this.b = gwvVar;
        this.c = f;
        this.d = f2;
        this.e = azrVar;
        this.f = azrVar2;
        this.g = bboVar;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        akx akxVar = (akx) obj;
        ayc aycVar = (ayc) obj2;
        int iIntValue = ((Number) obj3).intValue();
        akxVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != aycVar.B(akxVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && aycVar.G()) {
            aycVar.r();
        } else {
            aycVar.u(-1078843743);
            boolean z = this.a;
            if (!z) {
                gsn.M(this.b.u.a() == gxj.a, akxVar.a(bik.c, bib.m), this.c, this.d, aycVar, 0);
            }
            aycVar.n();
            gwv gwvVar = this.b;
            azr azrVar = this.e;
            azr azrVar2 = this.f;
            bbo bboVar = this.g;
            float fFloatValue = ((Number) bboVar.a()).floatValue();
            bih bihVar = bik.c;
            long j = nia.a;
            bik bikVarB = amd.b(bihVar, 64.0f);
            bie bieVar = bib.m;
            gsn.Q(gwvVar, azrVar, azrVar2, fFloatValue, z, byi.aM(akxVar.a(bikVarB, bieVar), 0.0f, 0.0f, 0.0f, 16.0f, 7), aycVar, 432);
            float f = this.c;
            gsn.P(gwvVar, ((Number) bboVar.a()).floatValue(), f, this.d, azrVar, azrVar2, akxVar.a(bihVar, bieVar), z, aycVar, 221184);
            if (z) {
                aycVar.u(-1078813404);
                if (gwvVar.u.a() == gxj.a && gwvVar.I.a() > 0) {
                    gsn.N(gwvVar.b(), akxVar.a(bihVar, bib.l), aycVar, 0);
                }
                aycVar.n();
                bik bikVarA = akxVar.a(bihVar, bieVar);
                Rect rect = (Rect) gwvVar.x.a();
                rect.getClass();
                gsn.L(bikVarA, f, rect, ((Boolean) gwvVar.y.a()).booleanValue(), aycVar, 0);
            }
        }
        return ufg.a;
    }
}
