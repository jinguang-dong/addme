package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfe implements rfo {
    private final List a = new ArrayList();
    private final List b = new ArrayList();

    public final rff a() {
        return new rff(this.a, this.b);
    }

    @Override // defpackage.rfo
    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        charSequence2.getClass();
        f(new rfd((String) charSequence, charSequence2.toString()));
    }

    @Override // defpackage.rfo
    public final void c(CharSequence charSequence, boolean z) {
        f(new rfd((String) charSequence, String.valueOf(z)));
    }

    @Override // defpackage.rfo
    public final void d(CharSequence charSequence, float f) {
        f(new rfd((String) charSequence, String.valueOf(f)));
    }

    @Override // defpackage.rfo
    public final void e(CharSequence charSequence, int i) {
        f(new rfd((String) charSequence, String.valueOf(i)));
    }

    public final void f(rfd rfdVar) {
        this.b.add(rfdVar);
    }

    public final void g(rff rffVar) {
        this.a.add(rffVar);
    }
}
