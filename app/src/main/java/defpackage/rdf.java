package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdf {
    public final rcg a;
    public final Uri b;
    public final Executor c;
    public final sxy d = new sxy();
    public final qas e;
    public final lat f;

    public rdf(rcg rcgVar, qas qasVar, Executor executor) {
        this.a = rcgVar;
        this.b = (Uri) rcgVar.e;
        this.e = qasVar;
        this.f = (lat) rcgVar.a;
        this.c = executor;
    }

    public final syu a() {
        return this.d.b(new gea(this, 16), this.c);
    }

    public final syu b() {
        return this.d.a(new ozi(this, 13), this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rdf) {
            return this.b.equals(((rdf) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
