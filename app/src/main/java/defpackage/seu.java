package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class seu implements Serializable {
    final seo a;
    final rzw b;

    public seu(seo seoVar, rzw rzwVar) {
        this.a = seoVar;
        this.b = rzwVar;
    }

    private Object readResolve() {
        return new sev(this.a, this.b);
    }
}
