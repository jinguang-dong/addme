package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qdi implements puq {
    public final String a;
    public final String b;
    public final Executor c;
    public final rwc d;
    public final boolean e;
    private final rww f;
    private final Uri g;
    private final qat h;

    public qdi(qdh qdhVar) {
        String str = qdhVar.f;
        this.a = str;
        String str2 = qdhVar.g;
        this.b = str2;
        this.c = qdhVar.b;
        this.d = qdhVar.c;
        this.f = qdhVar.e;
        this.h = qdhVar.i;
        this.g = new Uri.Builder().scheme("asset").appendPath("mdd").appendPath(str).appendPath(str2).build();
        this.e = qdhVar.h;
    }

    public static final syu b(List list, pvu pvuVar, rwc rwcVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pud pudVar = (pud) it.next();
            sbr sbrVar = new sbr();
            for (puc pucVar : pudVar.f) {
                Uri uri = Uri.parse(pucVar.d);
                uri.getScheme().getClass();
                a.I(uri.getScheme().equals("asset"));
                String str = pucVar.c;
                uri.getClass();
                sbrVar.f(str, new pur(uri));
            }
            rvk rvkVar = rvk.a;
            int i = sbp.d;
            sbp sbpVar = sex.a;
            sbpVar.getClass();
            String str2 = pudVar.c;
            str2.getClass();
            long j = pudVar.g;
            String str3 = pudVar.h;
            str3.getClass();
            arrayList.add(pvuVar.d(new puw(str2, j, str3, rvkVar, sbpVar, sbrVar.b(), rwcVar)));
        }
        return qsp.P(arrayList).f(new qbl(3), sxo.a);
    }

    @Override // defpackage.puq
    public final syu a(pvu pvuVar) {
        int i = qbu.a;
        Uri uri = this.g;
        rvk rvkVar = rvk.a;
        syu syuVarD = this.h.d(uri.buildUpon().appendPath("manifest_config.pb").build());
        qaz qazVar = new qaz(puk.EMBEDDED_ASSET_MANIFEST_POPULATOR_PARSE_MANIFEST_FILE_ERROR, 12);
        Executor executor = this.c;
        syu syuVarN = qsz.n(qsz.k(syuVarD, Exception.class, qazVar, executor), new qaz(this, 11), executor);
        qdp qdpVarD = qdp.e((syu) ((rwz) this.f).a).d(Exception.class, new qaz(puk.EMBEDDED_ASSET_MANIFEST_POPULATOR_FETCH_ACCOUNTS_ERROR, 12), executor);
        return qsz.m(qsp.Q(syuVarN, qdpVarD).g(new qdg(this, syuVarN, pvuVar, qdpVarD, rvkVar, 0), executor), new pzw(11), executor);
    }
}
