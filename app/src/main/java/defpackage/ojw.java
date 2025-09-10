package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ojw implements okb {
    private final /* synthetic */ int a;

    public ojw(int i) {
        this.a = i;
    }

    @Override // defpackage.okb
    public final oka a(Context context, String str, ojz ojzVar) {
        int iB;
        int i = -1;
        if (this.a != 0) {
            oka okaVar = new oka();
            int iB2 = ojzVar.b(context, str, true);
            okaVar.b = iB2;
            if (iB2 != 0) {
                okaVar.c = 1;
                return okaVar;
            }
            int iA = ojzVar.a(context, str);
            okaVar.a = iA;
            if (iA != 0) {
                okaVar.c = -1;
            }
            return okaVar;
        }
        oka okaVar2 = new oka();
        int iA2 = ojzVar.a(context, str);
        okaVar2.a = iA2;
        int i2 = 0;
        if (iA2 != 0) {
            iB = ojzVar.b(context, str, false);
            okaVar2.b = iB;
        } else {
            iB = ojzVar.b(context, str, true);
            okaVar2.b = iB;
        }
        int i3 = okaVar2.a;
        if (i3 == 0) {
            if (iB == 0) {
                i = 0;
            }
            okaVar2.c = i;
            return okaVar2;
        }
        i2 = i3;
        if (i2 < iB) {
            i = 1;
        }
        okaVar2.c = i;
        return okaVar2;
    }
}
