package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmy implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ cmx c;
    final /* synthetic */ int d;

    public cmy(String str, Context context, cmx cmxVar, int i) {
        this.a = str;
        this.b = context;
        this.c = cmxVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return cnb.b(this.a, this.b, ebn.j(new Object[]{this.c}), this.d);
    }
}
