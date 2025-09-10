package defpackage;

import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class red implements sxi {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ red(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ret] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, rvu] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, reg] */
    @Override // defpackage.sxi
    public final syu a(Object obj) throws Throwable {
        syu syuVar;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                return swz.i(((qas) obj2).a.a(), new qwl(obj2, (Uri) obj, 5, null), sxo.a);
            case 1:
                reh rehVar = (reh) this.a;
                qaq qaqVar = new qaq(rehVar.e);
                return ske.M(rehVar.f.a.a(qaqVar, (tqr) obj));
            case 2:
                rel relVar = (rel) this.a;
                relVar.c((Uri) ske.U(relVar.b), obj);
                return syq.a;
            case 3:
                rel relVar2 = (rel) this.a;
                return ske.M(relVar2.b((Uri) ske.U(relVar2.b)));
            case 4:
                Uri uri = (Uri) obj;
                Uri uriE = qsz.e(uri, ".bak");
                try {
                    lat latVar = ((rel) this.a).g;
                    if (latVar.r(uriE)) {
                        latVar.q(uriE, uri);
                    }
                    return syq.a;
                } catch (IOException e) {
                    return ske.L(e);
                }
            case 5:
                Object obj3 = this.a;
                synchronized (((rel) obj3).e) {
                    syuVar = ((rel) obj3).f;
                }
                return syuVar;
            case 6:
                return ske.M(this.a.apply(obj));
            case 7:
                return ((ren) this.a).b.c();
            case 8:
                return ((ren) this.a).e.a();
            default:
                Object obj4 = this.a;
                ((IOException) obj4).addSuppressed((IOException) obj);
                throw ((Throwable) obj4);
        }
    }
}
