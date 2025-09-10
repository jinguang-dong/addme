package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtb implements uiv {
    final /* synthetic */ Integer a;
    final /* synthetic */ mxm b;
    final /* synthetic */ mxm c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;

    public mtb(Integer num, mxm mxmVar, mxm mxmVar2, String str, String str2, String str3) {
        this.a = num;
        this.b = mxmVar;
        this.c = mxmVar2;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ayc aycVar = (ayc) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((amc) obj).getClass();
        if ((iIntValue & 17) == 16 && aycVar.G()) {
            aycVar.r();
        } else {
            aycVar.u(-346523147);
            Integer num = this.a;
            if (num != null) {
                mxm mxmVar = this.b;
                avx.a(byx.d(num.intValue(), aycVar, 0), this.d, amd.c(bdq.z(bik.c, ((Number) abu.a(qpt.aM(mxmVar), ojl.bn(this.c, mxmVar, false), null, aycVar, 0, 28).a()).floatValue()), byx.c(R.dimen.creative_button_icon_size, aycVar)), 0L, aycVar, 0, 8);
                aycVar = aycVar;
            }
            aycVar.n();
            String str = this.e;
            if (str != null) {
                bih bihVar = bik.c;
                aycVar.u(5004770);
                String str2 = this.f;
                boolean zB = aycVar.B(str2);
                Object objF = aycVar.f();
                if (zB || objF == ayb.a) {
                    objF = new ndd(str2, 1);
                    aycVar.w(objF);
                }
                aycVar.n();
                awt.b(str, cbp.b(bihVar, false, (uiq) objF), 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, aycVar, 0, 0, 131068);
            }
        }
        return ufg.a;
    }
}
