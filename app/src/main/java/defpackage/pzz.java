package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pzz implements sxi {
    public final /* synthetic */ qag a;
    public final /* synthetic */ pvd b;
    public final /* synthetic */ pva c;
    public final /* synthetic */ pvp d;
    public final /* synthetic */ pvl e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ String h;
    public final /* synthetic */ pve i;
    public final /* synthetic */ int j;
    public final /* synthetic */ List k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    private final /* synthetic */ int n;

    public /* synthetic */ pzz(qag qagVar, pvp pvpVar, String str, pva pvaVar, pvd pvdVar, pvl pvlVar, int i, long j, String str2, pve pveVar, int i2, List list, tnw tnwVar, int i3) {
        this.n = i3;
        this.a = qagVar;
        this.d = pvpVar;
        this.m = str;
        this.c = pvaVar;
        this.b = pvdVar;
        this.e = pvlVar;
        this.f = i;
        this.g = j;
        this.h = str2;
        this.i = pveVar;
        this.j = i2;
        this.k = list;
        this.l = tnwVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.sxi
    public final syu a(Object obj) {
        pvd pvdVar;
        if (this.n != 0) {
            pvr pvrVar = (pvr) obj;
            pvk pvkVarB = pvk.b(pvrVar.d);
            if (pvkVarB == null) {
                pvkVarB = pvk.NONE;
            }
            if (pvkVarB == pvk.DOWNLOAD_COMPLETE) {
                return syq.a;
            }
            pvp pvpVar = this.d;
            tpc tpcVar = (tpc) pvrVar.a(5, null);
            tpcVar.r(pvrVar);
            int iAx = a.ax(pvpVar.f);
            if (iAx == 0) {
                iAx = 1;
            }
            Object obj2 = this.l;
            List list = this.k;
            int i = this.j;
            pve pveVar = this.i;
            String str = this.h;
            long j = this.g;
            int i2 = this.f;
            pvl pvlVar = this.e;
            pvd pvdVar2 = this.b;
            pva pvaVar = this.c;
            Object obj3 = this.m;
            qag qagVar = this.a;
            syu syuVarI = qagVar.i(iAx, (String) obj3, pvaVar.g);
            qdp qdpVarE = qdp.e(syuVarI);
            qab qabVar = new qab(qagVar, tpcVar, pvpVar, 1);
            Executor executor = qagVar.k;
            return qdpVarE.g(qabVar, executor).g(new pzz(qagVar, syuVarI, pvdVar2, pvaVar, pvpVar, pvlVar, i2, j, str, pveVar, i, list, (tnw) obj2, 0), executor);
        }
        Uri uri = (Uri) ske.U(this.l);
        qag qagVar2 = this.a;
        pva pvaVar2 = this.c;
        pvp pvpVar2 = this.d;
        pvl pvlVar2 = this.e;
        int i3 = this.f;
        long j2 = this.g;
        String str2 = this.h;
        pve pveVar2 = this.i;
        int i4 = this.j;
        List list2 = this.k;
        Object obj4 = this.m;
        rwc rwcVar = qagVar2.e;
        if (!rwcVar.h() || (pvdVar = this.b) == null) {
            qai qaiVar = qagVar2.c;
            lat latVar = qagVar2.l;
            int iAx2 = a.ax(pvpVar2.f);
            qbb qbbVar = new qbb(qaiVar, latVar, pvaVar2, iAx2 == 0 ? 1 : iAx2, qagVar2.g, pvlVar2, i3, j2, str2, qagVar2.h, qagVar2.k);
            qagVar2.g(pvlVar2, uri);
            return qagVar2.d.d(pvpVar2.e, pvlVar2, i3, j2, str2, uri, pvaVar2.d, pvaVar2.e, pveVar2, qbbVar, i4, list2, (tnw) obj4);
        }
        Context context = qagVar2.a;
        qai qaiVar2 = qagVar2.c;
        lat latVar2 = qagVar2.l;
        pwt pwtVar = qagVar2.b;
        int iAx3 = a.ax(pvpVar2.f);
        if (iAx3 == 0) {
            iAx3 = 1;
        }
        qba qbaVar = new qba(context, qaiVar2, latVar2, pwtVar, pvaVar2, iAx3, (pwz) rwcVar.c(), pvdVar, qagVar2.g, pvlVar2, i3, j2, str2, qagVar2.j, qagVar2.h, qagVar2.k);
        qagVar2.g(pvlVar2, uri);
        return qagVar2.d.d(pvpVar2.e, pvlVar2, i3, j2, str2, uri, pvdVar.c, pvdVar.d, pveVar2, qbaVar, i4, list2, (tnw) obj4);
    }

    public /* synthetic */ pzz(qag qagVar, syu syuVar, pvd pvdVar, pva pvaVar, pvp pvpVar, pvl pvlVar, int i, long j, String str, pve pveVar, int i2, List list, tnw tnwVar, int i3) {
        this.n = i3;
        this.a = qagVar;
        this.l = syuVar;
        this.b = pvdVar;
        this.c = pvaVar;
        this.d = pvpVar;
        this.e = pvlVar;
        this.f = i;
        this.g = j;
        this.h = str;
        this.i = pveVar;
        this.j = i2;
        this.k = list;
        this.m = tnwVar;
    }
}
