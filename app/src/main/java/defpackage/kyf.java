package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kyf implements kmz {
    private static final sgv a = sgv.g("kyf");
    private final kmz b;
    private final Set c;
    private final kye d;
    private final hzs e;
    private final hzj f;
    private final kyu g;
    private final hxv h;
    private final lat i;
    private final kzn j;
    private final pbn k;

    public kyf(Set set, kmz kmzVar, rwc rwcVar, hzs hzsVar, hzj hzjVar, kyu kyuVar, hxv hxvVar, lat latVar, kzn kznVar, pbn pbnVar) {
        this.b = kmzVar;
        this.c = set;
        this.g = kyuVar;
        this.d = (kye) rwcVar.c();
        this.e = hzsVar;
        this.f = hzjVar;
        this.h = hxvVar;
        this.i = latVar;
        this.j = kznVar;
        this.k = pbnVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kml] */
    private final void d(kmz kmzVar, List list, kmy kmyVar, gga ggaVar) {
        ((sgt) a.b().M(3714)).s("Executing fallback");
        kwp.a(list);
        ggaVar.b.o().f();
        ggaVar.a.h();
        kzn kznVar = this.j;
        kznVar.g = (String) kznVar.b.dL();
        kmzVar.c(kmyVar, ggaVar);
    }

    @Override // defpackage.kmz
    public final owf a() {
        return this.b.a();
    }

    @Override // defpackage.kmz
    public final owf b() {
        return new owi(qpt.cj(ujp.aB(this.c)));
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("fallback", this.b);
        return rwbVarW.toString();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.kmz
    public final void c(defpackage.kmy r38, defpackage.gga r39) {
        /*
            Method dump skipped, instructions count: 3361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyf.c(kmy, gga):void");
    }
}
