package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewd implements eqp {
    private final ete a;
    private final eqp b;

    public ewd(ete eteVar, eqp eqpVar) {
        this.a = eteVar;
        this.b = eqpVar;
    }

    @Override // defpackage.eqa
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, eqm eqmVar) {
        return this.b.a(new exg(((BitmapDrawable) ((esw) obj).c()).getBitmap(), this.a, 1), file, eqmVar);
    }

    @Override // defpackage.eqp
    public final int b() {
        return 2;
    }
}
