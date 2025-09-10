package defpackage;

import com.google.android.apps.camera.jni.gxp.GxpErrorDescriptorUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhv implements uem {
    private final hem a;

    public lhv(hem hemVar) {
        this.a = hemVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final uyd a() {
        int length;
        tpc tpcVarM = uya.a.m();
        tpc tpcVarM2 = uyc.a.m();
        hem hemVar = this.a;
        int iA = hemVar.a();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        uyc uycVar = (uyc) tpcVarM2.b;
        uycVar.b |= 1;
        uycVar.c = iA;
        for (hej hejVar : hemVar.d()) {
            tpc tpcVarM3 = uyb.a.m();
            boolean z = hejVar.a;
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            tph tphVar = tpcVarM3.b;
            uyb uybVar = (uyb) tphVar;
            uybVar.b |= 2;
            uybVar.d = z;
            long j = hejVar.b;
            if (!tphVar.C()) {
                tpcVarM3.o();
            }
            uyb uybVar2 = (uyb) tpcVarM3.b;
            uybVar2.b |= 16;
            uybVar2.e = j;
            ssc sscVarX = jea.x(hejVar.c);
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            uyb uybVar3 = (uyb) tpcVarM3.b;
            uybVar3.c = sscVarX.T;
            uybVar3.b |= 1;
            uyb uybVar4 = (uyb) tpcVarM3.l();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            uyc uycVar2 = (uyc) tpcVarM2.b;
            uybVar4.getClass();
            tpw tpwVar = uycVar2.d;
            if (!tpwVar.c()) {
                uycVar2.d = tph.v(tpwVar);
            }
            uycVar2.d.add(uybVar4);
        }
        uyc uycVar3 = (uyc) tpcVarM2.l();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        uya uyaVar = (uya) tpcVarM.b;
        uycVar3.getClass();
        uyaVar.c = uycVar3;
        uyaVar.b |= 1;
        byte[] gxpErrorDescriptorNative = GxpErrorDescriptorUtils.getGxpErrorDescriptorNative();
        uej uejVar = null;
        if (gxpErrorDescriptorNative != null && (length = gxpErrorDescriptorNative.length) != 0) {
            try {
                tph tphVarQ = tph.q(uej.a, gxpErrorDescriptorNative, 0, length, tow.a());
                tph.D(tphVarQ);
                uejVar = (uej) tphVarQ;
            } catch (Exception unused) {
            }
        }
        if (uejVar != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uya uyaVar2 = (uya) tpcVarM.b;
            uyaVar2.d = uejVar;
            uyaVar2.b |= 2;
        } else {
            uej uejVar2 = uej.a;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uya uyaVar3 = (uya) tpcVarM.b;
            uejVar2.getClass();
            uyaVar3.d = uejVar2;
            uyaVar3.b |= 2;
        }
        tpe tpeVar = (tpe) uyd.a.m();
        tpeVar.aI(uya.e, (uya) tpcVarM.l());
        return (uyd) tpeVar.l();
    }
}
