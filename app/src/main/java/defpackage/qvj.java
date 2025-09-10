package defpackage;

import android.content.Context;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qvj {
    public final Object a;
    public final Object b;

    public qvj(Context context, uem uemVar) {
        this.a = context;
        this.b = uemVar;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [sgt, shi] */
    public final tpc a(qna qnaVar) {
        tpc tpcVarM = uzf.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        uzf uzfVar = (uzf) tphVar;
        uzfVar.b |= 1;
        uzfVar.c = true;
        String str = qnaVar == null ? null : qnaVar.a;
        if (str != null) {
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            uzf uzfVar2 = (uzf) tpcVarM.b;
            uzfVar2.b |= 4;
            uzfVar2.e = str;
        }
        try {
            tpc tpcVarM2 = uyy.a.m();
            Object obj = this.a;
            qpn qpnVarA = qpm.a((Context) ((sjp) obj).a, "getAndroidProcessStats");
            uyx uyxVarB = sjp.b(((lat) ((sjp) obj).b).u(new nxi(qpnVarA, 9)), qpnVarA);
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            uyy uyyVar = (uyy) tpcVarM2.b;
            uyxVarB.getClass();
            uyyVar.c = uyxVarB;
            uyyVar.b |= 1;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uzf uzfVar3 = (uzf) tpcVarM.b;
            uyy uyyVar2 = (uyy) tpcVarM2.l();
            uyyVar2.getClass();
            uzfVar3.d = uyyVar2;
            uzfVar3.b |= 2;
            return tpcVarM;
        } catch (RuntimeException e) {
            ((sgt) ((sgt) qnj.a.c().i(e)).M((char) 5731)).s("Failed to get process stats.");
            return tpcVarM;
        }
    }

    public qvj(sjp sjpVar, tzj tzjVar) {
        this.a = sjpVar;
        this.b = tzjVar;
    }

    public qvj(Context context) {
        this.b = new HashSet();
        this.a = context;
    }
}
