package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tap implements uem {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    private tam c = null;

    public tap(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final tam a() {
        if (this.c == null) {
            Context context = this.a;
            this.c = new tam(context.getPackageName(), this.b);
        }
        return this.c;
    }
}
