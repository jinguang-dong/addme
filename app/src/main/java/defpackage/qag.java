package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qag {
    public final Context a;
    public final pwt b;
    public final qai c;
    public final qbh d;
    public final rwc e;
    public final rwc f;
    public final qbq g;
    public final puu h;
    public final pzc i;
    public final rwc j;
    public final Executor k;
    public final lat l;

    public qag(Context context, pwt pwtVar, qai qaiVar, lat latVar, qbh qbhVar, rwc rwcVar, rwc rwcVar2, qbq qbqVar, puu puuVar, pzc pzcVar, rwc rwcVar3, Executor executor) {
        this.a = context;
        this.b = pwtVar;
        this.c = qaiVar;
        this.l = latVar;
        this.d = qbhVar;
        this.e = rwcVar;
        this.f = rwcVar2;
        this.g = qbqVar;
        this.h = puuVar;
        this.i = pzcVar;
        this.j = rwcVar3;
        this.k = executor;
    }

    public final syu a() {
        try {
            Context context = this.a;
            int i = rcp.a;
            this.l.p(qsp.g("*.lease", context.getPackageName(), 0L));
            this.g.l(1077);
        } catch (rcw unused) {
            int i2 = qbu.a;
        } catch (IOException e) {
            qbu.g(e, "%s: Failed to release the leases in the android shared storage", "SharedFileManager");
            this.g.l(1078);
        }
        try {
            this.l.t(qsp.ai(this.a, this.j));
        } catch (IOException unused2) {
            this.b.a();
        }
        return syq.a;
    }

    public final syu b(pvp pvpVar, String str, int i, long j, String str2, pvl pvlVar, pva pvaVar, pvd pvdVar, pve pveVar, int i2, List list, tnw tnwVar) {
        return qsz.n(f(pvpVar), new pzz(this, pvpVar, str, pvaVar, pvdVar, pvlVar, i, j, str2, pveVar, i2, list, tnwVar, 1), this.k);
    }

    final syu c(pvp pvpVar) {
        return qsz.n(f(pvpVar), new kjm(20), this.k);
    }

    public final syu d(pvp pvpVar) {
        return qsz.m(e(new sfm(pvpVar)), new pzu(pvpVar, 7), sxo.a);
    }

    final syu e(scn scnVar) {
        return qdp.e(this.c.f(scnVar)).g(new pzn(this, scnVar, 7), this.k);
    }

    final syu f(pvp pvpVar) {
        return qsz.n(this.c.e(pvpVar), new pzl(pvpVar, 17), this.k);
    }

    public final void g(pvl pvlVar, Uri uri) {
        rwc rwcVar = this.f;
        if (rwcVar.h()) {
            try {
                long jK = this.l.k(uri);
                if (jK > 0) {
                    ((qdc) rwcVar.c()).d(pvlVar.c, jK);
                }
            } catch (IOException unused) {
            }
        }
    }

    public final syu h(final List list, final int i, final int i2) {
        if (i == list.size()) {
            return ske.M(null);
        }
        final pvd pvdVar = (pvd) list.get(i);
        int iAq = a.aq(pvdVar.f);
        if (iAq == 0) {
            iAq = 1;
        }
        if (iAq != ((pwz) this.e.c()).b()) {
            return h(list, i + 1, i2);
        }
        tpc tpcVarM = pvp.a.m();
        puz puzVar = pvdVar.g;
        if (puzVar == null) {
            puzVar = puz.a;
        }
        String str = puzVar.c;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        pvp pvpVar = (pvp) tphVar;
        str.getClass();
        pvpVar.b |= 4;
        pvpVar.e = str;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        pvp pvpVar2 = (pvp) tpcVarM.b;
        pvpVar2.f = i2 - 1;
        pvpVar2.b |= 8;
        final pvp pvpVar3 = (pvp) tpcVarM.l();
        return qsz.n(this.c.e(pvpVar3), new sxi() { // from class: qad
            @Override // defpackage.sxi
            public final syu a(Object obj) {
                qag qagVar = this.a;
                pvr pvrVar = (pvr) obj;
                if (pvrVar != null) {
                    pvk pvkVarB = pvk.b(pvrVar.d);
                    if (pvkVarB == null) {
                        pvkVarB = pvk.NONE;
                    }
                    if (pvkVarB == pvk.DOWNLOAD_COMPLETE) {
                        pvp pvpVar4 = pvpVar3;
                        Context context = qagVar.a;
                        int iAx = a.ax(pvpVar4.f);
                        if (iAx == 0) {
                            iAx = 1;
                        }
                        if (qsp.am(context, iAx, pvrVar.c, pvpVar4.e, qagVar.b, qagVar.j, false) != null) {
                            return ske.M(pvdVar);
                        }
                    }
                }
                return qagVar.h(list, i + 1, i2);
            }
        }, this.k);
    }

    public final syu i(int i, String str, String str2) {
        Uri uriAm = qsp.am(this.a, i, str, str2, this.b, this.j, false);
        if (uriAm != null) {
            return ske.M(uriAm);
        }
        qbu.c("%s: Failed to get file uri!", "SharedFileManager");
        tfm tfmVarA = pul.a();
        tfmVarA.b = puk.UNABLE_TO_CREATE_FILE_URI_ERROR;
        return ske.L(tfmVarA.c());
    }
}
