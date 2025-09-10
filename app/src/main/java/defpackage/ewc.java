package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewc implements eqo {
    private final eqo a;
    private final Resources b;

    public ewc(Resources resources, eqo eqoVar) {
        eoz.k(resources);
        this.b = resources;
        eoz.k(eqoVar);
        this.a = eqoVar;
    }

    @Override // defpackage.eqo
    public final esw a(Object obj, int i, int i2, eqm eqmVar) {
        return exg.f(this.b, this.a.a(obj, i, i2, eqmVar));
    }

    @Override // defpackage.eqo
    public final boolean b(Object obj, eqm eqmVar) {
        return this.a.b(obj, eqmVar);
    }
}
