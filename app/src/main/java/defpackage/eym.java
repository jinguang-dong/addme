package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eym implements eyn {
    private final ete a;
    private final eyn b;
    private final eyn c;

    public eym(ete eteVar, eyn eynVar, eyn eynVar2) {
        this.a = eteVar;
        this.b = eynVar;
        this.c = eynVar2;
    }

    @Override // defpackage.eyn
    public final esw a(esw eswVar, eqm eqmVar) {
        Drawable drawable = (Drawable) eswVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(exg.g(((BitmapDrawable) drawable).getBitmap(), this.a), eqmVar);
        }
        if (drawable instanceof eyd) {
            return this.c.a(eswVar, eqmVar);
        }
        return null;
    }
}
