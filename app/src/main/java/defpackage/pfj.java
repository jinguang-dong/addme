package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pfj implements Printer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pfj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.util.Printer, java.lang.Object, pbc] */
    @Override // android.util.Printer
    public final void println(String str) {
        int i = this.b;
        ?? r1 = this.a;
        if (i != 0) {
            r1.println("  ".concat(String.valueOf(str)));
        } else {
            r1.f(str);
        }
    }
}
