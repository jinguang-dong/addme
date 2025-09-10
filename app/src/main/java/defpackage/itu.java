package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itu implements iug {
    public final pmv a;
    private final uhf b;
    private final iud c;
    private final List d;
    private final itw e;

    public itu(uhf uhfVar, iud iudVar, itw itwVar, pmv pmvVar) {
        iudVar.getClass();
        this.b = uhfVar;
        this.c = iudVar;
        this.e = itwVar;
        this.a = pmvVar;
        this.d = new ArrayList();
    }

    @Override // defpackage.iug
    public final syu a(iuh iuhVar) throws Throwable {
        iuhVar.getClass();
        Object obj = this.c.a.get(iuhVar);
        if (obj == null) {
            throw new NullPointerException(a.bz(iuhVar, "An entry must exist for ", "."));
        }
        und undVarJ = ung.j(this.b);
        its itsVar = new its(iuhVar, (iuf) obj, this, null);
        uhg uhgVar = uhg.a;
        if (ung.h(1)) {
            "DEFAULT".toString();
            throw new IllegalArgumentException("DEFAULT start is not supported");
        }
        uuw uuwVar = new uuw(umy.b(undVarJ, uhgVar));
        ung.g(1, itsVar, uuwVar, uuwVar);
        return uuwVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.iue r18, defpackage.uhb r19) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itu.b(iue, uhb):java.lang.Object");
    }

    @Override // defpackage.iug
    public final void c() {
        List listBN;
        List list = this.d;
        synchronized (list) {
            list.size();
        }
        List list2 = this.d;
        synchronized (list2) {
            listBN = ske.bN(list2);
            list2.clear();
        }
        Iterator it = listBN.iterator();
        while (it.hasNext()) {
            ((uol) it.next()).s(new CancellationException("LapReporter.cancel()"));
        }
    }
}
